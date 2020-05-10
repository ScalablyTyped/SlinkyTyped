package typingsSlinky.officeUiFabricReact.progressIndicatorBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressIndicatorBasicExampleState extends js.Object {
  var percentComplete: Double = js.native
}

object IProgressIndicatorBasicExampleState {
  @scala.inline
  def apply(percentComplete: Double): IProgressIndicatorBasicExampleState = {
    val __obj = js.Dynamic.literal(percentComplete = percentComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorBasicExampleState]
  }
  @scala.inline
  implicit class IProgressIndicatorBasicExampleStateOps[Self <: IProgressIndicatorBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentComplete(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentComplete")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

