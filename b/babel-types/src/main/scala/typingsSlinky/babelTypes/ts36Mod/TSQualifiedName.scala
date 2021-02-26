package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQualifiedName
  extends Node
     with TSEntityName {
  
  var left: TSEntityName = js.native
  
  var right: Identifier_ = js.native
  
  @JSName("type")
  var type_TSQualifiedName: typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName = js.native
}
object TSQualifiedName {
  
  @JSImport("babel-types/ts3.6", "TSQualifiedName")
  @js.native
  def apply(left: TSEntityName, right: Identifier_): TSQualifiedName = js.native
  
  @scala.inline
  implicit class TSQualifiedNameMutableBuilder[Self <: TSQualifiedName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: TSEntityName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Identifier_): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSQualifiedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
