package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoggerDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.native
}

object CreateLoggerDefinitionVersionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: string): CreateLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
  }
  @scala.inline
  implicit class CreateLoggerDefinitionVersionRequestOps[Self <: CreateLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
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
    def withAmznClientToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmznClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmznClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggers(value: listOfLogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Loggers")(js.undefined)
        ret
    }
  }
  
}

