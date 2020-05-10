package typingsSlinky.cypress.cypressMod.Cypress

import typingsSlinky.cypress.cypressStrings.fullPage
import typingsSlinky.cypress.cypressStrings.runner
import typingsSlinky.cypress.cypressStrings.viewport
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotDefaultsOptions extends ScreenshotOptions {
  var screenshotOnRunFailure: Boolean = js.native
}

object ScreenshotDefaultsOptions {
  @scala.inline
  def apply(
    afterScreenshot: Document_ => Unit,
    beforeScreenshot: Document_ => Unit,
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    padding: Padding,
    scale: Boolean,
    screenshotOnRunFailure: Boolean
  ): ScreenshotDefaultsOptions = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction1(beforeScreenshot), blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenshotOnRunFailure = screenshotOnRunFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDefaultsOptions]
  }
  @scala.inline
  implicit class ScreenshotDefaultsOptionsOps[Self <: ScreenshotDefaultsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScreenshotOnRunFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotOnRunFailure")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

