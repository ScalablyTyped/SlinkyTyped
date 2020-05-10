package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.platformPlatformMod.Platform
import typingsSlinky.std.Document_
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_browser/browser_platform", JSImport.Namespace)
@js.native
object platformBrowserBrowserPlatformMod extends js.Object {
  @js.native
  class BrowserPlatform () extends Platform {
    @JSName("document")
    def document_MBrowserPlatform: Document_ | Null = js.native
    @JSName("window")
    def window_MBrowserPlatform: Window_ | Null = js.native
  }
  
}

