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
import typingsSlinky.devextreme.devextremeStrings.deleteColumn
import typingsSlinky.devextreme.devextremeStrings.deleteRow
import typingsSlinky.devextreme.devextremeStrings.deleteTable
import typingsSlinky.devextreme.devextremeStrings.font
import typingsSlinky.devextreme.devextremeStrings.header
import typingsSlinky.devextreme.devextremeStrings.image
import typingsSlinky.devextreme.devextremeStrings.increaseIndent
import typingsSlinky.devextreme.devextremeStrings.insertColumnLeft
import typingsSlinky.devextreme.devextremeStrings.insertColumnRight
import typingsSlinky.devextreme.devextremeStrings.insertRowAbove
import typingsSlinky.devextreme.devextremeStrings.insertRowBelow
import typingsSlinky.devextreme.devextremeStrings.insertTable
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.link
import typingsSlinky.devextreme.devextremeStrings.orderedList
import typingsSlinky.devextreme.devextremeStrings.redo
import typingsSlinky.devextreme.devextremeStrings.separator
import typingsSlinky.devextreme.devextremeStrings.size
import typingsSlinky.devextreme.devextremeStrings.strike
import typingsSlinky.devextreme.devextremeStrings.subscript
import typingsSlinky.devextreme.devextremeStrings.superscript
import typingsSlinky.devextreme.devextremeStrings.underline
import typingsSlinky.devextreme.devextremeStrings.undo
import typingsSlinky.devextreme.devextremeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditorToolbarItem extends dxToolbarItem {
  
  /**
    * [descr:dxHtmlEditorToolbarItem.formatName]
    */
  var formatName: js.UndefOr[
    background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | String
  ] = js.native
  
  /**
    * [descr:dxHtmlEditorToolbarItem.formatValues]
    */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatName(
      value: background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | String
    ): Self = this.set("formatName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatName: Self = this.set("formatName", js.undefined)
    
    @scala.inline
    def setFormatValuesVarargs(value: (String | Double | Boolean)*): Self = this.set("formatValues", js.Array(value :_*))
    
    @scala.inline
    def setFormatValues(value: js.Array[String | Double | Boolean]): Self = this.set("formatValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatValues: Self = this.set("formatValues", js.undefined)
  }
}
