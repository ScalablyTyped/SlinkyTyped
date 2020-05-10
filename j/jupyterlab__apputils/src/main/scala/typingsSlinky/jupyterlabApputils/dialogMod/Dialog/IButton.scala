package typingsSlinky.jupyterlabApputils.dialogMod.Dialog

import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.default
import typingsSlinky.jupyterlabApputils.jupyterlabApputilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to make a button item.
  */
@js.native
trait IButton extends js.Object {
  /**
    * The dialog action to perform when the button is clicked.
    */
  var accept: Boolean = js.native
  /**
    * The caption for the button.
    */
  var caption: String = js.native
  /**
    * The extra class name for the button.
    */
  var className: String = js.native
  /**
    * The button display type.
    */
  var displayType: default | warn = js.native
  /**
    * The icon class for the button.
    */
  var iconClass: String = js.native
  /**
    * The icon label for the button.
    */
  var iconLabel: String = js.native
  /**
    * The label for the button.
    */
  var label: String = js.native
}

object IButton {
  @scala.inline
  def apply(
    accept: Boolean,
    caption: String,
    className: String,
    displayType: default | warn,
    iconClass: String,
    iconLabel: String,
    label: String
  ): IButton = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
  @scala.inline
  implicit class IButtonOps[Self <: IButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccept(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayType(value: default | warn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

