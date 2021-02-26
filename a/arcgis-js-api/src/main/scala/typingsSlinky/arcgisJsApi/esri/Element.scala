package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.field
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element
  extends Accessor
     with JSONSupport
     with ElementMixin {
  
  /**
    * The type of form element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html#type)
    */
  val `type`: field | group = js.native
}
