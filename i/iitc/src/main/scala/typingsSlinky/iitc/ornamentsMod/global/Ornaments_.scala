package typingsSlinky.iitc.ornamentsMod.global

import typingsSlinky.iitc.iitctypesMod.IITC.Portal
import typingsSlinky.leaflet.mod.LayerGroup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Added as part of the Ingress #Helios in 2014, ornaments
  * are additional image overlays for portals.
  *
  * currently there are 6 known types of ornaments: ap$x$suffix
  *  - cluster portals (without suffix)
  *  - volatile portals (_v)
  *  - meeting points (_start)
  *  - finish points (_end)
  *
  * Beacons and Frackers were introduced at the launch of the Ingress
  * ingame store on November 1st, 2015
  *  - Beacons (pe$TAG - $NAME) ie: 'peNIA - NIANTIC'
  *  - Frackers ('peFRACK')
  * (there are 7 different colors for each of them)
  */
@JSGlobal("Ornaments")
@js.native
class Ornaments_ () extends js.Object {
  
   // 60,
  var OVERLAY_OPACITY: Double = js.native
  
  var OVERLAY_SIZE: Double = js.native
  
  var _beacons: LayerGroup_[_] = js.native
  
  var _frackers: LayerGroup_[_] = js.native
  
  var _layer: LayerGroup_[_] = js.native
  
  def addPortal(portal: Portal): Unit = js.native
  
  def removePortal(portal: Portal): Unit = js.native
  
   // 0.6,
  def setup(): Unit = js.native
}
