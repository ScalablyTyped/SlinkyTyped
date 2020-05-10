package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggerDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string = js.native
  /**
    * The ID of the logger definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListLoggerDefinitionVersions'' requests. If the version is the last one that was associated with a logger definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var LoggerDefinitionVersionId: string = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object GetLoggerDefinitionVersionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: string, LoggerDefinitionVersionId: string): GetLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any], LoggerDefinitionVersionId = LoggerDefinitionVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionVersionRequest]
  }
  @scala.inline
  implicit class GetLoggerDefinitionVersionRequestOps[Self <: GetLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
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
    def withLoggerDefinitionVersionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoggerDefinitionVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

