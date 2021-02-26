package typingsSlinky.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: js.Array[Double] = js.native
  
  var `type`: typingsSlinky.node.nodeStrings.Buffer = js.native
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[Double], `type`: typingsSlinky.node.nodeStrings.Buffer): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.node.nodeStrings.Buffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
