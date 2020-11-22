package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IdInitializer
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumMemberBuilder extends js.Object {
  
  def apply(id: IdentifierKind): TSEnumMember = js.native
  def apply(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind): TSEnumMember = js.native
  def apply(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  
  def from(params: IdInitializer): TSEnumMember = js.native
}
