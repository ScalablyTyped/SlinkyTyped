package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.CommentsExpression
import typingsSlinky.astTypes.kindsMod.ChainElementKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ChainExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainExpressionBuilder extends js.Object {
  
  def apply(expression: ChainElementKind): ChainExpression = js.native
  
  def from(params: CommentsExpression): ChainExpression = js.native
}
