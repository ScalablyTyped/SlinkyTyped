package typingsSlinky.gapiClientVision

import typingsSlinky.gapiClientVision.gapi.client.vision.ImagesResource
import typingsSlinky.gapiClientVision.gapiClientVisionStrings.v1
import typingsSlinky.gapiClientVision.gapiClientVisionStrings.vision
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
      
      val images: ImagesResource = js.native
      
      /** Load Google Cloud Vision API v1 */
      def load(name: vision, version: v1): js.Thenable[Unit] = js.native
      def load(name: vision, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
