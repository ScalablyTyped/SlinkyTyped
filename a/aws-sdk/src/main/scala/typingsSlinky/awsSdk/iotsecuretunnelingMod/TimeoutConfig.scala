package typingsSlinky.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutConfig extends StObject {
  
  /**
    * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes) 
    */
  var maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin] = js.native
}
object TimeoutConfig {
  
  @scala.inline
  def apply(): TimeoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutConfig]
  }
  
  @scala.inline
  implicit class TimeoutConfigMutableBuilder[Self <: TimeoutConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLifetimeTimeoutMinutes(value: TimeoutInMin): Self = StObject.set(x, "maxLifetimeTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLifetimeTimeoutMinutesUndefined: Self = StObject.set(x, "maxLifetimeTimeoutMinutes", js.undefined)
  }
}
