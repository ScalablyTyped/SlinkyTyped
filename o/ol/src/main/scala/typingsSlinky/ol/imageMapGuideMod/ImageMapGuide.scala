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
  
  /**
    * Return the image load function of the source.
    */
  def getImageLoadFunction(): LoadFunction = js.native
  
  /**
    * Get the user-provided params, i.e. those passed to the constructor through
    * the "params" option, and possibly updated using the updateParams method.
    */
  def getParams(): js.Any = js.native
  
  def getUrl(
    baseUrl: String,
    params: StringDictionary[String | Double],
    extent: Extent,
    size: Size,
    projection: typingsSlinky.ol.projectionMod.default
  ): String = js.native
  
  /**
    * Set the image load function of the MapGuide source.
    */
  def setImageLoadFunction(imageLoadFunction: LoadFunction): Unit = js.native
  
  /**
    * Update the user-provided params.
    */
  def updateParams(params: js.Any): Unit = js.native
}
