package typingsSlinky.reactTagsinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTagProps[Tag] extends TagProps {
  val disabled: Boolean = js.native
  val tag: Tag = js.native
  def getTagDisplayValue(tag: Tag): String = js.native
  def onRemove(tagIndex: Double): Unit = js.native
}

object RenderTagProps {
  @scala.inline
  def apply[Tag](disabled: Boolean, getTagDisplayValue: Tag => String, onRemove: Double => Unit, tag: Tag): RenderTagProps[Tag] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1(onRemove), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTagProps[Tag]]
  }
  @scala.inline
  implicit class RenderTagPropsOps[Self[tag] <: RenderTagProps[tag], Tag] (val x: Self[Tag]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Tag] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Tag]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Tag] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Tag] with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTagDisplayValue(value: Tag => String): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTagDisplayValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnRemove(value: Double => Unit): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self[Tag] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

