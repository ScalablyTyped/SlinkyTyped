package typingsSlinky.jupyterlabApputils.inputdialogMod.InputDialog

import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for item selection input dialogs
  */
@js.native
trait IItemOptions extends IOptions {
  /**
    * Default choice
    *
    * If the list is editable a string with a default value can be provided
    * otherwise the index of the default choice should be given.
    */
  var current: js.UndefOr[Double | String] = js.native
  /**
    * Is the item editable?
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * List of choices
    */
  var items: js.Array[String] = js.native
  /**
    * Placeholder text for editable input
    */
  var placeholder: js.UndefOr[String] = js.native
}

object IItemOptions {
  @scala.inline
  def apply(items: js.Array[String], title: Header): IItemOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemOptions]
  }
  @scala.inline
  implicit class IItemOptionsOps[Self <: IItemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
  }
  
}

