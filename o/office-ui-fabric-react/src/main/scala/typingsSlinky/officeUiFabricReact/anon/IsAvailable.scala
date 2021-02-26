package typingsSlinky.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsAvailable extends StObject {
  
  var isAvailable: Boolean = js.native
  
  var isAway: Boolean = js.native
  
  var isBlocked: Boolean = js.native
  
  var isBusy: Boolean = js.native
  
  var isDoNotDisturb: Boolean = js.native
  
  var isOffline: Boolean = js.native
}
object IsAvailable {
  
  @scala.inline
  def apply(
    isAvailable: Boolean,
    isAway: Boolean,
    isBlocked: Boolean,
    isBusy: Boolean,
    isDoNotDisturb: Boolean,
    isOffline: Boolean
  ): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], isAway = isAway.asInstanceOf[js.Any], isBlocked = isBlocked.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any], isDoNotDisturb = isDoNotDisturb.asInstanceOf[js.Any], isOffline = isOffline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
  
  @scala.inline
  implicit class IsAvailableMutableBuilder[Self <: IsAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAway(value: Boolean): Self = StObject.set(x, "isAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBlocked(value: Boolean): Self = StObject.set(x, "isBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDoNotDisturb(value: Boolean): Self = StObject.set(x, "isDoNotDisturb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOffline(value: Boolean): Self = StObject.set(x, "isOffline", value.asInstanceOf[js.Any])
  }
}
