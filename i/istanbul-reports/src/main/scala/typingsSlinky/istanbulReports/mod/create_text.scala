package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.OptionsmaxColsnumber
import typingsSlinky.istanbulReports.istanbulReportsStrings.text
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_text extends js.Object {
  def apply(name: text): Visitor[Node] = js.native
  def apply(name: text, options: Partial[OptionsmaxColsnumber]): Visitor[Node] = js.native
}

