package typingsSlinky.ckeditor.CKEDITOR.plugins.notification

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait area extends js.Object {
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  val notifications: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification] = js.native
  def add(notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification): Unit = js.native
  def remove(notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification): Unit = js.native
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
  @scala.inline
  implicit class areaOps[Self <: area] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEditor(value: editor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

