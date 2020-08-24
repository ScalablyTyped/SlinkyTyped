package typingsSlinky.ol.tileWMSMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileWMS
  extends typingsSlinky.ol.tileImageMod.default {
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): String = js.native
  def getLegendUrl(): String = js.native
  def getLegendUrl(resolution: js.UndefOr[scala.Nothing], params: js.Any): String = js.native
  def getLegendUrl(resolution: Double): String = js.native
  def getLegendUrl(resolution: Double, params: js.Any): String = js.native
  def getParams(): js.Any = js.native
  def updateParams(params: js.Any): Unit = js.native
}

