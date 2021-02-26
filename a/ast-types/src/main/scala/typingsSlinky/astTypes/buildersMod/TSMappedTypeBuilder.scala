package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Readonly
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSMappedTypeBuilder extends StObject {
  
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  
  def from(params: Readonly): TSMappedType = js.native
}
