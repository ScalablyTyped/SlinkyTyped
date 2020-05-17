package typingsSlinky.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFields extends js.Object {
  var customFields: js.UndefOr[Boolean] = js.native
}

object CustomFields {
  @scala.inline
  def apply(): CustomFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFields]
  }
  @scala.inline
  implicit class CustomFieldsOps[Self <: CustomFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFields(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(js.undefined)
        ret
    }
  }
  
}

