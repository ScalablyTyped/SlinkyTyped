package typingsSlinky.gapiClientRuntimeconfig

import typingsSlinky.gapiClientRuntimeconfig.gapi.client.runtimeconfig.OperationsResource
import typingsSlinky.gapiClientRuntimeconfig.gapiClientRuntimeconfigStrings.runtimeconfig
import typingsSlinky.gapiClientRuntimeconfig.gapiClientRuntimeconfigStrings.v1
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
      
      /** Load Google Cloud Runtime Configuration API v1 */
      def load(name: runtimeconfig, version: v1): js.Thenable[Unit] = js.native
      def load(name: runtimeconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val operations: OperationsResource = js.native
    }
  }
}
