package typingsSlinky.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigClass extends StObject {
  
  var configClass: String = js.native
  
  var id: String = js.native
  
  var objectType: String = js.native
}
object ConfigClass {
  
  @scala.inline
  def apply(configClass: String, id: String, objectType: String): ConfigClass = {
    val __obj = js.Dynamic.literal(configClass = configClass.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigClass]
  }
  
  @scala.inline
  implicit class ConfigClassMutableBuilder[Self <: ConfigClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigClass(value: String): Self = StObject.set(x, "configClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
  }
}
