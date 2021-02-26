package typingsSlinky.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCore.mod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: StringDictionary[js.Array[_]] = js.native
  
  var encapsulation: ViewEncapsulation = js.native
  
  var styles: js.Array[String | js.Array[_]] = js.native
}
object Data {
  
  @scala.inline
  def apply(
    data: StringDictionary[js.Array[_]],
    encapsulation: ViewEncapsulation,
    styles: js.Array[String | js.Array[_]]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[js.Array[_]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[String | js.Array[_]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: (String | js.Array[js.Any])*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
