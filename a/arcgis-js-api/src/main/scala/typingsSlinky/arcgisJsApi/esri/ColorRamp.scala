package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.algorithmic
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.multipart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRamp
  extends Accessor
     with JSONSupport {
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html#type)
    */
  val `type`: algorithmic | multipart = js.native
}

@JSGlobal("__esri.ColorRamp")
@js.native
object ColorRamp extends TopLevel[ColorRampConstructor]

