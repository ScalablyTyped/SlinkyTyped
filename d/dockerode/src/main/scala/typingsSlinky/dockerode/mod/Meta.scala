package typingsSlinky.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  var CreatedAt: js.UndefOr[String] = js.native
  
  var UpdatedAt: js.UndefOr[String] = js.native
  
  var Version: js.UndefOr[typingsSlinky.dockerode.mod.Version] = js.native
}
object Meta {
  
  @scala.inline
  def apply(): Meta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
