package typingsSlinky.recast.mod

import typingsSlinky.astTypes.typesMod.ASTNode
import typingsSlinky.recast.optionsMod.Options
import typingsSlinky.recast.printerMod.PrintResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast", "prettyPrint")
@js.native
object prettyPrint extends js.Object {
  
  def apply(node: ASTNode): PrintResultType = js.native
  def apply(node: ASTNode, options: Options): PrintResultType = js.native
}
