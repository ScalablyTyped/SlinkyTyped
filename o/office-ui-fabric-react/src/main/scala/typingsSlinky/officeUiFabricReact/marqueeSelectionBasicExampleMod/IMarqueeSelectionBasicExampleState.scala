package typingsSlinky.officeUiFabricReact.marqueeSelectionBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarqueeSelectionBasicExampleState extends js.Object {
  var isMarqueeEnabled: Boolean = js.native
}

object IMarqueeSelectionBasicExampleState {
  @scala.inline
  def apply(isMarqueeEnabled: Boolean): IMarqueeSelectionBasicExampleState = {
    val __obj = js.Dynamic.literal(isMarqueeEnabled = isMarqueeEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarqueeSelectionBasicExampleState]
  }
  @scala.inline
  implicit class IMarqueeSelectionBasicExampleStateOps[Self <: IMarqueeSelectionBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMarqueeEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMarqueeEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

