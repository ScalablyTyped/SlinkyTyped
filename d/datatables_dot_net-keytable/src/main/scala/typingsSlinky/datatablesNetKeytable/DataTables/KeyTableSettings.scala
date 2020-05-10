package typingsSlinky.datatablesNetKeytable.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyTableSettings extends js.Object {
  /*
    * Allow KeyTable's focus to be blurred (removed) from a table
    *
    * When set to true this option allows the table to lose focus (i.e. to be blurred),
    * while false will not allow the table to lose focus.
    */
  var blurable: js.UndefOr[Boolean] = js.native
  /*
    * Set the class name used for the focused cell
    *
    * The class name to be added and removed from cells as they gain and loose focus.
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Enable / disable clipboard interaction with KeyTable
    *
    * A boolean flag that can optionally be used to disable KeyTables' clipboard interaction.
    */
  var clipboard: js.UndefOr[Boolean] = js.native
  /*
    * Set the orthogonal data point for the data to copy to clipboard.
    */
  var clipboardOrthogonal: js.UndefOr[String] = js.native
  /*
    * Select the columns that can gain focus
    *
    * The columns that can gain focus. This accepts all of the options of column-selector
    * such as class name selector, jQuery pseudo selects and column index selectors.
    */
  var columns: js.UndefOr[js.Any] = js.native
  /*
    * Control if editing should be activated immediately upon focus
    *
    * true to enable editing on focus, false to disable.
    */
  var editOnFocus: js.UndefOr[Boolean] = js.native
  /*
    * Attach an Editor instance for Excel like editing
    *
    * The Editor instance to use for editing of the table
    */
  var editor: js.UndefOr[js.Any] = js.native
  /*
    * Cell to receive initial focus in the table
    *
    * The cell that will receive focus when the table is initialised. This accepts all of
    * the options of cell-selector such as class name selector, jQuery pseudo selects and
    * cell index selectors.
    */
  var focus: js.UndefOr[js.Any] = js.native
  /*
    * Limit the keys that KeyTable will listen for and take action on
    *
    * As null KeyTable will listen for all key presses, regardless of what key is pressed.
    * an array you can limit the keys that KeyTable will take action on to just the key
    * codes given in the array.
    */
  var keys: js.UndefOr[js.Array[Double] | Null] = js.native
  /*
    * Set the table's tab index for when it will receive focus
    *
    * The tab index for the table. Like all other tab indexes, this can be -1 to disallow
    * tabbing into the table.
    */
  var tabIndex: js.UndefOr[Double] = js.native
}

object KeyTableSettings {
  @scala.inline
  def apply(): KeyTableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyTableSettings]
  }
  @scala.inline
  implicit class KeyTableSettingsOps[Self <: KeyTableSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurable")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboardOrthogonal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardOrthogonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboardOrthogonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboardOrthogonal")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withEditOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
    @scala.inline
    def withKeysNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(null)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
  }
  
}

