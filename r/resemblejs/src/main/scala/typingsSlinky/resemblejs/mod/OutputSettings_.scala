package typingsSlinky.resemblejs.mod

import typingsSlinky.resemblejs.AnonBlue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSettings_ extends js.Object {
  var errorColor: AnonBlue = js.native
  var errorType: String = js.native
  var largeImageThreshold: Double = js.native
  var transparency: Double = js.native
}

object OutputSettings_ {
  @scala.inline
  def apply(errorColor: AnonBlue, errorType: String, largeImageThreshold: Double, transparency: Double): OutputSettings_ = {
    val __obj = js.Dynamic.literal(errorColor = errorColor.asInstanceOf[js.Any], errorType = errorType.asInstanceOf[js.Any], largeImageThreshold = largeImageThreshold.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSettings_]
  }
  @scala.inline
  implicit class OutputSettings_Ops[Self <: OutputSettings_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorColor(value: AnonBlue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLargeImageThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeImageThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

