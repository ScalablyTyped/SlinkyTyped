package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeOperator
  extends Node
     with TSType {
  
  var operator: String | Null = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeOperator: typingsSlinky.babelTypes.babelTypesStrings.TSTypeOperator = js.native
}
object TSTypeOperator {
  
  @JSImport("babel-types/ts3.6", "TSTypeOperator")
  @js.native
  def apply(typeAnnotation: TSType): TSTypeOperator = js.native
  
  @scala.inline
  implicit class TSTypeOperatorMutableBuilder[Self <: TSTypeOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
