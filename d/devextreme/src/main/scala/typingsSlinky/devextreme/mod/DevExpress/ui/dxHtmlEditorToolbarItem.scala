package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.alignCenter
import typingsSlinky.devextreme.devextremeStrings.alignJustify
import typingsSlinky.devextreme.devextremeStrings.alignLeft
import typingsSlinky.devextreme.devextremeStrings.alignRight
import typingsSlinky.devextreme.devextremeStrings.background
import typingsSlinky.devextreme.devextremeStrings.blockquote
import typingsSlinky.devextreme.devextremeStrings.bold
import typingsSlinky.devextreme.devextremeStrings.bulletList
import typingsSlinky.devextreme.devextremeStrings.clear
import typingsSlinky.devextreme.devextremeStrings.codeBlock
import typingsSlinky.devextreme.devextremeStrings.color
import typingsSlinky.devextreme.devextremeStrings.decreaseIndent
import typingsSlinky.devextreme.devextremeStrings.header
import typingsSlinky.devextreme.devextremeStrings.image
import typingsSlinky.devextreme.devextremeStrings.increaseIndent
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.link
import typingsSlinky.devextreme.devextremeStrings.orderedList
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.strike
import typingsSlinky.devextreme.devextremeStrings.subscript
import typingsSlinky.devextreme.devextremeStrings.superscript
import typingsSlinky.devextreme.devextremeStrings.underline
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  /** Specifies the predefined item that this object customizes or a format with multiple choices. */
  var formatName: js.UndefOr[
    background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
  ] = js.native
  /** Specifies values for a format with multiple choices. Should be used with the formatName. */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.native
}

object dxHtmlEditorToolbarItem {
  @scala.inline
  def apply(): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
  @scala.inline
  implicit class dxHtmlEditorToolbarItemOps[Self <: dxHtmlEditorToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatName(
      value: background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatName")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatValues(value: js.Array[String | Double | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatValues")(js.undefined)
        ret
    }
  }
  
}

