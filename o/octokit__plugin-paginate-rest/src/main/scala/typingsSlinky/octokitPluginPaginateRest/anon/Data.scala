package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.anon.Runnersurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: js.Array[Runnersurl] = js.native
}
object Data {
  
  @scala.inline
  def apply(data: js.Array[Runnersurl]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Runnersurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Runnersurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
