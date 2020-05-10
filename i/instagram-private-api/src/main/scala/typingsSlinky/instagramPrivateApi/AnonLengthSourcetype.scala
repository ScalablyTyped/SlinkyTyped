package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLengthSourcetype extends js.Object {
  var length: Double = js.native
  var source_type: `3` | `4` = js.native
}

object AnonLengthSourcetype {
  @scala.inline
  def apply(length: Double, source_type: `3` | `4`): AnonLengthSourcetype = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLengthSourcetype]
  }
  @scala.inline
  implicit class AnonLengthSourcetypeOps[Self <: AnonLengthSourcetype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_type(value: `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

