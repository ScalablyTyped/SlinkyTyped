package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.`text-lcov`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_textlcov extends js.Object {
  def apply(name: `text-lcov`): Visitor[Node] = js.native
  def apply(name: `text-lcov`, options: Partial[TextLcovOptions]): Visitor[Node] = js.native
}

