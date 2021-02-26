package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ElementTypeLabel
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamedTupleMemberBuilder extends StObject {
  
  def apply(label: IdentifierKind, elementType: TSTypeKind): TSNamedTupleMember = js.native
  def apply(label: IdentifierKind, elementType: TSTypeKind, optional: Boolean): TSNamedTupleMember = js.native
  
  def from(params: ElementTypeLabel): TSNamedTupleMember = js.native
}
