package typingsSlinky.maximMazurokGapiClientFirestore

import typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.firestore
import typingsSlinky.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firestore {
        
        @JSGlobal("gapi.client.firestore.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Firestore API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firestore, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firestore, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
