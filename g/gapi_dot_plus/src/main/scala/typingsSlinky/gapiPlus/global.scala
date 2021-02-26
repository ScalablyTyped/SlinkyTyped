package typingsSlinky.gapiPlus

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiPlus.gapi.client.plus.people.GetParameters
import typingsSlinky.gapiPlus.gapi.client.plus.people.PeopleFeed
import typingsSlinky.gapiPlus.gapi.client.plus.people.Person
import typingsSlinky.gapiPlus.gapi.client.plus.people.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      // See Google+ REST API Reference https://developers.google.com/+/web/api/rest/latest/
      object plus {
        
        object people {
          
          @JSGlobal("gapi.client.plus.people.get")
          @js.native
          def get(parameters: GetParameters): HttpRequest[Person] = js.native
          
          @JSGlobal("gapi.client.plus.people.search")
          @js.native
          def search(parameters: SearchParameters): HttpRequest[PeopleFeed] = js.native
        }
      }
    }
  }
}
