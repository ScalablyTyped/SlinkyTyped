package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.`code-block`
import typingsSlinky.devextreme.devextremeStrings.align
import typingsSlinky.devextreme.devextremeStrings.background
import typingsSlinky.devextreme.devextremeStrings.blockquote
import typingsSlinky.devextreme.devextremeStrings.bold
import typingsSlinky.devextreme.devextremeStrings.color
import typingsSlinky.devextreme.devextremeStrings.font
import typingsSlinky.devextreme.devextremeStrings.header
import typingsSlinky.devextreme.devextremeStrings.indent
import typingsSlinky.devextreme.devextremeStrings.italic
import typingsSlinky.devextreme.devextremeStrings.link
import typingsSlinky.devextreme.devextremeStrings.list
import typingsSlinky.devextreme.devextremeStrings.script
import typingsSlinky.devextreme.devextremeStrings.size
import typingsSlinky.devextreme.devextremeStrings.strike
import typingsSlinky.devextreme.devextremeStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditor extends Editor {
  /** Clears the history of changes. */
  def clearHistory(): Unit = js.native
  /** Deletes content from the given range. */
  def delete(index: Double, length: Double): Unit = js.native
  /** Applies a format to the selected content. Cannot be used with embedded formats. */
  def format(
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** Applies a single block format to all lines in the given range. */
  def formatLine(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** Applies several block formats to all lines in the given range. */
  def formatLine(index: Double, length: Double, formats: js.Any): Unit = js.native
  /** Applies a single text format to all characters in the given range. */
  def formatText(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** Applies several text formats to all characters in the given range. */
  def formatText(index: Double, length: Double, formats: js.Any): Unit = js.native
  /** Gets a format, module, or Parchment. */
  def get(componentPath: String): js.Any = js.native
  /** Gets formats applied to the content in the specified range. */
  def getFormat(index: Double, length: Double): js.Any = js.native
  /** Gets the entire content's length. */
  def getLength(): Double = js.native
  /** Gets Quill's instance. */
  def getQuillInstance(): js.Any = js.native
  /** Gets the selected content's position and length. */
  def getSelection(): js.Any = js.native
  /** Inserts an embedded content at the specified position. */
  def insertEmbed(index: Double, `type`: String, config: js.Any): Unit = js.native
  /** Inserts formatted text at the specified position. Used with all formats except embedded. */
  def insertText(index: Double, text: String, formats: js.Any): Unit = js.native
  /** Reapplies the most recent undone change. Repeated calls reapply preceding undone changes. */
  def redo(): Unit = js.native
  /** Registers custom formats and modules. */
  def register(modules: js.Any): Unit = js.native
  /** Removes all formatting and embedded content from the specified range. */
  def removeFormat(index: Double, length: Double): Unit = js.native
  /** Selects and highlights content in the specified range. */
  def setSelection(index: Double, length: Double): Unit = js.native
  /** Reverses the most recent change. Repeated calls reverse preceding changes. */
  def undo(): Unit = js.native
}

