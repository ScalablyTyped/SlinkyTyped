package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionOptions[C /* <: IClient */] extends js.Object {
  var direct: js.UndefOr[Boolean] = js.native
  var onLost: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ ILostContext[C], Unit]] = js.native
}

object IConnectionOptions {
  @scala.inline
  def apply[C](): IConnectionOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionOptions[C]]
  }
  @scala.inline
  implicit class IConnectionOptionsOps[Self[c] <: IConnectionOptions[c], C] (val x: Self[C]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[C] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[C] with Other]
    @scala.inline
    def withDirect(value: Boolean): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirect: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direct")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLost(value: (/* err */ js.Any, /* e */ ILostContext[C]) => Unit): Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLost")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLost: Self[C] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLost")(js.undefined)
        ret
    }
  }
  
}

