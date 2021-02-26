package typingsSlinky.bip174.anon

import typingsSlinky.bip174.interfacesMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalKeyVals extends StObject {
  
  var globalKeyVals: js.Array[KeyValue] = js.native
  
  var inputKeyVals: js.Array[js.Array[KeyValue]] = js.native
  
  var outputKeyVals: js.Array[js.Array[KeyValue]] = js.native
}
object GlobalKeyVals {
  
  @scala.inline
  def apply(
    globalKeyVals: js.Array[KeyValue],
    inputKeyVals: js.Array[js.Array[KeyValue]],
    outputKeyVals: js.Array[js.Array[KeyValue]]
  ): GlobalKeyVals = {
    val __obj = js.Dynamic.literal(globalKeyVals = globalKeyVals.asInstanceOf[js.Any], inputKeyVals = inputKeyVals.asInstanceOf[js.Any], outputKeyVals = outputKeyVals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalKeyVals]
  }
  
  @scala.inline
  implicit class GlobalKeyValsMutableBuilder[Self <: GlobalKeyVals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalKeyVals(value: js.Array[KeyValue]): Self = StObject.set(x, "globalKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalKeyValsVarargs(value: KeyValue*): Self = StObject.set(x, "globalKeyVals", js.Array(value :_*))
    
    @scala.inline
    def setInputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = StObject.set(x, "inputKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputKeyValsVarargs(value: js.Array[KeyValue]*): Self = StObject.set(x, "inputKeyVals", js.Array(value :_*))
    
    @scala.inline
    def setOutputKeyVals(value: js.Array[js.Array[KeyValue]]): Self = StObject.set(x, "outputKeyVals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeyValsVarargs(value: js.Array[KeyValue]*): Self = StObject.set(x, "outputKeyVals", js.Array(value :_*))
  }
}
