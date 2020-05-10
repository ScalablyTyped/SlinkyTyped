package typingsSlinky.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAccessLoggingInput extends js.Object {
  /**
    * The name of the container that you want to stop access logging on.
    */
  var ContainerName: typingsSlinky.awsSdk.mediastoreMod.ContainerName = js.native
}

object StopAccessLoggingInput {
  @scala.inline
  def apply(ContainerName: ContainerName): StopAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAccessLoggingInput]
  }
  @scala.inline
  implicit class StopAccessLoggingInputOps[Self <: StopAccessLoggingInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerName(value: ContainerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

