package typingsSlinky.reactTagsinput.mod

import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactTagsinput.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderInputProps[Tag] extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: Tag = js.native
  def addTag(tag: Tag): Unit = js.native
  def onChange(e: ChangeEvent[Value]): Unit = js.native
  def ref(r: js.Any): Unit = js.native
}

object RenderInputProps {
  @scala.inline
  def apply[Tag](addTag: Tag => Unit, onChange: ChangeEvent[Value] => Unit, ref: js.Any => Unit, value: Tag): RenderInputProps[Tag] = {
    val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderInputProps[Tag]]
  }
  @scala.inline
  implicit class RenderInputPropsOps[Self[tag] <: RenderInputProps[tag], Tag] (val x: Self[Tag]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Tag] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Tag]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Tag] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Tag] with Other]
    @scala.inline
    def withAddTag(value: Tag => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnChange(value: ChangeEvent[Value] => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: js.Any => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: Tag): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

