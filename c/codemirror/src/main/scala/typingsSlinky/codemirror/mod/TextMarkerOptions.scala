package typingsSlinky.codemirror.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMarkerOptions extends js.Object {
  /** When set to true (default is false), adding this marker will create an event in the undo history that can be individually undone(clearing the marker). */
  var addToHistory: js.UndefOr[Boolean] = js.native
  /** Atomic ranges act as a single unit when cursor movement is concerned — i.e. it is impossible to place the cursor inside of them.
    In atomic ranges, inclusiveLeft and inclusiveRight have a different meaning — they will prevent the cursor from being placed
    respectively directly before and directly after the range. */
  var atomic: js.UndefOr[Boolean] = js.native
  /** Assigns a CSS class to the marked stretch of text. */
  var className: js.UndefOr[String] = js.native
  /** When enabled, will cause the mark to clear itself whenever the cursor enters its range.
    This is mostly useful for text - replacement widgets that need to 'snap open' when the user tries to edit them.
    The "clear" event fired on the range handle can be used to be notified when this happens. */
  var clearOnEnter: js.UndefOr[Boolean] = js.native
  /** Determines whether the mark is automatically cleared when it becomes empty. Default is true. */
  var clearWhenEmpty: js.UndefOr[Boolean] = js.native
  /** Collapsed ranges do not show up in the display.Setting a range to be collapsed will automatically make it atomic. */
  var collapsed: js.UndefOr[Boolean] = js.native
  /** A string of CSS to be applied to the covered text. For example "color: #fe3". */
  var css: js.UndefOr[String] = js.native
  /** Equivalent to startStyle, but for the rightmost span. */
  var endStyle: js.UndefOr[String] = js.native
  /** When replacedWith is given, this determines whether the editor will
    * capture mouse and drag events occurring in this widget. Default is
    * false—the events will be left alone for the default browser handler,
    * or specific handlers on the widget, to capture. */
  var handleMouseEvents: js.UndefOr[Boolean] = js.native
  /** Determines whether text inserted on the left of the marker will end up inside or outside of it. */
  var inclusiveLeft: js.UndefOr[Boolean] = js.native
  /** Like inclusiveLeft , but for the right side. */
  var inclusiveRight: js.UndefOr[Boolean] = js.native
  /** A read - only span can, as long as it is not cleared, not be modified except by calling setValue to reset the whole document.
    Note: adding a read - only span currently clears the undo history of the editor,
    because existing undo events being partially nullified by read - only spans would corrupt the history (in the current implementation). */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** Use a given node to display this range.Implies both collapsed and atomic.
    The given DOM node must be an inline element(as opposed to a block element). */
  var replacedWith: js.UndefOr[HTMLElement] = js.native
  /** When the target document is linked to other documents, you can set shared to true to make the marker appear in all documents.
    By default, a marker appears only in its target document. */
  var shared: js.UndefOr[Boolean] = js.native
  /** Can be used to specify an extra CSS class to be applied to the leftmost span that is part of the marker. */
  var startStyle: js.UndefOr[String] = js.native
  /** When given, will give the nodes created for this span a HTML title attribute with the given value. */
  var title: js.UndefOr[String] = js.native
}

object TextMarkerOptions {
  @scala.inline
  def apply(): TextMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextMarkerOptions]
  }
  @scala.inline
  implicit class TextMarkerOptionsOps[Self <: TextMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddToHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withAtomic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtomic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomic")(js.undefined)
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
    def withClearOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withClearWhenEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWhenEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearWhenEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearWhenEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withEndStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusiveLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusiveLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withInclusiveRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclusiveRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inclusiveRight")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacedWith(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacedWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacedWith")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withStartStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

