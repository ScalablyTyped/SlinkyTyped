package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSHasOptionalTypeParameterInstantiation extends StObject {
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.native
}
object TSHasOptionalTypeParameterInstantiation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeParameterInstantiation")
  @js.native
  val ^ : Type[TSHasOptionalTypeParameterInstantiation] = js.native
  
  @scala.inline
  implicit class TSHasOptionalTypeParameterInstantiationMutableBuilder[Self <: TSHasOptionalTypeParameterInstantiation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
