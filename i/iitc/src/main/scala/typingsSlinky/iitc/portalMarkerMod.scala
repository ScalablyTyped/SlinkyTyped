package typingsSlinky.iitc

import typingsSlinky.iitc.iitctypesMod.IITC.Portal
import typingsSlinky.iitc.iitctypesMod.IITC.PortalData
import typingsSlinky.iitc.iitctypesMod.IITC.PortalOptions
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMarkerMod {
  
  object global {
    
    /**
      *  create a new marker. 'data' contain the IITC-specific entity data to be stored in the object options
      */
    @JSGlobal("createMarker")
    @js.native
    def createMarker(latlng: LatLng_, data: PortalData): Portal = js.native
    
    @JSGlobal("getMarkerStyleOptions")
    @js.native
    def getMarkerStyleOptions(details: PortalOptions): PathOptions = js.native
    
    @JSGlobal("portalMarkerScale")
    @js.native
    def portalMarkerScale(): Double = js.native
    
    @JSGlobal("setMarkerStyle")
    @js.native
    def setMarkerStyle(marker: Portal, selected: Boolean): Unit = js.native
  }
}
