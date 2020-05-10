package typingsSlinky.backstopjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scenario
  extends /* key */ StringDictionary[js.Any] {
   // Allow for custom properties.
  var clickSelector: js.UndefOr[String] = js.native
   // Click the specified DOM element prior to screenshot
  var clickSelectors: js.UndefOr[js.Array[String]] = js.native
   // Simulates multiple sequential click interactions
  var cookiePath: js.UndefOr[String] = js.native
   // Import cookies in JSON format
  var delay: js.UndefOr[Double] = js.native
   // Wait for x milliseconds
  var expect: js.UndefOr[Double] = js.native
   // Use with selectorExpansion true to expect number of results found
  var hideSelectors: js.UndefOr[js.Array[String]] = js.native
   // Selectors set to visibility: hidden
  var hoverSelector: js.UndefOr[String] = js.native
   // Move pointer over the given DOM element prior to screenshot
  var hoverSelectors: js.UndefOr[js.Array[String]] = js.native
   // Simulates multiple sequential hover interactions
  var keyPressSelector: js.UndefOr[KeypressSelector] = js.native
   // Press key in the DOM element prior to screenshot
  var keyPressSelectors: js.UndefOr[js.Array[KeypressSelector]] = js.native
   // Simulates multiple sequential keypress interactions
  var label: String = js.native
   // Tag saved with your reference images
  var misMatchThreshold: js.UndefOr[Double] = js.native
   // Percentage of different pixels allowed to pass test
  var onBeforeScript: js.UndefOr[String] = js.native
   // Used to set up browser state e.g. cookies
  var onReadyScript: js.UndefOr[String] = js.native
   // Used to modify UI state prior to screenshots e.g. hovers, clicks etc
  var postInteractionWait: js.UndefOr[Double] = js.native
   // Wait for selector (ms) after interacting with hover or click
  var readyEvent: js.UndefOr[String] = js.native
   // Wait until this string has been logged to the console
  var readySelector: js.UndefOr[String] = js.native
   // Wait until this selector exists before continuing
  var referenceUrl: js.UndefOr[String] = js.native
   // Specify a different state or environment when creating reference
  var removeSelectors: js.UndefOr[js.Array[String]] = js.native
   // Selectors set to display: none
  var requireSameDimensions: js.UndefOr[Boolean] = js.native
   // If true, take screenshots of all matching selector instances
  var scrollToSelector: js.UndefOr[String] = js.native
   // Selectors to capture
  var selectorExpansion: js.UndefOr[Boolean] = js.native
   // If true, any change in selector size will trigger a failure
  var selectors: js.UndefOr[js.Array[String]] = js.native
   // Scroll the specified DOM element into view prior to screenshots
  var url: String = js.native
   // The url of your app state
  var viewports: js.UndefOr[js.Array[Viewport]] = js.native
}

object Scenario {
  @scala.inline
  def apply(label: String, url: String): Scenario = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenario]
  }
  @scala.inline
  implicit class ScenarioOps[Self <: Scenario] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClickSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withClickSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withCookiePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookiePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookiePath")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withExpect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expect")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPressSelector(value: KeypressSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPressSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPressSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPressSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPressSelectors(value: js.Array[KeypressSelector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPressSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPressSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPressSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withMisMatchThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misMatchThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMisMatchThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misMatchThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnBeforeScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeScript")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadyScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnReadyScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyScript")(js.undefined)
        ret
    }
    @scala.inline
    def withPostInteractionWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInteractionWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostInteractionWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postInteractionWait")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withReadySelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readySelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSelectors")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSameDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSameDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSameDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSameDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollToSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollToSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollToSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectorExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectorExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectorExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectors")(js.undefined)
        ret
    }
    @scala.inline
    def withViewports(value: js.Array[Viewport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewports")(js.undefined)
        ret
    }
  }
  
}

