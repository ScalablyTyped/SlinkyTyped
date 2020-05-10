package typingsSlinky.markitup.MarkItUp

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkupSet extends js.Object {
  /**
    * Function to be called just after a markup insertion. If a global afterInsert callback is already defined this function is fired before.
    */
  var afterInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Function to be called after a multiline markup insertion.
    */
  var afterMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Returns true if the Alt key is pressed when the callback is fired.
    */
  var altKey: js.UndefOr[Boolean] = js.native
  /**
    * Function to be called just before a markup insertion. If a global beforeInsert callback is already defined this function is fired just after.
    */
  var beforeInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Function to be called before a multiline markup insertion.
    */
  var beforeMultiInsert: js.UndefOr[js.Function1[/* h */ MarkupSet, String]] = js.native
  /**
    * Returns the position of the selection.
    */
  var caretPosition: js.UndefOr[Double] = js.native
  /**
    * Classname to be applied to this very button.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Text to be added after a whole block. Accepts functions.
    */
  var closeBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Markup to be added after selection. Accepts functions.
    */
  var closeWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Returns true if the Control key is pressed when the callback is fired.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.native
  /**
    * Open a dropdown menu with another button set.
    */
  var dropMenu: js.UndefOr[js.Array[MarkupSet]] = js.native
  /**
    * Keep (true) or not (false) the default behaviour of the key.
    */
  var keepDefault: js.UndefOr[Boolean] = js.native
  /**
    * Shortcut key to be applied to the button. Ctrl+key trigger the action of a button.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * If a multi-line edition is trigged (Ctrl + Shift + click). This property return the number of the line being processed.
    */
  var line: js.UndefOr[Double] = js.native
  /**
    * Set whether the tags has to be inserted at each line or on the whole selected block.
    */
  var multiline: js.UndefOr[Boolean] = js.native
  /**
    * Button name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Text to be added before a whole block. Accepts functions.
    */
  var openBlockWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Markup to be added before selection. Accepts functions.
    */
  var openWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Placeholder text to be inserted if no text is selected by the user.
    */
  var placeHolder: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Text to be added in place of the cursor or selection. Accepts functions.
    */
  var replaceWith: js.UndefOr[String | (js.Function1[/* h */ this.type, String])] = js.native
  /**
    * Returns the position of the scrollbar.
    */
  var scrollPosition: js.UndefOr[Double] = js.native
  /**
    * Returns the selection.
    */
  var selection: js.UndefOr[String] = js.native
  /** Not documented on the markitup site, but present in the tests */
  var separator: js.UndefOr[String] = js.native
  /**
    * Returns true if the Shift key is pressed when the callback is fired.
    */
  var shiftKey: js.UndefOr[Boolean] = js.native
  /**
    * Returns the textarea object.
    */
  var textarea: js.UndefOr[HTMLElement] = js.native
}

object MarkupSet {
  @scala.inline
  def apply(): MarkupSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupSet]
  }
  @scala.inline
  implicit class MarkupSetOps[Self <: MarkupSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMultiInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMultiInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterMultiInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMultiInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withAltKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altKey")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeMultiInsert(value: /* h */ MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMultiInsert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeMultiInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMultiInsert")(js.undefined)
        ret
    }
    @scala.inline
    def withCaretPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaretPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caretPosition")(js.undefined)
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
    def withCloseBlockWithFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBlockWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBlockWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseBlockWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeBlockWith")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseWithFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseWith(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeWith")(js.undefined)
        ret
    }
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtrlKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDropMenu(value: js.Array[MarkupSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenBlockWithFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openBlockWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenBlockWith(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openBlockWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenBlockWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openBlockWith")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenWithFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenWith(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openWith")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolderFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceWithFunction1(value: MarkupSet => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceWith(value: String | (js.Function1[MarkupSet, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTextarea(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextarea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textarea")(js.undefined)
        ret
    }
  }
  
}

