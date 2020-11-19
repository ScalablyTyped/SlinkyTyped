package typingsSlinky.gapiClientUrlshortener

import typingsSlinky.gapiClientUrlshortener.gapi.client.urlshortener.UrlResource
import typingsSlinky.gapiClientUrlshortener.gapiClientUrlshortenerStrings.urlshortener
import typingsSlinky.gapiClientUrlshortener.gapiClientUrlshortenerStrings.v1
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
      
      /** Load URL Shortener API v1 */
      def load(name: urlshortener, version: v1): js.Thenable[Unit] = js.native
      def load(name: urlshortener, version: v1, callback: js.Function0[_]): Unit = js.native
      
      val url: UrlResource = js.native
    }
  }
}
