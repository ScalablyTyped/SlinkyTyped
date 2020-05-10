package typingsSlinky.officeUiFabricReact.teachingBubbleCondensedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleCondensedExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.native
}

object ITeachingBubbleCondensedExampleState {
  @scala.inline
  def apply(): ITeachingBubbleCondensedExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleCondensedExampleState]
  }
  @scala.inline
  implicit class ITeachingBubbleCondensedExampleStateOps[Self <: ITeachingBubbleCondensedExampleState] (val x: Self) extends AnyVal {
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

