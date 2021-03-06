package typingsSlinky.iitc

import typingsSlinky.iitc.iitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDetailDisplayToolsMod {
  
  object global {
    
    /**
      * calculate AP gain from destroying portal and then capturing it by deploying resonators
      */
    @JSGlobal("getAttackApGainText")
    @js.native
    def getAttackApGainText(d: PortalDataDetail, fieldCount: Double, linkCount: Double): js.Array[String] = js.native
    
    @JSGlobal("getEnergyText")
    @js.native
    def getEnergyText(d: PortalDataDetail): js.Array[String] = js.native
    
    @JSGlobal("getHackDetailsText")
    @js.native
    def getHackDetailsText(d: PortalDataDetail): js.Array[String] = js.native
    
    @JSGlobal("getMitigationText")
    @js.native
    def getMitigationText(d: PortalDataDetail, linkCount: Double): js.Array[String] = js.native
    
    /**
      * given portal details, returns html code to display mod details.
      */
    @JSGlobal("getModDetails")
    @js.native
    def getModDetails(d: PortalDataDetail): String = js.native
    
    /**
      * returns displayable text+link about portal range
      */
    @JSGlobal("getRangeText")
    @js.native
    def getRangeText(d: PortalDataDetail): js.Array[String] = js.native
    
    /**
      * octant=slot: 0=E, 1=NE, 2=N, 3=NW, 4=W, 5=SW, 6=S, SE=7
      * resos in the display should be ordered like this:
      *   N    NE         Since the view is displayed in rows, they
      *   NW    E          need to be ordered like this: N NE NW E W SE SW S
      *   W    SE         i.e. 2 1 3 0 4 7 5 6
      *   SW    S
      * note: as of 2014-05-23 update, this is not true for portals with empty slots!
      */
    @JSGlobal("getResonatorDetails")
    @js.native
    def getResonatorDetails(d: PortalDataDetail): String = js.native
    
    /**
      * helper function that renders the HTML for a given resonator. Does
      * not work with raw details-hash. Needs digested infos instead:
      * slot: which slot this resonator occupies. Starts with 0 (east) and
      * rotates clockwise. So, last one is 7 (southeast).
      */
    @JSGlobal("renderResonatorDetails")
    @js.native
    def renderResonatorDetails(slot: Double, level: Double, nrg: String, nick: String): js.Array[String] = js.native
  }
}
