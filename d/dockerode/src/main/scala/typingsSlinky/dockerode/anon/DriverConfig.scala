package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriverConfig extends StObject {
  
  var DriverConfig: Name = js.native
  
  var Labels: StringDictionary[String] = js.native
  
  var NoCopy: Boolean = js.native
}
object DriverConfig {
  
  @scala.inline
  def apply(DriverConfig: Name, Labels: StringDictionary[String], NoCopy: Boolean): DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], NoCopy = NoCopy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverConfig]
  }
  
  @scala.inline
  implicit class DriverConfigMutableBuilder[Self <: DriverConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriverConfig(value: Name): Self = StObject.set(x, "DriverConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCopy(value: Boolean): Self = StObject.set(x, "NoCopy", value.asInstanceOf[js.Any])
  }
}
