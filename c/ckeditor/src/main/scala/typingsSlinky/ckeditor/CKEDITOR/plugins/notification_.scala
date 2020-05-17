package typingsSlinky.ckeditor.CKEDITOR.plugins

import typingsSlinky.ckeditor.CKEDITOR.dom.element
import typingsSlinky.ckeditor.CKEDITOR.editor
import typingsSlinky.ckeditor.CKEDITOR.plugins.notification.`type`
import typingsSlinky.ckeditor.CKEDITOR.plugins.notification.area
import typingsSlinky.ckeditor.CKEDITOR.plugins.notification.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait notification_ extends js.Object {
  val area: typingsSlinky.ckeditor.CKEDITOR.plugins.notification.area = js.native
  val duration: Double = js.native
  val editor: typingsSlinky.ckeditor.CKEDITOR.editor = js.native
  val element: typingsSlinky.ckeditor.CKEDITOR.dom.element = js.native
  val id: Double = js.native
  val message: String = js.native
  val progress: Double = js.native
  val `type`: typingsSlinky.ckeditor.CKEDITOR.plugins.notification.`type` = js.native
  def hide(): Unit = js.native
  def isVisible(): Boolean = js.native
  def show(): Unit = js.native
  def update(options: updateOptions): Unit = js.native
}

object notification_ {
  @scala.inline
  def apply(
    area: area,
    duration: Double,
    editor: editor,
    element: element,
    hide: () => Unit,
    id: Double,
    isVisible: () => Boolean,
    message: String,
    progress: Double,
    show: () => Unit,
    `type`: `type`,
    update: updateOptions => Unit
  ): notification_ = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), id = id.asInstanceOf[js.Any], isVisible = js.Any.fromFunction0(isVisible), message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[notification_]
  }
  @scala.inline
  implicit class notification_Ops[Self <: notification_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: area): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
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
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: updateOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

