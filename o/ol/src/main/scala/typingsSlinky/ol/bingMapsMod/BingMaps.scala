package typingsSlinky.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BingMaps
  extends typingsSlinky.ol.tileImageMod.default {
  def getApiKey(): String = js.native
  def getImagerySet(): String = js.native
  def handleImageryMetadataResponse(response: BingMapsImageryMetadataResponse): Unit = js.native
}

