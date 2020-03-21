package typingsSlinky.axePuppeteer

import typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer
import typingsSlinky.axePuppeteer.typesMod.IPageOptions
import typingsSlinky.puppeteer.mod.Browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer/dist/owning", JSImport.Namespace)
@js.native
object owningMod extends js.Object {
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    var page: js.Any = js.native
  }
  
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
}

