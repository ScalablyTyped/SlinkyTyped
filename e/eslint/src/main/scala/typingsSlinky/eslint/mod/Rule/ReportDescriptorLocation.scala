package typingsSlinky.eslint.mod.Rule

import typingsSlinky.eslint.anon.Column
import typingsSlinky.eslint.mod.AST.SourceLocation
import typingsSlinky.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.eslint.anon.NodeNode
  - typingsSlinky.eslint.anon.Loc
*/
trait ReportDescriptorLocation extends js.Object
object ReportDescriptorLocation {
  
  @scala.inline
  def NodeNode(node: Node): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
  
  @scala.inline
  def Loc(loc: SourceLocation | Column): ReportDescriptorLocation = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDescriptorLocation]
  }
}
