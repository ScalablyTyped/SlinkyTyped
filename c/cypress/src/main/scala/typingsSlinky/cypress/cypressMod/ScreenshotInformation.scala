package typingsSlinky.cypress.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single screenshot.
  */
@js.native
trait ScreenshotInformation extends js.Object {
  var height: pixels = js.native
  var name: String = js.native
  /**
    * Absolute path to the saved image
    */
  var path: String = js.native
  var screenshotId: String = js.native
  var takenAt: dateTimeISO = js.native
  var testId: typingsSlinky.cypress.cypressMod.testId = js.native
  var width: pixels = js.native
}

object ScreenshotInformation {
  @scala.inline
  def apply(
    height: pixels,
    name: String,
    path: String,
    screenshotId: String,
    takenAt: dateTimeISO,
    testId: testId,
    width: pixels
  ): ScreenshotInformation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], screenshotId = screenshotId.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotInformation]
  }
  @scala.inline
  implicit class ScreenshotInformationOps[Self <: ScreenshotInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTakenAt(value: dateTimeISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("takenAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestId(value: testId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

