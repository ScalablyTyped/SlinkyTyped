package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
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
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbar extends js.Object {
  /** Specifies the container in which to place the toolbar. */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** Configures toolbar items. These items allow users to format text and execute commands. */
  var items: js.UndefOr[
    js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ]
  ] = js.undefined
}

object dxHtmlEditorToolbar {
  @scala.inline
  def apply(
    container: String | Element | JQuery = null,
    items: js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ] = null
  ): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
}

