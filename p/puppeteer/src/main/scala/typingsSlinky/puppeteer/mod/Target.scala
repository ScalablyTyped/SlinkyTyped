package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
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
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: () => Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBrowserContext(value: () => BrowserContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browserContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateCDPSession(value: () => js.Promise[CDPSession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCDPSession")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpener(value: () => Target | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opener")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPage(value: () => js.Promise[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: () => TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWorker(value: () => js.Promise[Worker | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

