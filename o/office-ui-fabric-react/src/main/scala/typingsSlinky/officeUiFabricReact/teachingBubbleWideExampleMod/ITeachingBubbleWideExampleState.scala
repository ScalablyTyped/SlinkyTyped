package typingsSlinky.officeUiFabricReact.teachingBubbleWideExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleWideExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.native
}

object ITeachingBubbleWideExampleState {
  @scala.inline
  def apply(): ITeachingBubbleWideExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleWideExampleState]
  }
  @scala.inline
  implicit class ITeachingBubbleWideExampleStateOps[Self <: ITeachingBubbleWideExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTeachingBubbleVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTeachingBubbleVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTeachingBubbleVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTeachingBubbleVisible")(js.undefined)
        ret
    }
  }
  
}

