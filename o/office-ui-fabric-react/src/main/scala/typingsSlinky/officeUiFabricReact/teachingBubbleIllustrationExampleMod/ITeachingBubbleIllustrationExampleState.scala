package typingsSlinky.officeUiFabricReact.teachingBubbleIllustrationExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleIllustrationExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.native
}

object ITeachingBubbleIllustrationExampleState {
  @scala.inline
  def apply(): ITeachingBubbleIllustrationExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleIllustrationExampleState]
  }
  @scala.inline
  implicit class ITeachingBubbleIllustrationExampleStateOps[Self <: ITeachingBubbleIllustrationExampleState] (val x: Self) extends AnyVal {
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

