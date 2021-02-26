package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExternalModuleReference extends Node {
  
  var expression: StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSExternalModuleReference: typingsSlinky.babelTypes.babelTypesStrings.TSExternalModuleReference = js.native
}
object TSExternalModuleReference {
  
  @JSImport("babel-types/ts3.6", "TSExternalModuleReference")
  @js.native
  def apply(expression: StringLiteral_): TSExternalModuleReference = js.native
  
  @scala.inline
  implicit class TSExternalModuleReferenceMutableBuilder[Self <: TSExternalModuleReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
