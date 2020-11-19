package typingsSlinky.ol.snapMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snap
  extends typingsSlinky.ol.pointerMod.default {
  
  def addFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
  def addFeature(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    opt_listen: Boolean
  ): Unit = js.native
  
  def removeFeature(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
  def removeFeature(
    feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
    opt_unlisten: Boolean
  ): Unit = js.native
  
  def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typingsSlinky.ol.pluggableMapMod.default): Result = js.native
}
