package typingsSlinky.ol.sourceTileWMSMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileWMS
  extends typingsSlinky.ol.sourceTileImageMod.default {
  def getGetFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): js.UndefOr[String] = js.native
  def getParams(): js.Any = js.native
  def updateParams(params: js.Any): Unit = js.native
}

