package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.anon.Createdat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `4` extends StObject {
  
  var data: js.Array[Createdat] = js.native
}
object `4` {
  
  @scala.inline
  def apply(data: js.Array[Createdat]): `4` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Createdat]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Createdat*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
