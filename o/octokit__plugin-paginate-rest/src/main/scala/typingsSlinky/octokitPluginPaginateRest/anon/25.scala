package typingsSlinky.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25` extends StObject {
  
  var data: js.Array[_] = js.native
}
object `25` {
  
  @scala.inline
  def apply(data: js.Array[_]): `25` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
