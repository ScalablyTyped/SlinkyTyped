package typingsSlinky.axePuppeteer

import typingsSlinky.axePuppeteer.axePuppeteerMod.AxePuppeteer
import typingsSlinky.axePuppeteer.typesMod.IPageOptions
import typingsSlinky.puppeteer.mod.Browser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object owningMod {
  
  @JSImport("axe-puppeteer/dist/owning", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String): js.Promise[OwningAxePuppeteer] = js.native
  @JSImport("axe-puppeteer/dist/owning", "loadPage")
  @js.native
  def loadPage(browser: Browser, url: String, pageOpts: IPageOptions): js.Promise[OwningAxePuppeteer] = js.native
  
  @js.native
  trait OwningAxePuppeteer extends AxePuppeteer {
    
    var page: js.Any = js.native
  }
}
