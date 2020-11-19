package typingsSlinky.ol.imageMapGuideMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olImageMod.LoadFunction
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapGuide
  extends typingsSlinky.ol.sourceImageMod.default {
  
  def getImageLoadFunction(): LoadFunction = js.native
  
  def getParams(): js.Any = js.native
  
  def getUrl(
    baseUrl: String,
    params: StringDictionary[String | Double],
    extent: Extent,
    size: Size,
    projection: typingsSlinky.ol.projectionMod.default
  ): String = js.native
  
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  
  def updateParams(params: js.Any): Unit = js.native
}
