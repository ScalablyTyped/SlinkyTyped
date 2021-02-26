package typingsSlinky.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureType extends StObject {
  
  var data: js.Array[Double] = js.native
  
  var format: String = js.native
}
object PictureType {
  
  @scala.inline
  def apply(data: js.Array[Double], format: String): PictureType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureType]
  }
  
  @scala.inline
  implicit class PictureTypeMutableBuilder[Self <: PictureType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
