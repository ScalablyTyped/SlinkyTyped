package typingsSlinky.applicationinsights

import typingsSlinky.applicationinsights.outLibraryTelemetryClientMod.^
import typingsSlinky.diagnosticDashChannel.diagnosticDashChannelMod.IStandardEvent
import typingsSlinky.diagnosticDashChannelDashPublishers.distSrcMysqlDotPubMod.IMysqlData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/AutoCollection/diagnostic-channel/mysql.sub", JSImport.Namespace)
@js.native
object outAutoCollectionDiagnosticDashChannelMysqlDotSubMod extends js.Object {
  def enable(enabled: Boolean, client: ^): Unit = js.native
  def subscriber(event: IStandardEvent[IMysqlData]): Unit = js.native
}

