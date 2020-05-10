package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonConfig extends js.Object {
  /**
    * @default: 'active'
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * @default: 'Click'
    */
  var toggleEvent: js.UndefOr[String] = js.native
}

object IButtonConfig {
  @scala.inline
  def apply(): IButtonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonConfig]
  }
  @scala.inline
  implicit class IButtonConfigOps[Self <: IButtonConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleEvent")(js.undefined)
        ret
    }
  }
  
}

