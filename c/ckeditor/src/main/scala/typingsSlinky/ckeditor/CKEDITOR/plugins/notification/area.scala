package typingsSlinky.ckeditor.CKEDITOR.plugins.notification

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait area extends js.Object {
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element
  val notifications: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification]
  def add(notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification): Unit
  def remove(notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification): Unit
}

object area {
  @scala.inline
  def apply(
    add: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit,
    editor: editor,
    element: element,
    notifications: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification],
    remove: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit
  ): area = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[area]
  }
}

