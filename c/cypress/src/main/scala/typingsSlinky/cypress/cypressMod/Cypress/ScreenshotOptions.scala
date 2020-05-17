package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.Document
import typingsSlinky.cypress.cypressStrings.fullPage
import typingsSlinky.cypress.cypressStrings.runner
import typingsSlinky.cypress.cypressStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotOptions extends js.Object {
  var blackout: js.Array[String] = js.native
  var capture: runner | viewport | fullPage = js.native
  var clip: Dimensions = js.native
  var disableTimersAndAnimations: Boolean = js.native
  var padding: Padding = js.native
  var scale: Boolean = js.native
  def afterScreenshot(doc: Document): Unit = js.native
  def beforeScreenshot(doc: Document): Unit = js.native
}

object ScreenshotOptions {
  @scala.inline
  def apply(
    afterScreenshot: Document => Unit,
    beforeScreenshot: Document => Unit,
    blackout: js.Array[String],
    capture: runner | viewport | fullPage,
    clip: Dimensions,
    disableTimersAndAnimations: Boolean,
    padding: Padding,
    scale: Boolean
  ): ScreenshotOptions = {
    val __obj = js.Dynamic.literal(afterScreenshot = js.Any.fromFunction1(afterScreenshot), beforeScreenshot = js.Any.fromFunction1(beforeScreenshot), blackout = blackout.asInstanceOf[js.Any], capture = capture.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], disableTimersAndAnimations = disableTimersAndAnimations.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotOptions]
  }
  @scala.inline
  implicit class ScreenshotOptionsOps[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterScreenshot(value: Document => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBeforeScreenshot(value: Document => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeScreenshot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlackout(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapture(value: runner | viewport | fullPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClip(value: Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableTimersAndAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimersAndAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

