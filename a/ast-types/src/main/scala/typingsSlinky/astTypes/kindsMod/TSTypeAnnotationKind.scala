package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate
*/
trait TSTypeAnnotationKind extends StObject
object TSTypeAnnotationKind {
  
  @scala.inline
  def TSTypeAnnotation(
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  }
  
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypePredicate
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
}
