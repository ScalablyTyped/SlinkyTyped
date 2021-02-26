package typingsSlinky.maximMazurokGapiClientFcm

import typingsSlinky.maximMazurokGapiClientFcm.gapi.client.fcm.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.fcm
import typingsSlinky.maximMazurokGapiClientFcm.maximMazurokGapiClientFcmStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object fcm {
        
        @JSGlobal("gapi.client.fcm.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Cloud Messaging API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: fcm, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: fcm, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
