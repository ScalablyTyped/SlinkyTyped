package typingsSlinky.pulumiAws.outputMod.elb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslNegotiationPolicyAttribute extends js.Object {
  /**
    * The name of the attribute
    */
  var name: String = js.native
  /**
    * The value of the attribute
    */
  var value: String = js.native
}

object SslNegotiationPolicyAttribute {
  @scala.inline
  def apply(name: String, value: String): SslNegotiationPolicyAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslNegotiationPolicyAttribute]
  }
  @scala.inline
  implicit class SslNegotiationPolicyAttributeOps[Self <: SslNegotiationPolicyAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

