package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLoggerDefinitionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.native
}

object UpdateLoggerDefinitionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: string): UpdateLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggerDefinitionRequest]
  }
  @scala.inline
  implicit class UpdateLoggerDefinitionRequestOps[Self <: UpdateLoggerDefinitionRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

