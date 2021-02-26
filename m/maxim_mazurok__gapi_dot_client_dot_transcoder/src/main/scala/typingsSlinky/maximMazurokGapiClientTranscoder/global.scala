package typingsSlinky.maximMazurokGapiClientTranscoder

import typingsSlinky.maximMazurokGapiClientTranscoder.gapi.client.transcoder.ProjectsResource
import typingsSlinky.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.transcoder
import typingsSlinky.maximMazurokGapiClientTranscoder.maximMazurokGapiClientTranscoderStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Transcoder API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: transcoder, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: transcoder, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      object transcoder {
        
        @JSGlobal("gapi.client.transcoder.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
