package typingsSlinky.apolloEngineReporting.schemaReporterMod

import typingsSlinky.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.next
import typingsSlinky.apolloEngineReporting.apolloEngineReportingStrings.stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloEngineReporting.schemaReporterMod.ReportInfoStop
  - typingsSlinky.apolloEngineReporting.schemaReporterMod.ReportInfoNext
*/
trait ReportInfoResult extends js.Object
object ReportInfoResult {
  
  @scala.inline
  def ReportInfoStop(kind: stop, stopReporting: `true`): ReportInfoResult = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stopReporting = stopReporting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoResult]
  }
  
  @scala.inline
  def ReportInfoNext(inSeconds: Double, kind: next, withExecutableSchema: Boolean): ReportInfoResult = {
    val __obj = js.Dynamic.literal(inSeconds = inSeconds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], withExecutableSchema = withExecutableSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportInfoResult]
  }
}
