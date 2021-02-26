package typingsSlinky.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  /** Get the browser the target belongs to. */
  def browser(): Browser = js.native
  
  /** The browser context the target belongs to. */
  def browserContext(): BrowserContext = js.native
  
  /** Creates a Chrome Devtools Protocol session attached to the target. */
  def createCDPSession(): js.Promise[CDPSession] = js.native
  
  /** Get the target that opened this target. Top-level targets return `null`. */
  def opener(): Target | Null = js.native
  
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): js.Promise[Page] = js.native
  
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType = js.native
  
  /** Returns the target URL. */
  def url(): String = js.native
  
  /** If the target is not of type `service_worker` or `shared_worker`, resolves `null`. */
  def worker(): js.Promise[Worker | Null] = js.native
}
object Target {
  
  @scala.inline
  def apply(
    browser: () => Browser,
    browserContext: () => BrowserContext,
    createCDPSession: () => js.Promise[CDPSession],
    opener: () => Target | Null,
    page: () => js.Promise[Page],
    `type`: () => TargetType,
    url: () => String,
    worker: () => js.Promise[Worker | Null]
  ): Target = {
    val __obj = js.Dynamic.literal(browser = js.Any.fromFunction0(browser), browserContext = js.Any.fromFunction0(browserContext), createCDPSession = js.Any.fromFunction0(createCDPSession), opener = js.Any.fromFunction0(opener), page = js.Any.fromFunction0(page), url = js.Any.fromFunction0(url), worker = js.Any.fromFunction0(worker))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser(value: () => Browser): Self = StObject.set(x, "browser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBrowserContext(value: () => BrowserContext): Self = StObject.set(x, "browserContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateCDPSession(value: () => js.Promise[CDPSession]): Self = StObject.set(x, "createCDPSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpener(value: () => Target | Null): Self = StObject.set(x, "opener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPage(value: () => js.Promise[Page]): Self = StObject.set(x, "page", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: () => TargetType): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUrl(value: () => String): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWorker(value: () => js.Promise[Worker | Null]): Self = StObject.set(x, "worker", js.Any.fromFunction0(value))
  }
}
