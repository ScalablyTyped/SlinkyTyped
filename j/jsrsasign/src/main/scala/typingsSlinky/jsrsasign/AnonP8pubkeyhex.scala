package typingsSlinky.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonP8pubkeyhex extends js.Object {
  var p8pubkeyhex: String = js.native
}

object AnonP8pubkeyhex {
  @scala.inline
  def apply(p8pubkeyhex: String): AnonP8pubkeyhex = {
    val __obj = js.Dynamic.literal(p8pubkeyhex = p8pubkeyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonP8pubkeyhex]
  }
  @scala.inline
  implicit class AnonP8pubkeyhexOps[Self <: AnonP8pubkeyhex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withP8pubkeyhex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p8pubkeyhex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

