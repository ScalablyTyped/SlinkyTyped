package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Delegate
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YieldExpressionBuilder extends js.Object {
  
  def apply(): YieldExpression = js.native
  def apply(argument: Null, delegate: Boolean): YieldExpression = js.native
  def apply(argument: ExpressionKind): YieldExpression = js.native
  def apply(argument: ExpressionKind, delegate: Boolean): YieldExpression = js.native
  
  def from(params: Delegate): YieldExpression = js.native
}
