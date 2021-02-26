package typingsSlinky.doctrine.mod.`type`

import typingsSlinky.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionType extends Type_ {
  
  var `new`: Type_ = js.native
  
  var params: js.Array[Type_] = js.native
  
  var result: js.Array[Type_] = js.native
  
  var `this`: Type_ = js.native
  
  var `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType = js.native
}
object FunctionType {
  
  @scala.inline
  def apply(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typingsSlinky.doctrine.doctrineStrings.FunctionType
  ): FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionType]
  }
  
  @scala.inline
  implicit class FunctionTypeMutableBuilder[Self <: FunctionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNew(value: Type_): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[Type_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Type_ *): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Type_]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Type_ *): Self = StObject.set(x, "result", js.Array(value :_*))
    
    @scala.inline
    def setThis(value: Type_): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.doctrine.doctrineStrings.FunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
