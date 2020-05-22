package typingsSlinky.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.puppeteer.deviceDescriptorsMod.Device
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.BrowserFetcher
import typingsSlinky.puppeteer.mod.ChromeArgOptions
import typingsSlinky.puppeteer.mod.ConnectOptions
import typingsSlinky.puppeteer.mod.FetcherOptions
import typingsSlinky.puppeteer.mod.LaunchOptions
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("puppeteer-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  object devices extends TopLevel[/* name */ StringDictionary[Device]]
  
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

