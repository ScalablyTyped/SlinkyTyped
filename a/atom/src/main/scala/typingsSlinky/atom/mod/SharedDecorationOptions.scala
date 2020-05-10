package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.after
import typingsSlinky.atom.atomStrings.before
import typingsSlinky.atom.atomStrings.head
import typingsSlinky.atom.atomStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDecorationOptions extends js.Object {
  /**
    *  Only applicable to decorations of type overlay. Determines whether the decoration
    *  adjusts its horizontal or vertical position to remain fully visible when it would
    *  otherwise overflow the editor. Defaults to true.
    */
  var avoidOverflow: js.UndefOr[Boolean] = js.native
  /**
    *  This CSS class will be applied to the decorated line number, line, highlight,
    *  or overlay.
    */
  var `class`: js.UndefOr[String] = js.native
  /**
    *  An HTMLElement or a model Object with a corresponding view registered. Only
    *  applicable to the gutter, overlay and block types.
    */
  var item: js.UndefOr[js.Object] = js.native
  /**
    *  If false, the decoration will be applied to the last row of a non-empty
    *  range, even if it ends at column 0. Defaults to true. Only applicable
    *  to the gutter, line, and line-number decoration types.
    */
  var omitEmptyLastRow: js.UndefOr[Boolean] = js.native
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyEmpty: js.UndefOr[Boolean] = js.native
  /**
    *  If true, the decoration will only be applied to the head of the DisplayMarker.
    *  Only applicable to the line and line-number types.
    */
  var onlyHead: js.UndefOr[Boolean] = js.native
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is non-empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyNonEmpty: js.UndefOr[Boolean] = js.native
  /**
    *  Only applicable to decorations of type block. Controls where the view is
    *  positioned relative to other block decorations at the same screen row.
    *  If unspecified, block decorations render oldest to newest.
    */
  var order: js.UndefOr[Double] = js.native
  /**
    *  Only applicable to decorations of type overlay and block. Controls where the
    *  view is positioned relative to the TextEditorMarker. Values can be
    *  'head' (the default) or 'tail' for overlay decorations, and 'before' (the default)
    *  or 'after' for block decorations.
    */
  var position: js.UndefOr[head | tail | before | after] = js.native
  /**
    *  An Object containing CSS style properties to apply to the relevant DOM
    *  node. Currently this only works with a type of cursor or text.
    */
  var style: js.UndefOr[js.Object] = js.native
}

object SharedDecorationOptions {
  @scala.inline
  def apply(): SharedDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDecorationOptions]
  }
  @scala.inline
  implicit class SharedDecorationOptionsOps[Self <: SharedDecorationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Object): Self = {
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
    @scala.inline
    def withOmitEmptyLastRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitEmptyLastRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitEmptyLastRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitEmptyLastRow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyHead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyHead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyHead")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyNonEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyNonEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyNonEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyNonEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: head | tail | before | after): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

