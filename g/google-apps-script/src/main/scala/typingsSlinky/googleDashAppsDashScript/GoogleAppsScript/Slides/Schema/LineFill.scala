package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineFill extends js.Object {
  var solidFill: js.UndefOr[typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill] = js.undefined
}

object LineFill {
  @scala.inline
  def apply(solidFill: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.SolidFill = null): LineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineFill]
  }
}

