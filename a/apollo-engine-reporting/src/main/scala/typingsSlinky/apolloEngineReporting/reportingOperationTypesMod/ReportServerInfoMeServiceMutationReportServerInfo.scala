package typingsSlinky.apolloEngineReporting.reportingOperationTypesMod

import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoError
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.ReportServerInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError
  - typingsSlinky.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse
*/
trait ReportServerInfoMeServiceMutationReportServerInfo extends js.Object

object ReportServerInfoMeServiceMutationReportServerInfo {
  @scala.inline
  def ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoError(__typename: ReportServerInfoError, code: ReportServerInfoErrorCode, message: String): ReportServerInfoMeServiceMutationReportServerInfo = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfo]
  }
  @scala.inline
  def ReportServerInfoMeServiceMutationReportServerInfoReportServerInfoResponse(__typename: ReportServerInfoResponse, inSeconds: Double, withExecutableSchema: Boolean): ReportServerInfoMeServiceMutationReportServerInfo = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], inSeconds = inSeconds.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMeServiceMutationReportServerInfo]
  }
}

