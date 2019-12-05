package typingsSlinky.istanbulDashReports.istanbulDashReportsMod

import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typingsSlinky.istanbulDashReports.istanbulDashReportsStrings.json
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_json extends js.Object {
  def apply(name: json): Visitor[Node] = js.native
  def apply(name: json, options: Partial[Options]): Visitor[Node] = js.native
}

