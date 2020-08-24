package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.lcovonly
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_lcovonly extends js.Object {
  def apply(name: lcovonly): Visitor[Node] = js.native
  def apply(name: lcovonly, options: Partial[LcovOnlyOptions]): Visitor[Node] = js.native
}

