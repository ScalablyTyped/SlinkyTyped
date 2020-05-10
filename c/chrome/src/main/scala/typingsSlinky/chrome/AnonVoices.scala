package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVoices extends js.Object {
  var voices: js.Array[AnonEventtypes] = js.native
}

object AnonVoices {
  @scala.inline
  def apply(voices: js.Array[AnonEventtypes]): AnonVoices = {
    val __obj = js.Dynamic.literal(voices = voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVoices]
  }
  @scala.inline
  implicit class AnonVoicesOps[Self <: AnonVoices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoices(value: js.Array[AnonEventtypes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

