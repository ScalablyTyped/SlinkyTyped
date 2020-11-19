package typingsSlinky.gapiClientSlides

import typingsSlinky.gapiClientSlides.gapi.client.slides.PresentationsResource
import typingsSlinky.gapiClientSlides.gapiClientSlidesStrings.slides
import typingsSlinky.gapiClientSlides.gapiClientSlidesStrings.v1
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
      
      /** Load Google Slides API v1 */
      def load(name: slides, version: v1): js.Thenable[Unit] = js.native
      def load(name: slides, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val presentations: PresentationsResource = js.native
    }
  }
}
