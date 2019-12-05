package typingsSlinky.ol.interactionSnapMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snap
  extends typingsSlinky.ol.interactionPointerMod.default {
  def addFeature(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
  def addFeature(feature: typingsSlinky.ol.featureMod.default, opt_listen: Boolean): Unit = js.native
  def removeFeature(feature: typingsSlinky.ol.featureMod.default): Unit = js.native
  def removeFeature(feature: typingsSlinky.ol.featureMod.default, opt_unlisten: Boolean): Unit = js.native
  def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typingsSlinky.ol.pluggableMapMod.default): Result = js.native
}

