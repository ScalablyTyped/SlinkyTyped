package typingsSlinky.istanbulDashReports.istanbulDashReportsMod

import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typingsSlinky.istanbulDashReports.Anon_MaxCols
import typingsSlinky.istanbulDashReports.istanbulDashReportsStrings.text
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_text extends js.Object {
  def apply(name: text): Visitor[Node] = js.native
  def apply(name: text, options: Partial[Options with Anon_MaxCols]): Visitor[Node] = js.native
}

