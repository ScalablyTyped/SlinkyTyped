package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.`private`
import typingsSlinky.babelTypes.babelTypesStrings.`protected`
import typingsSlinky.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSParameterProperty
  extends Node
     with LVal {
  
  var accessibility: public | `private` | `protected` | Null = js.native
  
  var parameter: Identifier_ | AssignmentPattern_ = js.native
  
  var readonly: Boolean | Null = js.native
  
  @JSName("type")
  var type_TSParameterProperty: typingsSlinky.babelTypes.babelTypesStrings.TSParameterProperty = js.native
}
object TSParameterProperty {
  
  @JSImport("babel-types/ts3.6", "TSParameterProperty")
  @js.native
  def apply(parameter: AssignmentPattern_): TSParameterProperty = js.native
  @JSImport("babel-types/ts3.6", "TSParameterProperty")
  @js.native
  def apply(parameter: Identifier_): TSParameterProperty = js.native
  
  @scala.inline
  implicit class TSParameterPropertyMutableBuilder[Self <: TSParameterProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setParameter(value: Identifier_ | AssignmentPattern_): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
