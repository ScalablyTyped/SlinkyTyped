package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.abort
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.empty
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.error
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.informative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NAMessage
  extends Accessor
     with JSONSupport {
  
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: String = js.native
  
  /**
    * The network analyst message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}
