package typingsSlinky.blueprintjsCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThrottledReactEventOptions extends js.Object {
  var preventDefault: js.UndefOr[Boolean] = js.native
}

object IThrottledReactEventOptions {
  @scala.inline
  def apply(): IThrottledReactEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThrottledReactEventOptions]
  }
  @scala.inline
  implicit class IThrottledReactEventOptionsOps[Self <: IThrottledReactEventOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
  }
  
}

