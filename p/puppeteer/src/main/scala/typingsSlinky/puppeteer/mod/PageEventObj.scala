package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.AnonMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageEventObj extends js.Object {
  /** Emitted when the page closes. */
  var close: js.UndefOr[scala.Nothing] = js.native
  /**
    * Emitted when JavaScript within the page calls one of console API methods, e.g. console.log or console.dir.
    * Also emitted if the page throws an error or a warning.
    */
  var console: ConsoleMessage = js.native
  /**
    * Emitted when a JavaScript dialog appears, such as alert, prompt, confirm or beforeunload.
    * Puppeteer can respond to the dialog via Dialog's accept or dismiss methods.
    */
  var dialog: Dialog = js.native
  /** Emitted when the page crashes. */
  var error: js.Error = js.native
  /** Emitted when a frame is attached. */
  var frameattached: Frame = js.native
  /** Emitted when a frame is detached. */
  var framedetached: Frame = js.native
  /** Emitted when a frame is navigated to a new url. */
  var framenavigated: Frame = js.native
  /** Emitted when the JavaScript load event is dispatched. */
  var load: js.UndefOr[scala.Nothing] = js.native
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`.
    * For the list of metrics see `page.metrics`.
    */
  var metrics: AnonMetrics = js.native
  /** Emitted when an uncaught exception happens within the page. */
  var pageerror: js.Error = js.native
  /** Emitted when the page opens a new tab or window. */
  var popup: Page = js.native
  /**
    * Emitted when a page issues a request. The request object is read-only.
    * In order to intercept and mutate requests, see page.setRequestInterceptionEnabled.
    */
  var request: Request = js.native
  /** Emitted when a request fails, for example by timing out. */
  var requestfailed: Request = js.native
  /** Emitted when a request finishes successfully. */
  var requestfinished: Request = js.native
  /** Emitted when a response is received. */
  var response: Response = js.native
  /** Emitted when a dedicated WebWorker is spawned by the page. */
  var workercreated: Worker = js.native
  /** Emitted when a dedicated WebWorker is terminated. */
  var workerdestroyed: Worker = js.native
}

object PageEventObj {
  @scala.inline
  def apply(
    console: ConsoleMessage,
    dialog: Dialog,
    error: js.Error,
    frameattached: Frame,
    framedetached: Frame,
    framenavigated: Frame,
    metrics: AnonMetrics,
    pageerror: js.Error,
    popup: Page,
    request: Request,
    requestfailed: Request,
    requestfinished: Request,
    response: Response,
    workercreated: Worker,
    workerdestroyed: Worker
  ): PageEventObj = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], frameattached = frameattached.asInstanceOf[js.Any], framedetached = framedetached.asInstanceOf[js.Any], framenavigated = framenavigated.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], pageerror = pageerror.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestfailed = requestfailed.asInstanceOf[js.Any], requestfinished = requestfinished.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], workercreated = workercreated.asInstanceOf[js.Any], workerdestroyed = workerdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageEventObj]
  }
  @scala.inline
  implicit class PageEventObjOps[Self <: PageEventObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: ConsoleMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialog(value: Dialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameattached(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameattached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramedetached(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framedetached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramenavigated(value: Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framenavigated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: AnonMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageerror(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopup(value: Page): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestfailed(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestfailed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestfinished(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestfinished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkercreated(value: Worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workercreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerdestroyed(value: Worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerdestroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
  }
  
}

