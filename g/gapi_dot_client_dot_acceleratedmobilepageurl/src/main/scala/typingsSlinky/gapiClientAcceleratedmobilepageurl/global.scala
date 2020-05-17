package typingsSlinky.gapiClientAcceleratedmobilepageurl

import typingsSlinky.gapiClientAcceleratedmobilepageurl.gapi.client.acceleratedmobilepageurl.AmpUrlsResource
import typingsSlinky.gapiClientAcceleratedmobilepageurl.gapiClientAcceleratedmobilepageurlStrings.acceleratedmobilepageurl
import typingsSlinky.gapiClientAcceleratedmobilepageurl.gapiClientAcceleratedmobilepageurlStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val ampUrls: AmpUrlsResource = js.native
      /** Load Accelerated Mobile Pages (AMP) URL API v1 */
      def load(name: acceleratedmobilepageurl, version: v1): js.Thenable[Unit] = js.native
      def load(name: acceleratedmobilepageurl, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

