package typingsSlinky.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quality extends js.Object {
  var Quality: String = js.native
}

object Quality {
  @scala.inline
  def apply(Quality: String): Quality = {
    val __obj = js.Dynamic.literal(Quality = Quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quality]
  }
  @scala.inline
  implicit class QualityOps[Self <: Quality] (val x: Self) extends AnyVal {
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

