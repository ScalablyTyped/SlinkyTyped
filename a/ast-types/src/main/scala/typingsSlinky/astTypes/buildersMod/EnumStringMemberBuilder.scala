package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IdIdentifierKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.EnumStringMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumStringMemberBuilder extends js.Object {
  
  def apply(id: IdentifierKind, init: LiteralKind): EnumStringMember = js.native
  
  def from(params: IdIdentifierKind): EnumStringMember = js.native
}
