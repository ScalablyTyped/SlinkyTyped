package typingsSlinky.hubspotPace

import typingsSlinky.hubspotPace.HubSpotPaceInterfaces.Pace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object HubSpotPaceInterfaces {
    
    @JSGlobal("HubSpotPaceInterfaces.PaceEvent")
    @js.native
    object PaceEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent with Double] = js.native
      
      /* 3 */ val done: typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent.done with Double = js.native
      
      /* 4 */ val hide: typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent.hide with Double = js.native
      
      /* 2 */ val restart: typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent.restart with Double = js.native
      
      /* 0 */ val start: typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent.start with Double = js.native
      
      /* 1 */ val stop: typingsSlinky.hubspotPace.HubSpotPaceInterfaces.PaceEvent.stop with Double = js.native
    }
  }
  
  @JSGlobal("pace")
  @js.native
  def pace: Pace = js.native
  @scala.inline
  def pace_=(x: Pace): Unit = js.Dynamic.global.updateDynamic("pace")(x.asInstanceOf[js.Any])
}
