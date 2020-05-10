package typingsSlinky.hapiIron.mod

import typingsSlinky.hapiIron.AnonIvBits
import typingsSlinky.hapiIron.AnonKeyBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithms_ extends js.Object {
  var `aes-128-ctr`: AnonIvBits = js.native
  var `aes-256-cbc`: AnonIvBits = js.native
  var sha256: AnonKeyBits = js.native
}

object Algorithms_ {
  @scala.inline
  def apply(`aes-128-ctr`: AnonIvBits, `aes-256-cbc`: AnonIvBits, sha256: AnonKeyBits): Algorithms_ = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`.asInstanceOf[js.Any])
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms_]
  }
  @scala.inline
  implicit class Algorithms_Ops[Self <: Algorithms_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAes-128-ctr`(value: AnonIvBits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aes-128-ctr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAes-256-cbc`(value: AnonIvBits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aes-256-cbc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha256(value: AnonKeyBits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha256")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

