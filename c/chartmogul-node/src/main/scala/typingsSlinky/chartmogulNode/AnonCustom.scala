package typingsSlinky.chartmogulNode

import typingsSlinky.chartmogulNode.mod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustom extends js.Object {
  var custom: js.Array[NewCustomAttributes] = js.native
  var email: String = js.native
}

object AnonCustom {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes], email: String): AnonCustom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustom]
  }
  @scala.inline
  implicit class AnonCustomOps[Self <: AnonCustom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: js.Array[NewCustomAttributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

