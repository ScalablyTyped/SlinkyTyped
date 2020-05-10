package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofSchemaAttribute extends js.Object {
  var restrictions: js.UndefOr[js.Array[Restriction]] = js.native
}

object ProofSchemaAttribute {
  @scala.inline
  def apply(): ProofSchemaAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofSchemaAttribute]
  }
  @scala.inline
  implicit class ProofSchemaAttributeOps[Self <: ProofSchemaAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictions(value: js.Array[Restriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(js.undefined)
        ret
    }
  }
  
}

