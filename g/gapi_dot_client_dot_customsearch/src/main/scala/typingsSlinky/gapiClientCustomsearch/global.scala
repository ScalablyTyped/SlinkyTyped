package typingsSlinky.gapiClientCustomsearch

import typingsSlinky.gapiClientCustomsearch.gapi.client.customsearch.CseResource
import typingsSlinky.gapiClientCustomsearch.gapiClientCustomsearchStrings.customsearch
import typingsSlinky.gapiClientCustomsearch.gapiClientCustomsearchStrings.v1
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
      val cse: CseResource = js.native
      /** Load CustomSearch API v1 */
      def load(name: customsearch, version: v1): js.Thenable[Unit] = js.native
      def load(name: customsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

