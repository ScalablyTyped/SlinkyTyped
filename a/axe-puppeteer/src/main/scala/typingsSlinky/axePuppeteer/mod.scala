package typingsSlinky.axePuppeteer

import typingsSlinky.axePuppeteer.owningMod.OwningAxePuppeteer
import typingsSlinky.axePuppeteer.typesMod.IPageOptions
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.Frame
import typingsSlinky.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axe-puppeteer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
  
  @js.native
  class AxePuppeteer protected ()
    extends typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
}
