package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.cobertura
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_cobertura extends js.Object {
  def apply(name: cobertura): Visitor[Node] = js.native
  def apply(name: cobertura, options: Partial[RootedOptions]): Visitor[Node] = js.native
}

