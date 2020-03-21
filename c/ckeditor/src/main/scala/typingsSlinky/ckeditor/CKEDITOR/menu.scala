package typingsSlinky.ckeditor.CKEDITOR

import typingsSlinky.ckeditor.AnonElement
import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.dom.elementPath
import typingsSlinky.ckeditor.CKEDITOR.dom.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.menu")
@js.native
class menu () extends js.Object {
  def add(item: js.Any): Unit = js.native
  def addListener(
    listenerFn: js.Function3[/* startElement */ element, /* selection */ selection, /* path */ elementPath, _]
  ): Unit = js.native
  def findItemByCommandName(commandName: String): AnonElement = js.native
  def hide(): Unit = js.native
  def hide(returnFocus: Boolean): Unit = js.native
  def removeAll(): Unit = js.native
  def show(offsetParent: element): Unit = js.native
  def show(offsetParent: element, corner: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def show(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
}

