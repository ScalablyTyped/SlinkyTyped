package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.Document
import typingsSlinky.cypress.cypressStrings.fullPage
import typingsSlinky.cypress.cypressStrings.runner
import typingsSlinky.cypress.cypressStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotOptions extends js.Object {
  var blackout: js.Array[String]
  var capture: runner | viewport | fullPage
  var clip: Dimensions
  var disableTimersAndAnimations: Boolean
  var padding: Padding
  var scale: Boolean
  def afterScreenshot(doc: Document): Unit
  def beforeScreenshot(doc: Document): Unit
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
}

