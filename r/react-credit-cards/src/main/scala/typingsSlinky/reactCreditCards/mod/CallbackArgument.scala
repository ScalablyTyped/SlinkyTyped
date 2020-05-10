package typingsSlinky.reactCreditCards.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackArgument extends js.Object {
  var issuer: String = js.native
  var maxLength: Double = js.native
}

object CallbackArgument {
  @scala.inline
  def apply(issuer: String, maxLength: Double): CallbackArgument = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgument]
  }
  @scala.inline
  implicit class CallbackArgumentOps[Self <: CallbackArgument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

