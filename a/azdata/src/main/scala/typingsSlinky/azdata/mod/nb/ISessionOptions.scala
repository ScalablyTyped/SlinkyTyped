package typingsSlinky.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISessionOptions extends StObject {
  
  /**
    * The id of an existing kernel.
    */
  var kernelId: js.UndefOr[String] = js.native
  
  /**
    * The type of kernel (e.g. python3).
    */
  var kernelName: js.UndefOr[String] = js.native
  
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The path (not including name) to the session.
    */
  var path: String = js.native
  
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ISessionOptions {
  
  @scala.inline
  def apply(path: String): ISessionOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionOptions]
  }
  
  @scala.inline
  implicit class ISessionOptionsMutableBuilder[Self <: ISessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKernelId(value: String): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "kernelId", js.undefined)
    
    @scala.inline
    def setKernelName(value: String): Self = StObject.set(x, "kernelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelNameUndefined: Self = StObject.set(x, "kernelName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
