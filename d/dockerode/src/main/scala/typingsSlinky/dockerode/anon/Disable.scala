package typingsSlinky.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends StObject {
  
  var Disable: js.UndefOr[Boolean] = js.native
  
  var Level: js.UndefOr[String] = js.native
  
  var Role: js.UndefOr[String] = js.native
  
  var Type: js.UndefOr[String] = js.native
  
  var User: js.UndefOr[String] = js.native
}
object Disable {
  
  @scala.inline
  def apply(): Disable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit class DisableMutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: Boolean): Self = StObject.set(x, "Disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "Disable", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
