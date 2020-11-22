package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Optional
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberExpressionBuilder extends js.Object {
  
  def apply(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  
  def from(params: Optional): MemberExpression = js.native
}
