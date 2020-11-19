package typingsSlinky.gapiClientBigquerydatatransfer

import typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer.ProjectsResource
import typingsSlinky.gapiClientBigquerydatatransfer.gapiClientBigquerydatatransferStrings.bigquerydatatransfer
import typingsSlinky.gapiClientBigquerydatatransfer.gapiClientBigquerydatatransferStrings.v1
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
      
      /** Load BigQuery Data Transfer API v1 */
      def load(name: bigquerydatatransfer, version: v1): js.Thenable[Unit] = js.native
      def load(name: bigquerydatatransfer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val projects: ProjectsResource = js.native
    }
  }
}
