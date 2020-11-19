package typingsSlinky.gapiPeople

import typingsSlinky.gapi.gapi.client.HttpRequest
import typingsSlinky.gapiPeople.gapi.client.people.Person
import typingsSlinky.gapiPeople.gapi.client.people.people.BatchGetResponse
import typingsSlinky.gapiPeople.gapi.client.people.people.GetBatchGetParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.GetParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.connections.ListParameters
import typingsSlinky.gapiPeople.gapi.client.people.people.connections.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      @js.native
      object people extends js.Object {
        
        @js.native
        object people extends js.Object {
          
          def get(parameters: GetParameters): HttpRequest[Person] = js.native
          
          def getBatchGet(parameters: GetBatchGetParameters): HttpRequest[BatchGetResponse] = js.native
          
          @js.native
          object connections extends js.Object {
            
            def list(parameters: ListParameters): HttpRequest[Response] = js.native
          }
        }
      }
    }
  }
}
