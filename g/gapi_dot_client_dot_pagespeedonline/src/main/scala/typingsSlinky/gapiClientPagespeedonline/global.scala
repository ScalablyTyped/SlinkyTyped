package typingsSlinky.gapiClientPagespeedonline

import typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline.PagespeedapiResource
import typingsSlinky.gapiClientPagespeedonline.gapiClientPagespeedonlineStrings.pagespeedonline
import typingsSlinky.gapiClientPagespeedonline.gapiClientPagespeedonlineStrings.v2
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
      
      /** Load PageSpeed Insights API v2 */
      def load(name: pagespeedonline, version: v2): js.Thenable[Unit] = js.native
      def load(name: pagespeedonline, version: v2, callback: js.Function0[_]): Unit = js.native
      
      val pagespeedapi: PagespeedapiResource = js.native
    }
  }
}
