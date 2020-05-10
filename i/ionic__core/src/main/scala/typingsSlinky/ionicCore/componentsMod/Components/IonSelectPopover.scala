package typingsSlinky.ionicCore.componentsMod.Components

import typingsSlinky.ionicCore.selectPopoverInterfaceMod.SelectPopoverOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSelectPopover extends js.Object {
  /**
    * Header text for the popover
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Text for popover body
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Array of options for the popover
    */
  var options: js.Array[SelectPopoverOption] = js.native
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[String] = js.native
}

object IonSelectPopover {
  @scala.inline
  def apply(options: js.Array[SelectPopoverOption]): IonSelectPopover = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectPopover]
  }
  @scala.inline
  implicit class IonSelectPopoverOps[Self <: IonSelectPopover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[SelectPopoverOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withSubHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subHeader")(js.undefined)
        ret
    }
  }
  
}

