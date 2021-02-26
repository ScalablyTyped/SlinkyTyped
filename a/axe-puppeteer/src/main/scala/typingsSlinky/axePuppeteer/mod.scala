package typingsSlinky.axePuppeteer

import typingsSlinky.axePuppeteer.owningMod.OwningAxePuppeteer
import typingsSlinky.axePuppeteer.typesMod.IPageOptions
import typingsSlinky.puppeteer.mod.Browser
import typingsSlinky.puppeteer.mod.Frame
import typingsSlinky.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axe-puppeteer", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @JSImport("axe-puppeteer", "AxePuppeteer")
  @js.native
  class AxePuppeteer protected ()
    extends typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
  }
  
  @JSImport("axe-puppeteer", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  @JSImport("axe-puppeteer", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}
