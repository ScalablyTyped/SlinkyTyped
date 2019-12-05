package typingsSlinky.puppeteerDashCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.puppeteer.deviceDescriptorsMod.Device
import typingsSlinky.puppeteer.puppeteerMod.Browser
import typingsSlinky.puppeteer.puppeteerMod.BrowserFetcher
import typingsSlinky.puppeteer.puppeteerMod.ChromeArgOptions
import typingsSlinky.puppeteer.puppeteerMod.ConnectOptions
import typingsSlinky.puppeteer.puppeteerMod.FetcherOptions
import typingsSlinky.puppeteer.puppeteerMod.LaunchOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object puppeteerDashCoreMod extends js.Object {
  def connect(): js.Promise[Browser] = js.native
  def connect(options: ConnectOptions): js.Promise[Browser] = js.native
  def createBrowserFetcher(): BrowserFetcher = js.native
  def createBrowserFetcher(options: FetcherOptions): BrowserFetcher = js.native
  def defaultArgs(): js.Array[String] = js.native
  def defaultArgs(options: ChromeArgOptions): js.Array[String] = js.native
  def executablePath(): String = js.native
  def launch(): js.Promise[Browser] = js.native
  def launch(options: LaunchOptions): js.Promise[Browser] = js.native
  @js.native
  object devices
    extends TopLevel[js.Array[Device] with StringDictionary[Device]]
  
  @js.native
  object errors extends js.Object {
    @js.native
    class TimeoutError () extends Error {
      /* CompleteClass */
      override var message: String = js.native
      /* CompleteClass */
      override var name: String = js.native
    }
    
  }
  
}

