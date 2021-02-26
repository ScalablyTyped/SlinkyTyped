package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnetworking extends StObject {
  
  ////////////////////
  // Notifications
  ////////////////////
  /**
    * Use the networking.config API to authenticate to captive portals.
    * Permissions:  "networking.config"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val config: Typeofconfig = js.native
}
object Typeofnetworking {
  
  @scala.inline
  def apply(config: Typeofconfig): Typeofnetworking = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetworking]
  }
  
  @scala.inline
  implicit class TypeofnetworkingMutableBuilder[Self <: Typeofnetworking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Typeofconfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
