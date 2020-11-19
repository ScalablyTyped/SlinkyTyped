package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait FusionTablesLayer extends MVCObject {
  
  def getMap(): Map[Element] = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: FusionTablesLayerOptions): Unit = js.native
}
