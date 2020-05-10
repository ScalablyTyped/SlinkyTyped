package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownConfig extends js.Object {
  /**
    * @default: 'uib-dropdown-open'
    */
  var appendToOpenClass: js.UndefOr[String] = js.native
  /**
    * @default: 'open'
    */
  var openClass: js.UndefOr[String] = js.native
}

object IDropdownConfig {
  @scala.inline
  def apply(): IDropdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownConfig]
  }
  @scala.inline
  implicit class IDropdownConfigOps[Self <: IDropdownConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendToOpenClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToOpenClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendToOpenClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToOpenClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openClass")(js.undefined)
        ret
    }
  }
  
}

