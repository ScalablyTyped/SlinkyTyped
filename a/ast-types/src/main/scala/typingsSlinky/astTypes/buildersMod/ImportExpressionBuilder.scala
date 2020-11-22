package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocSource
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExpressionBuilder extends js.Object {
  
  def apply(source: ExpressionKind): ImportExpression = js.native
  
  def from(params: LocSource): ImportExpression = js.native
}
