package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopCompilationJobRequest extends js.Object {
  /**
    * The name of the model compilation job to stop.
    */
  var CompilationJobName: EntityName = js.native
}

object StopCompilationJobRequest {
  @scala.inline
  def apply(CompilationJobName: EntityName): StopCompilationJobRequest = {
    val __obj = js.Dynamic.literal(CompilationJobName = CompilationJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCompilationJobRequest]
  }
  @scala.inline
  implicit class StopCompilationJobRequestOps[Self <: StopCompilationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilationJobName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompilationJobName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

