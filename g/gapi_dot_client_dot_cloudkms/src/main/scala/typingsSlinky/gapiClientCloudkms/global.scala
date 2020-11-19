package typingsSlinky.gapiClientCloudkms

import typingsSlinky.gapiClientCloudkms.gapi.client.cloudkms.ProjectsResource
import typingsSlinky.gapiClientCloudkms.gapiClientCloudkmsStrings.cloudkms
import typingsSlinky.gapiClientCloudkms.gapiClientCloudkmsStrings.v1
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
      
      /** Load Google Cloud Key Management Service (KMS) API v1 */
      def load(name: cloudkms, version: v1): js.Thenable[Unit] = js.native
      def load(name: cloudkms, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
