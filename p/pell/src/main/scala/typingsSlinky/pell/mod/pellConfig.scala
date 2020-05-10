package typingsSlinky.pell.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pellConfig[T /* <: HTMLElement */] extends js.Object {
  var actions: js.Array[pellAction] = js.native
  var classes: js.UndefOr[pellClasses] = js.native
  var defaultParagraphSeparator: js.UndefOr[String] = js.native
  var element: T = js.native
  var styleWithCSS: js.UndefOr[Boolean] = js.native
  def onChange(html: String): Unit = js.native
}

object pellConfig {
  @scala.inline
  def apply[T](actions: js.Array[pellAction], element: T, onChange: String => Unit): pellConfig[T] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[pellConfig[T]]
  }
  @scala.inline
  implicit class pellConfigOps[Self[t] <: pellConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActions(value: js.Array[pellAction]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: String => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClasses(value: pellClasses): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultParagraphSeparator(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParagraphSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultParagraphSeparator: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParagraphSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleWithCSS(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleWithCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleWithCSS: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleWithCSS")(js.undefined)
        ret
    }
  }
  
}

