package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.anon.I
import typingsSlinky.overlayscrollbars.anon.XBoolean
import typingsSlinky.overlayscrollbars.anon.XNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Globals extends js.Object {
  var autoUpdateLoop: Boolean = js.native
  var autoUpdateRecommended: Boolean = js.native
  var cssCalc: String | Null = js.native
  var nativeScrollbarIsOverlaid: XBoolean = js.native
  var nativeScrollbarSize: XNumber = js.native
  var nativeScrollbarStyling: Boolean = js.native
  var overlayScrollbarDummySize: XNumber = js.native
  var restrictedMeasuring: Boolean = js.native
  var rtlScrollBehavior: I = js.native
  var supportMutationObserver: Boolean = js.native
  var supportPassiveEvents: Boolean = js.native
  var supportResizeObserver: Boolean = js.native
  var supportTransform: Boolean = js.native
  var supportTransition: Boolean = js.native
}

object Globals {
  @scala.inline
  def apply(
    autoUpdateLoop: Boolean,
    autoUpdateRecommended: Boolean,
    nativeScrollbarIsOverlaid: XBoolean,
    nativeScrollbarSize: XNumber,
    nativeScrollbarStyling: Boolean,
    overlayScrollbarDummySize: XNumber,
    restrictedMeasuring: Boolean,
    rtlScrollBehavior: I,
    supportMutationObserver: Boolean,
    supportPassiveEvents: Boolean,
    supportResizeObserver: Boolean,
    supportTransform: Boolean,
    supportTransition: Boolean
  ): Globals = {
    val __obj = js.Dynamic.literal(autoUpdateLoop = autoUpdateLoop.asInstanceOf[js.Any], autoUpdateRecommended = autoUpdateRecommended.asInstanceOf[js.Any], nativeScrollbarIsOverlaid = nativeScrollbarIsOverlaid.asInstanceOf[js.Any], nativeScrollbarSize = nativeScrollbarSize.asInstanceOf[js.Any], nativeScrollbarStyling = nativeScrollbarStyling.asInstanceOf[js.Any], overlayScrollbarDummySize = overlayScrollbarDummySize.asInstanceOf[js.Any], restrictedMeasuring = restrictedMeasuring.asInstanceOf[js.Any], rtlScrollBehavior = rtlScrollBehavior.asInstanceOf[js.Any], supportMutationObserver = supportMutationObserver.asInstanceOf[js.Any], supportPassiveEvents = supportPassiveEvents.asInstanceOf[js.Any], supportResizeObserver = supportResizeObserver.asInstanceOf[js.Any], supportTransform = supportTransform.asInstanceOf[js.Any], supportTransition = supportTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Globals]
  }
  @scala.inline
  implicit class GlobalsOps[Self <: Globals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdateLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateLoop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoUpdateRecommended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateRecommended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeScrollbarIsOverlaid(value: XBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeScrollbarIsOverlaid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeScrollbarSize(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeScrollbarStyling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeScrollbarStyling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlayScrollbarDummySize(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayScrollbarDummySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictedMeasuring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedMeasuring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRtlScrollBehavior(value: I): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtlScrollBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportMutationObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportMutationObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportPassiveEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportPassiveEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportResizeObserver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportResizeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssCalc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssCalc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssCalcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssCalc")(null)
        ret
    }
  }
  
}

