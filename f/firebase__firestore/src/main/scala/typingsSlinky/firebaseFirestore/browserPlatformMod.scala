package typingsSlinky.firebaseFirestore

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Window
import typingsSlinky.firebaseFirestore.platformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/platform_browser/browser_platform", JSImport.Namespace)
@js.native
object browserPlatformMod extends js.Object {
  @js.native
  class BrowserPlatform () extends Platform {
    @JSName("document")
    def document_MBrowserPlatform: Document | Null = js.native
    @JSName("window")
    def window_MBrowserPlatform: Window | Null = js.native
  }
  
}

