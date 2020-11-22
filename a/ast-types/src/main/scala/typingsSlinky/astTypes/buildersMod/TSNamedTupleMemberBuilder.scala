package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ElementTypeLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamedTupleMemberBuilder extends js.Object {
  
  def apply(label: IdentifierKind, elementType: TSTypeKind): TSNamedTupleMember = js.native
  def apply(label: IdentifierKind, elementType: TSTypeKind, optional: Boolean): TSNamedTupleMember = js.native
  
  def from(params: ElementTypeLabel): TSNamedTupleMember = js.native
}
