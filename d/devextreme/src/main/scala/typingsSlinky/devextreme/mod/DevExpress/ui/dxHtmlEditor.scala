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
  /** @name dxHtmlEditor.clearHistory() */
  def clearHistory(): Unit = js.native
  /** @name dxHtmlEditor.delete(index, length) */
  def delete(index: Double, length: Double): Unit = js.native
  /** @name dxHtmlEditor.format(formatName, formatValue) */
  def format(
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formatName, formatValue) */
  def formatLine(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formats) */
  def formatLine(index: Double, length: Double, formats: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formatName, formatValue) */
  def formatText(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formats) */
  def formatText(index: Double, length: Double, formats: js.Any): Unit = js.native
  /** @name dxHtmlEditor.get(componentPath) */
  def get(componentPath: String): js.Any = js.native
  /** @name dxHtmlEditor.getFormat(index, length) */
  def getFormat(index: Double, length: Double): js.Any = js.native
  /** @name dxHtmlEditor.getLength() */
  def getLength(): Double = js.native
  /** @name dxHtmlEditor.getQuillInstance() */
  def getQuillInstance(): js.Any = js.native
  /** @name dxHtmlEditor.getSelection() */
  def getSelection(): js.Any = js.native
  /** @name dxHtmlEditor.insertEmbed(index, type, config) */
  def insertEmbed(index: Double, `type`: String, config: js.Any): Unit = js.native
  /** @name dxHtmlEditor.insertText(index, text, formats) */
  def insertText(index: Double, text: String, formats: js.Any): Unit = js.native
  /** @name dxHtmlEditor.redo() */
  def redo(): Unit = js.native
  /** @name dxHtmlEditor.register(components) */
  def register(modules: js.Any): Unit = js.native
  /** @name dxHtmlEditor.removeFormat(index, length) */
  def removeFormat(index: Double, length: Double): Unit = js.native
  /** @name dxHtmlEditor.setSelection(index, length) */
  def setSelection(index: Double, length: Double): Unit = js.native
  /** @name dxHtmlEditor.undo() */
  def undo(): Unit = js.native
}

