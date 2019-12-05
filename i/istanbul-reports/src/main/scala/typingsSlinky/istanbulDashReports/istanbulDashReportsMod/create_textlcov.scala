package typingsSlinky.istanbulDashReports.istanbulDashReportsMod

import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Node
import typingsSlinky.istanbulDashLibDashReport.istanbulDashLibDashReportMod.Visitor
import typingsSlinky.istanbulDashReports.istanbulDashReportsStrings.`text-lcov`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_textlcov extends js.Object {
  def apply(name: `text-lcov`): Visitor[Node] = js.native
  def apply(name: `text-lcov`, options: Partial[Options]): Visitor[Node] = js.native
}

