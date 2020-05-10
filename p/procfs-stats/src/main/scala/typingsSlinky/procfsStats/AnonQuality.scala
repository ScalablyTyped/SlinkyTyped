package typingsSlinky.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQuality extends js.Object {
  var Quality: String = js.native
}

object AnonQuality {
  @scala.inline
  def apply(Quality: String): AnonQuality = {
    val __obj = js.Dynamic.literal(Quality = Quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuality]
  }
  @scala.inline
  implicit class AnonQualityOps[Self <: AnonQuality] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

