package typingsSlinky.istanbulDashReports.istanbulDashReportsMod

import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typingsSlinky.istanbulDashReports.Anon_BlockName
import typingsSlinky.istanbulDashReports.istanbulDashReportsStrings.teamcity
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_teamcity extends js.Object {
  def apply(name: teamcity): Visitor[Node] = js.native
  def apply(name: teamcity, options: Partial[Options with Anon_BlockName]): Visitor[Node] = js.native
}

