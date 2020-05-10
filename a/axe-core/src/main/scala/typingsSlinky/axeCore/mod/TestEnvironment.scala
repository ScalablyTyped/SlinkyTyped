package typingsSlinky.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnvironment extends js.Object {
  var orientationAngle: js.UndefOr[Double] = js.native
  var orientationType: js.UndefOr[String] = js.native
  var userAgent: String = js.native
  var windowHeight: Double = js.native
  var windowWidth: Double = js.native
}

object TestEnvironment {
  @scala.inline
  def apply(userAgent: String, windowHeight: Double, windowWidth: Double): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  @scala.inline
  implicit class TestEnvironmentOps[Self <: TestEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationType")(js.undefined)
        ret
    }
  }
  
}

