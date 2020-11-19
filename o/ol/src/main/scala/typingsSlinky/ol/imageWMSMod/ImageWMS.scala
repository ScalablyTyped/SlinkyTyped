package typingsSlinky.ol.imageWMSMod

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.olImageMod.LoadFunction
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageWMS
  extends typingsSlinky.ol.sourceImageMod.default {
  
  def getFeatureInfoUrl(coordinate: Coordinate, resolution: Double, projection: ProjectionLike, params: js.Any): String = js.native
  
  def getImageLoadFunction(): LoadFunction = js.native
  
  def getLegendUrl(): String = js.native
  def getLegendUrl(resolution: js.UndefOr[scala.Nothing], params: js.Any): String = js.native
  def getLegendUrl(resolution: Double): String = js.native
  def getLegendUrl(resolution: Double, params: js.Any): String = js.native
  
  def getParams(): js.Any = js.native
  
  def getUrl(): String = js.native
  
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  
  def updateParams(params: js.Any): Unit = js.native
}
