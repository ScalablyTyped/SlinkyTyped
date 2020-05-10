package typingsSlinky.cypress

import typingsSlinky.cypress.cypressMod.Cypress.Dimensions
import typingsSlinky.cypress.cypressMod.Cypress.Padding
import typingsSlinky.cypress.cypressStrings.fullPage
import typingsSlinky.cypress.cypressStrings.runner
import typingsSlinky.cypress.cypressStrings.viewport
import typingsSlinky.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.ScreenshotDefaultsOptions> */
@js.native
trait PartialScreenshotDefaults extends js.Object {
  var afterScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.native
  var beforeScreenshot: js.UndefOr[js.Function1[/* doc */ Document_, Unit]] = js.native
  var blackout: js.UndefOr[js.Array[String]] = js.native
  var capture: js.UndefOr[runner | viewport | fullPage] = js.native
  var clip: js.UndefOr[Dimensions] = js.native
  var disableTimersAndAnimations: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.native
}

object PartialScreenshotDefaults {
  @scala.inline
  def apply(): PartialScreenshotDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScreenshotDefaults]
  }
  @scala.inline
  implicit class PartialScreenshotDefaultsOps[Self <: PartialScreenshotDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterScreenshot(value: /* doc */ Document_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeScreenshot(value: /* doc */ Document_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScreenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackout(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackout")(js.undefined)
        ret
    }
    @scala.inline
    def withCapture(value: runner | viewport | fullPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(js.undefined)
        ret
    }
    @scala.inline
    def withClip(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTimersAndAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimersAndAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTimersAndAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimersAndAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshotOnRunFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotOnRunFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshotOnRunFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotOnRunFailure")(js.undefined)
        ret
    }
  }
  
}

