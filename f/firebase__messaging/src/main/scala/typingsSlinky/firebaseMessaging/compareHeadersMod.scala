package typingsSlinky.firebaseMessaging

import typingsSlinky.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareHeadersMod {
  
  @JSImport("@firebase/messaging/dist/testing/compare-headers", "compareHeaders")
  @js.native
  def compareHeaders(expectedHeaders: HeadersWithEntries, actualHeaders: HeadersWithEntries): Unit = js.native
  
  @js.native
  trait HeadersWithEntries extends Headers {
    
    @JSName("entries")
    var entries_FHeadersWithEntries: js.UndefOr[js.Function0[js.Iterable[js.Tuple2[String, String]]]] = js.native
  }
}
