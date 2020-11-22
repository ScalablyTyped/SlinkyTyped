package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IdInit
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumBooleanMemberBuilder extends js.Object {
  
  def apply(id: IdentifierKind, init: Boolean): EnumBooleanMember = js.native
  def apply(id: IdentifierKind, init: LiteralKind): EnumBooleanMember = js.native
  
  def from(params: IdInit): EnumBooleanMember = js.native
}
