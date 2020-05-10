package typingsSlinky.postmanCollection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncode extends js.Object {
  var encode: js.UndefOr[Boolean] = js.native
  var ignoreDisabled: js.UndefOr[Boolean] = js.native
}

object AnonEncode {
  @scala.inline
  def apply(): AnonEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEncode]
  }
  @scala.inline
  implicit class AnonEncodeOps[Self <: AnonEncode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDisabled")(js.undefined)
        ret
    }
  }
  
}

