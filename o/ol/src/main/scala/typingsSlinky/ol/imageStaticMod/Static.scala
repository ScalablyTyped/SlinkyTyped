package typingsSlinky.ol.imageStaticMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static
  extends typingsSlinky.ol.sourceImageMod.default {
  
  /**
    * Returns the image extent
    */
  def getImageExtent(): Extent = js.native
  
  /**
    * Return the URL used for this image source.
    */
  def getUrl(): String = js.native
}
