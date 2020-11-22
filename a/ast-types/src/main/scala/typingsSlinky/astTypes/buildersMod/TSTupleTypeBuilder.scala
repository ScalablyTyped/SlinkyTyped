package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ElementTypes
import typingsSlinky.astTypes.kindsMod.TSNamedTupleMemberKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTupleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTupleTypeBuilder extends js.Object {
  
  def apply(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): TSTupleType = js.native
  
  def from(params: ElementTypes): TSTupleType = js.native
}
