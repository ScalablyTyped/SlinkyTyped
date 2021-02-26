package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.updateNavigation()
@js.native
trait UpdateNavigationConfig extends StObject {
  
  var stateOnly: js.UndefOr[Boolean] = js.native
  
  var updateTapp: js.UndefOr[Boolean] = js.native
}
object UpdateNavigationConfig {
  
  @scala.inline
  def apply(): UpdateNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNavigationConfig]
  }
  
  @scala.inline
  implicit class UpdateNavigationConfigMutableBuilder[Self <: UpdateNavigationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateOnly(value: Boolean): Self = StObject.set(x, "stateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateOnlyUndefined: Self = StObject.set(x, "stateOnly", js.undefined)
    
    @scala.inline
    def setUpdateTapp(value: Boolean): Self = StObject.set(x, "updateTapp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTappUndefined: Self = StObject.set(x, "updateTapp", js.undefined)
  }
}
