package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Optional
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalMemberExpressionBuilder extends js.Object {
  
  def apply(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression = js.native
  def apply(
    `object`: ExpressionKind,
    property: ExpressionKind,
    computed: js.UndefOr[scala.Nothing],
    optional: Boolean
  ): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression = js.native
  def apply(
    `object`: ExpressionKind,
    property: IdentifierKind,
    computed: js.UndefOr[scala.Nothing],
    optional: Boolean
  ): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  
  def from(params: Optional): OptionalMemberExpression = js.native
}
