package typingsSlinky.jsdomScreenshot

import typingsSlinky.node.Buffer
import typingsSlinky.puppeteer.mod.Base64ScreenShotOptions
import typingsSlinky.puppeteer.mod.BinaryScreenShotOptions
import typingsSlinky.puppeteer.mod.ScreenshotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply(): js.Promise[String] = js.native
    def apply(options: Base64ScreenShotOptions): js.Promise[String] = js.native
    def apply(options: BinaryScreenShotOptions): js.Promise[Buffer] = js.native
    def apply(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
  }
}
