package typingsSlinky.hubspotPace.HubSpotPaceInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaceOptions extends js.Object {
  var ajax: js.UndefOr[Boolean | PaceAjaxOptions] = js.native
  /**
    * How long should it take for the bar to animate to a new point after receiving it
    */
  var catchupTime: js.UndefOr[Double] = js.native
  var document: js.UndefOr[Boolean | String] = js.native
  /**
    * This tweaks the animation easing
    */
  var easeFactor: js.UndefOr[Double] = js.native
  var elements: js.UndefOr[Boolean | PaceElementsOptions] = js.native
  var eventLag: js.UndefOr[Boolean | PaceEventLagOptions] = js.native
  /**
    * What is the minimum amount of time the bar should sit after the last update before disappearing
    */
  var ghostTime: js.UndefOr[Double] = js.native
  /**
    * How quickly should the bar be moving before it has any progress info from a new source in %/ms
    */
  var initialRate: js.UndefOr[Double] = js.native
  /**
    * Its easy for a bunch of the bar to be eaten in the first few frames before we know how much there is to load. This limits how much of the bar can be used per frame
    */
  var maxProgressPerFrame: js.UndefOr[Double] = js.native
  /**
    * What is the minimum amount of time the bar should be on the screen. Irrespective of this number, the bar will always be on screen for 33 * (100 / maxProgressPerFrame) + ghostTime ms.
    */
  var minTime: js.UndefOr[Double] = js.native
  /**
    * Should we restart the browser when pushState or replaceState is called?  (Generally means ajax navigation has occured)
    */
  var restartOnPushState: js.UndefOr[Boolean] = js.native
  /**
    * Should we show the progress bar for every ajax request (not just regular or ajax-y page navigation)? Set to false to disable. If so, how many ms does the request have to be running for before we show the progress?
    */
  var restartOnRequestAfter: js.UndefOr[Boolean | Double] = js.native
  /**
    * Should pace automatically start when the page is loaded, or should it wait for `start` to be called? Always false if pace is loaded with AMD or CommonJS.
    */
  var startOnPageLoad: js.UndefOr[Boolean] = js.native
  /**
    * What element should the pace element be appended to on the page?
    */
  var target: js.UndefOr[String] = js.native
}

object PaceOptions {
  @scala.inline
  def apply(): PaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaceOptions]
  }
  @scala.inline
  implicit class PaceOptionsOps[Self <: PaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjax(value: Boolean | PaceAjaxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withCatchupTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchupTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatchupTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catchupTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEaseFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withElements(value: Boolean | PaceElementsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(js.undefined)
        ret
    }
    @scala.inline
    def withEventLag(value: Boolean | PaceEventLagOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventLag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventLag")(js.undefined)
        ret
    }
    @scala.inline
    def withGhostTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGhostTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghostTime")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialRate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxProgressPerFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressPerFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxProgressPerFrame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxProgressPerFrame")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartOnPushState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnPushState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartOnPushState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnPushState")(js.undefined)
        ret
    }
    @scala.inline
    def withRestartOnRequestAfter(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnRequestAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestartOnRequestAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restartOnRequestAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnPageLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnPageLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnPageLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnPageLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

