package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Method
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeInternalSlotBuilder extends StObject {
  
  def apply(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  
  def from(params: Method): ObjectTypeInternalSlot = js.native
}
