package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.click
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.freehand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDrawActionProperties extends DrawActionProperties {
  
  /**
    * The drawing mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode)
    */
  var mode: js.UndefOr[freehand | click] = js.native
}
object SegmentDrawActionProperties {
  
  @scala.inline
  def apply(): SegmentDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDrawActionProperties]
  }
  
  @scala.inline
  implicit class SegmentDrawActionPropertiesMutableBuilder[Self <: SegmentDrawActionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
