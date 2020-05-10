package typingsSlinky.reactToolbox.listCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCheckboxTheme extends js.Object {
  /**
    * Used as a wrapper class for the subheader element.
    */
  var checkbox: js.UndefOr[String] = js.native
  /**
    * Added to the checkbox element.
    */
  var checkboxItem: js.UndefOr[String] = js.native
  /**
    * Added to the inner content if its a disabled item.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the inner content of a list item.
    */
  var item: js.UndefOr[String] = js.native
}

object ListCheckboxTheme {
  @scala.inline
  def apply(): ListCheckboxTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCheckboxTheme]
  }
  @scala.inline
  implicit class ListCheckboxThemeOps[Self <: ListCheckboxTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
  }
  
}

