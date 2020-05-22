package typingsSlinky.cypress.anon

import org.scalajs.dom.raw.Document
import typingsSlinky.cypress.cypressMod.Cypress.Dimensions
import typingsSlinky.cypress.cypressMod.Cypress.Padding
import typingsSlinky.cypress.cypressStrings.fullPage
import typingsSlinky.cypress.cypressStrings.runner
import typingsSlinky.cypress.cypressStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ScreenshotDefaultsOptions> */
trait PartialScreenshotDefaults extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document, Unit]] = js.undefined
  var blackout: js.UndefOr[js.Array[String]] = js.undefined
  var capture: js.UndefOr[runner | viewport | fullPage] = js.undefined
  var clip: js.UndefOr[Dimensions] = js.undefined
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var scale: js.UndefOr[Boolean] = js.undefined
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
}

object PartialScreenshotDefaults {
  @scala.inline
  def apply(
    afterScreenshot: /* doc */ Document => Unit = null,
    beforeScreenshot: /* doc */ Document => Unit = null,
    blackout: js.Array[String] = null,
    capture: runner | viewport | fullPage = null,
    clip: Dimensions = null,
    disableTimersAndAnimations: js.UndefOr[Boolean] = js.undefined,
    padding: Padding = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
  ): PartialScreenshotDefaults = {
    val __obj = js.Dynamic.literal()
    if (afterScreenshot != null) __obj.updateDynamic("afterScreenshot")(js.Any.fromFunction1(afterScreenshot))
    if (beforeScreenshot != null) __obj.updateDynamic("beforeScreenshot")(js.Any.fromFunction1(beforeScreenshot))
    if (blackout != null) __obj.updateDynamic("blackout")(blackout.asInstanceOf[js.Any])
    if (capture != null) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTimersAndAnimations)) __obj.updateDynamic("disableTimersAndAnimations")(disableTimersAndAnimations.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenshotOnRunFailure)) __obj.updateDynamic("screenshotOnRunFailure")(screenshotOnRunFailure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScreenshotDefaults]
  }
}

