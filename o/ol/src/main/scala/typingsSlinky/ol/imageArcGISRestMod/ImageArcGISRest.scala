package typingsSlinky.ol.imageArcGISRestMod

import typingsSlinky.ol.olImageMod.LoadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageArcGISRest
  extends typingsSlinky.ol.sourceImageMod.default {
  
  def getImageLoadFunction(): LoadFunction = js.native
  
  def getParams(): js.Any = js.native
  
  def getUrl(): String = js.native
  
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  
  def setUrl(): Unit = js.native
  def setUrl(url: String): Unit = js.native
  
  def updateParams(params: js.Any): Unit = js.native
}
