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
trait NAMessageProperties extends StObject {
  
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The network analyst message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: js.UndefOr[
    informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
  ] = js.native
}
object NAMessageProperties {
  
  @scala.inline
  def apply(): NAMessageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NAMessageProperties]
  }
  
  @scala.inline
  implicit class NAMessagePropertiesMutableBuilder[Self <: NAMessageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(
      value: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
