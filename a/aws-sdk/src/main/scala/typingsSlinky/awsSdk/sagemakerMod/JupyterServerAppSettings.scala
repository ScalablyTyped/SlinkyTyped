package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JupyterServerAppSettings extends StObject {
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the JupyterServer app.
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.native
}
object JupyterServerAppSettings {
  
  @scala.inline
  def apply(): JupyterServerAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JupyterServerAppSettings]
  }
  
  @scala.inline
  implicit class JupyterServerAppSettingsMutableBuilder[Self <: JupyterServerAppSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
  }
}
