package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoggerDefinitionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
}

object DeleteLoggerDefinitionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteLoggerDefinitionRequestOps[Self <: DeleteLoggerDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggerDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggerDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

