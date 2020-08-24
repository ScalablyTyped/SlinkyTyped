package typingsSlinky.apolloEngineReporting.reportingOperationTypesMod

import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.ServiceMutation
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.UserMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeUserMutation
  - typingsSlinky.apolloEngineReporting.reportingOperationTypesMod.ReportServerInfoMeServiceMutation
*/
trait ReportServerInfoMe extends js.Object

object ReportServerInfoMe {
  @scala.inline
  def ReportServerInfoMeUserMutation(__typename: UserMutation): ReportServerInfoMe = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMe]
  }
  @scala.inline
  def ReportServerInfoMeServiceMutation(__typename: ServiceMutation): ReportServerInfoMe = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportServerInfoMe]
  }
}

