package typingsSlinky.restify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainOptions extends js.Object {
  var onceNext: js.UndefOr[Boolean] = js.native
  var strictNext: js.UndefOr[Boolean] = js.native
}

object ChainOptions {
  @scala.inline
  def apply(): ChainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainOptions]
  }
  @scala.inline
  implicit class ChainOptionsOps[Self <: ChainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnceNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnceNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onceNext")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictNext")(js.undefined)
        ret
    }
  }
  
}

