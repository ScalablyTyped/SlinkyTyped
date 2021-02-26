package typingsSlinky.cesium.mod

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.cesium.anon.DisableCheckIfAllPixelsAreTransparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
class DiscardMissingTileImagePolicy protected () extends StObject {
  def this(options: DisableCheckIfAllPixelsAreTransparent) = this()
  
  def isReady(): Boolean = js.native
  
  def shouldDiscardImage(image: HTMLImageElement): Boolean = js.native
}
