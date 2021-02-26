package typingsSlinky.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyToPath extends StObject {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to project. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Mode bits to use on this file, must be a value between 0000 and 0777. If not specified, the volume
    * defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * Cloud Run fully managed: not supported Cloud Run for Anthos: supported The relative path of the file to map the key to. May not be an absolute path. May not contain the path element
    * '..'. May not start with the string '..'.
    */
  var path: js.UndefOr[String] = js.native
}
object KeyToPath {
  
  @scala.inline
  def apply(): KeyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyToPath]
  }
  
  @scala.inline
  implicit class KeyToPathMutableBuilder[Self <: KeyToPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
