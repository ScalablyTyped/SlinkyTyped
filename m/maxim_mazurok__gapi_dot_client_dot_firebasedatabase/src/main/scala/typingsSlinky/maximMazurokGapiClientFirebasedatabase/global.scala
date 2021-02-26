package typingsSlinky.maximMazurokGapiClientFirebasedatabase

import typingsSlinky.maximMazurokGapiClientFirebasedatabase.gapi.client.firebasedatabase.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.firebasedatabase
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.v1beta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object firebasedatabase {
        
        @JSGlobal("gapi.client.firebasedatabase.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Realtime Database Management API v1beta */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasedatabase, version: v1beta): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: firebasedatabase, version: v1beta, callback: js.Function0[_]): Unit = js.native
    }
  }
}
