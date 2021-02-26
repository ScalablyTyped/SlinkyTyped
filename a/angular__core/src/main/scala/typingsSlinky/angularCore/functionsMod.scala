package typingsSlinky.angularCore

import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/functions", "isFunctionLikeDeclaration")
  @js.native
  def isFunctionLikeDeclaration(node: Node): /* is typescript.typescript.FunctionLikeDeclaration */ Boolean = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/functions", "unwrapExpression")
  @js.native
  def unwrapExpression(node: Expression): Expression = js.native
  @JSImport("@angular/core/schematics/utils/typescript/functions", "unwrapExpression")
  @js.native
  def unwrapExpression(node: ParenthesizedExpression): Expression = js.native
}
