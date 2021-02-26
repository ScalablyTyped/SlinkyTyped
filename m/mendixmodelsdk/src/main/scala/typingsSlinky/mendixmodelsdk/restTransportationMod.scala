package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsSlinky.mendixmodelsdk.transportationMod.ITransportation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restTransportationMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/RestTransportation", "RestTransportation")
  @js.native
  class RestTransportation protected () extends ITransportation {
    def this(config: ISdkConfig) = this()
    
    var config: js.Any = js.native
    
    var generateStandardOptions: js.Any = js.native
    
    var handleRequest: js.Any = js.native
    
    var prepareRequestOptions: js.Any = js.native
    
    var retryRequest: js.Any = js.native
    
    var sanitizedMethod: js.Any = js.native
    
    var url: js.Any = js.native
  }
}
