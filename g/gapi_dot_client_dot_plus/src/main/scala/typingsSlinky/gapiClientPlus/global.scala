package typingsSlinky.gapiClientPlus

import typingsSlinky.gapiClientPlus.gapi.client.plus.ActivitiesResource
import typingsSlinky.gapiClientPlus.gapi.client.plus.CommentsResource
import typingsSlinky.gapiClientPlus.gapi.client.plus.PeopleResource
import typingsSlinky.gapiClientPlus.gapiClientPlusStrings.plus
import typingsSlinky.gapiClientPlus.gapiClientPlusStrings.v1
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
      
      val comments: CommentsResource = js.native
      
      /** Load Google+ API v1 */
      def load(name: plus, version: v1): js.Thenable[Unit] = js.native
      def load(name: plus, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val people: PeopleResource = js.native
    }
  }
}
