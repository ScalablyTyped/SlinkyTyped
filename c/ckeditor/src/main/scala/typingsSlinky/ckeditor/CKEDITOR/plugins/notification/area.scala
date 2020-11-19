package typingsSlinky.ckeditor.CKEDITOR.plugins.notification

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait area extends js.Object {
  
  def add(notification: typingsSlinky.ckeditor.CKEDITOR.plugins.notification): Unit = js.native
  
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  
  val notifications: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification] = js.native
  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEditor(value: editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsVarargs(value: typingsSlinky.ckeditor.CKEDITOR.plugins.notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[typingsSlinky.ckeditor.CKEDITOR.plugins.notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: typingsSlinky.ckeditor.CKEDITOR.plugins.notification => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
