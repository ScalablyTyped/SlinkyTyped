package typingsSlinky.gapiClientAndroidmanagement

import typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement.EnterprisesResource
import typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement.SignupUrlsResource
import typingsSlinky.gapiClientAndroidmanagement.gapiClientAndroidmanagementStrings.androidmanagement
import typingsSlinky.gapiClientAndroidmanagement.gapiClientAndroidmanagementStrings.v1
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
      
      val enterprises: EnterprisesResource = js.native
      
      /** Load Android Management API v1 */
      def load(name: androidmanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: androidmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val signupUrls: SignupUrlsResource = js.native
    }
  }
}
