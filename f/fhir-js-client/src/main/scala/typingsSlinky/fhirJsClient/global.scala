package typingsSlinky.fhirJsClient

import typingsSlinky.fhirJsClient.FHIR.SMART.Client
import typingsSlinky.fhirJsClient.FHIR.SMART.Context
import typingsSlinky.fhirJsClient.FHIR.SMART.OAuth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FHIR {
    
    /**
      * Construct the SMART client directly without using the Oauth2 workflow
      * @param context Context required to construct the client.
      */
    @JSGlobal("FHIR.client")
    @js.native
    def client(context: Context): Client = js.native
    
    /**
      * Property which exposes the OAUth2 specific workflow helpers
      */
    @JSGlobal("FHIR.oauth2")
    @js.native
    val oauth2: OAuth2 = js.native
    
    /**
      * Namespace containing all the SMART on FHIR related definitions
      */
    object SMART
  }
}
