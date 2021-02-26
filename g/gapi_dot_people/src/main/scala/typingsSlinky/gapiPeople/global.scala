package typingsSlinky.gapiPeople

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiPeople.gapi.client.people.Person
import typingsSlinky.gapiPeople.gapi.client.people.people.BatchGetResponse
import typingsSlinky.gapiPeople.gapi.client.people.people.GetBatchGetParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.GetParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.connections.ListParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.connections.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object people {
        
        object people {
          
          object connections {
            
            @JSGlobal("gapi.client.people.people.connections.list")
            @js.native
            def list(parameters: ListParameters): HttpRequest[Response] = js.native
          }
          
          @JSGlobal("gapi.client.people.people.get")
          @js.native
          def get(parameters: GetParameters): HttpRequest[Person] = js.native
          
          @JSGlobal("gapi.client.people.people.getBatchGet")
          @js.native
          def getBatchGet(parameters: GetBatchGetParameters): HttpRequest[BatchGetResponse] = js.native
        }
      }
    }
  }
}
