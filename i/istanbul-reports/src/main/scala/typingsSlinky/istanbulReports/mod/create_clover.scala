package typingsSlinky.istanbulReports.mod

import typingsSlinky.istanbulLibReport.mod.Node
import typingsSlinky.istanbulLibReport.mod.Visitor
import typingsSlinky.istanbulReports.istanbulReportsStrings.clover
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-reports", "create")
@js.native
object create_clover extends js.Object {
  
  def apply(name: clover): Visitor[Node] = js.native
  def apply(name: clover, options: Partial[CloverOptions]): Visitor[Node] = js.native
}
