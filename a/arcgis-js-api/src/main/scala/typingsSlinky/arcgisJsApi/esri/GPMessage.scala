package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.abort
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.empty
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.error
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.informative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPMessage
  extends Accessor
     with JSONSupport {
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: String = js.native
  /**
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}

@JSGlobal("__esri.GPMessage")
@js.native
object GPMessage extends TopLevel[GPMessageConstructor]

