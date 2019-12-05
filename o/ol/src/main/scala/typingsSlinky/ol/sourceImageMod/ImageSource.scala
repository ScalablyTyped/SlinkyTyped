package typingsSlinky.ol.sourceImageMod

import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource
  extends typingsSlinky.ol.sourceSourceMod.default {
  /* protected */ def findNearestResolution(resolution: Double): Double = js.native
  def getImage(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projProjectionMod.default
  ): typingsSlinky.ol.imageBaseMod.default = js.native
  /* protected */ def getImageInternal(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsSlinky.ol.projProjectionMod.default
  ): typingsSlinky.ol.imageBaseMod.default = js.native
  /* protected */ def handleImageChange(event: typingsSlinky.ol.eventsEventMod.default): Unit = js.native
}

