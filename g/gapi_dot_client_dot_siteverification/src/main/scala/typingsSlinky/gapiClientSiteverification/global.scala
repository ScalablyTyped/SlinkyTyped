package typingsSlinky.gapiClientSiteverification

import typingsSlinky.gapiClientSiteverification.gapi.client.siteverification.WebResourceResource
import typingsSlinky.gapiClientSiteverification.gapiClientSiteverificationStrings.siteverification
import typingsSlinky.gapiClientSiteverification.gapiClientSiteverificationStrings.v1
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
      val webResource: WebResourceResource = js.native
      /** Load Google Site Verification API v1 */
      def load(name: siteverification, version: v1): js.Thenable[Unit] = js.native
      def load(name: siteverification, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

