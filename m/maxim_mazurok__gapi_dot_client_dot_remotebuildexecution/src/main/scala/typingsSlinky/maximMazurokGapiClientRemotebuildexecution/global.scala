package typingsSlinky.maximMazurokGapiClientRemotebuildexecution

import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionResultsResource
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionsResource
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.BlobsResource
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.OperationsResource
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.V2Resource
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.remotebuildexecution
import typingsSlinky.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Remote Build Execution API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: remotebuildexecution, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: remotebuildexecution, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object remotebuildexecution {
        
        @JSGlobal("gapi.client.remotebuildexecution.actionResults")
        @js.native
        val actionResults: ActionResultsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.actions")
        @js.native
        val actions: ActionsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.blobs")
        @js.native
        val blobs: BlobsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.v2")
        @js.native
        val v2: V2Resource = js.native
      }
    }
  }
}
