package typingsSlinky.fluxxor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreSpec extends js.Object {
  var actions: js.UndefOr[js.Any] = js.native
  var initialize: js.UndefOr[
    js.Function2[/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object], Unit]
  ] = js.native
}

object StoreSpec {
  @scala.inline
  def apply(): StoreSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSpec]
  }
  @scala.inline
  implicit class StoreSpecOps[Self <: StoreSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: (/* instance */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
  }
  
}

