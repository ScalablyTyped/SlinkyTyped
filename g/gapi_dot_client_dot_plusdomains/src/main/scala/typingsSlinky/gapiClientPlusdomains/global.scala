package typingsSlinky.gapiClientPlusdomains

import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.ActivitiesResource
import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.AudiencesResource
import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.CirclesResource
import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.CommentsResource
import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.MediaResource
import typingsSlinky.gapiClientPlusdomains.gapi.client.plusdomains.PeopleResource
import typingsSlinky.gapiClientPlusdomains.gapiClientPlusdomainsStrings.plusdomains
import typingsSlinky.gapiClientPlusdomains.gapiClientPlusdomainsStrings.v1
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
      
      val activities: ActivitiesResource = js.native
      
      val audiences: AudiencesResource = js.native
      
      val circles: CirclesResource = js.native
      
      val comments: CommentsResource = js.native
      
      /** Load Google+ Domains API v1 */
      def load(name: plusdomains, version: v1): js.Thenable[Unit] = js.native
      def load(name: plusdomains, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val media: MediaResource = js.native
      
      val people: PeopleResource = js.native
    }
  }
}
