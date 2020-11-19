package typingsSlinky.gapiClientVideointelligence

import typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence.VideosResource
import typingsSlinky.gapiClientVideointelligence.gapiClientVideointelligenceStrings.v1beta1
import typingsSlinky.gapiClientVideointelligence.gapiClientVideointelligenceStrings.videointelligence
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
      
      /** Load Cloud Video Intelligence API v1beta1 */
      def load(name: videointelligence, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: videointelligence, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      val videos: VideosResource = js.native
    }
  }
}
