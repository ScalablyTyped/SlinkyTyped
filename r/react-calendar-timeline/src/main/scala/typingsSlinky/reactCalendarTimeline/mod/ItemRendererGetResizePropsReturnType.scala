package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.reactCalendarTimeline.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRendererGetResizePropsReturnType extends js.Object {
  var left: js.UndefOr[ClassName] = js.native
  var right: js.UndefOr[ClassName] = js.native
}

object ItemRendererGetResizePropsReturnType {
  @scala.inline
  def apply(): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
  @scala.inline
  implicit class ItemRendererGetResizePropsReturnTypeOps[Self <: ItemRendererGetResizePropsReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeft(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
  }
  
}

