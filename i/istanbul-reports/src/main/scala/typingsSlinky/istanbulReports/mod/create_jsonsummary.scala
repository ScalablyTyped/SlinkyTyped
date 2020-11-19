package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.`json-summary`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_jsonsummary extends js.Object {
  
  def apply(name: `json-summary`): Visitor[Node] = js.native
  def apply(name: `json-summary`, options: Partial[JsonSummaryOptions]): Visitor[Node] = js.native
}
