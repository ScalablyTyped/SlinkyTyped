package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideUpdateFromOptions extends Object {
  
  /**
    * Screenshot options to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#updateFrom)
    */
  var screenshot: SlideUpdateFromOptionsScreenshot = js.native
}
object SlideUpdateFromOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    screenshot: SlideUpdateFromOptionsScreenshot
  ): SlideUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideUpdateFromOptions]
  }
  
  @scala.inline
  implicit class SlideUpdateFromOptionsMutableBuilder[Self <: SlideUpdateFromOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreenshot(value: SlideUpdateFromOptionsScreenshot): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
  }
}
