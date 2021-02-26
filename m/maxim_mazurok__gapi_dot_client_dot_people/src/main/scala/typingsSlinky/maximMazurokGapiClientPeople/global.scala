package typingsSlinky.maximMazurokGapiClientPeople

import typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people.ContactGroupsResource
import typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people.OtherContactsResource
import typingsSlinky.maximMazurokGapiClientPeople.gapi.client.people.PeopleResource
import typingsSlinky.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.people
import typingsSlinky.maximMazurokGapiClientPeople.maximMazurokGapiClientPeopleStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load People API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: people, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: people, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object people {
        
        @JSGlobal("gapi.client.people.contactGroups")
        @js.native
        val contactGroups: ContactGroupsResource = js.native
        
        @JSGlobal("gapi.client.people.otherContacts")
        @js.native
        val otherContacts: OtherContactsResource = js.native
        
        @JSGlobal("gapi.client.people.people")
        @js.native
        val people: PeopleResource = js.native
      }
    }
  }
}
