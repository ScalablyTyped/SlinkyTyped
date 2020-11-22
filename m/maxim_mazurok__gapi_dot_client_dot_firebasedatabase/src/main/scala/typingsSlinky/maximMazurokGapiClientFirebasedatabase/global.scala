package typingsSlinky.maximMazurokGapiClientFirebasedatabase

import typingsSlinky.maximMazurokGapiClientFirebasedatabase.gapi.client.firebasedatabase.ProjectsResource
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.firebasedatabase
import typingsSlinky.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.v1beta
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
      
      /** Load Firebase Realtime Database Management API v1beta */
      def load(name: firebasedatabase, version: v1beta): js.Thenable[Unit] = js.native
      def load(name: firebasedatabase, version: v1beta, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object firebasedatabase extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
