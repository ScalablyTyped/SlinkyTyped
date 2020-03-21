package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.lcov
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_lcov extends js.Object {
  def apply(name: lcov): Visitor[Node] = js.native
  def apply(name: lcov, options: Partial[scala.Nothing]): Visitor[Node] = js.native
}

