package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSFunctionType
  extends Node
     with TSType {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSFunctionType: typingsSlinky.babelTypes.babelTypesStrings.TSFunctionType = js.native
}
object TSFunctionType {
  
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSFunctionType = js.native
  @JSImport("babel-types/ts3.6", "TSFunctionType")
  @js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  
  @scala.inline
  implicit class TSFunctionTypeMutableBuilder[Self <: TSFunctionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSFunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
