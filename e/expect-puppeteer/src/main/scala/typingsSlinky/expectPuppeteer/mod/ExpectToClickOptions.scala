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
    clickCount: Int | Double = null,
    delay: Int | Double = null,
    polling: ExpectPolling = null,
    text: String | js.RegExp = null,
    timeout: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ExpectToClickOptions = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectToClickOptions]
  }
}

