package typingsSlinky.ol.sourceImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/source/Image", "ImageSourceEvent")
@js.native
class ImageSourceEvent protected ()
  extends typingsSlinky.ol.eventMod.default {
  def this(`type`: String, image: typingsSlinky.ol.olImageMod.default) = this()
  
  /**
    * The image related to the event.
    */
  var image: typingsSlinky.ol.olImageMod.default = js.native
}
