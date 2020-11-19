package typingsSlinky.handlebars.Handlebars

import typingsSlinky.handlebars.hbs.AST.Expression
import typingsSlinky.handlebars.hbs.AST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visitor extends ICompiler {
  
  def acceptArray(arr: js.Array[Expression]): Unit = js.native
  
  def acceptKey(node: Node, name: String): Unit = js.native
}
