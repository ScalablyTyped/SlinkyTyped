package typingsSlinky.expectPuppeteer.mod

import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.left
import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.middle
import typingsSlinky.expectPuppeteer.expectPuppeteerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectToClickOptions extends ExpectTimingActions {
  /**
    * Defaults to left.
    */
  var button: js.UndefOr[left | right | middle] = js.undefined
  /**
    * defaults to 1. See UIEvent.detail.
    */
  var clickCount: js.UndefOr[Double] = js.undefined
  /**
    * A text or a RegExp to match in element textContent.
    */
  var text: js.UndefOr[String | js.RegExp] = js.undefined
  /**
    * wait for element to be present in DOM and to be visible, i.e. to not have display: none or visibility: hidden CSS properties. Defaults to false.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ExpectToClickOptions {
  @scala.inline
  def apply(
    button: left | right | middle = null,
    clickCount: js.UndefOr[Double] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    polling: ExpectPolling = null,
    text: String | js.RegExp = null,
    timeout: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (!js.isUndefined(clickCount)) __obj.updateDynamic("clickCount")(clickCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectToClickOptions]
  }
}

