package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.`html-spa`
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_htmlspa extends js.Object {
  
  def apply(name: `html-spa`): Visitor[Node] = js.native
  def apply(name: `html-spa`, options: Partial[HtmlSpaOptions]): Visitor[Node] = js.native
}
