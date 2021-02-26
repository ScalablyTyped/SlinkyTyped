package typingsSlinky.nodeSnap7.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiVarsReadResult extends StObject {
  
  //Error Code
  var Data: Buffer = js.native
  
  var Result: Double = js.native
}
object MultiVarsReadResult {
  
  @scala.inline
  def apply(Data: Buffer, Result: Double): MultiVarsReadResult = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsReadResult]
  }
  
  @scala.inline
  implicit class MultiVarsReadResultMutableBuilder[Self <: MultiVarsReadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Buffer): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
