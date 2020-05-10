package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProofSchemaPredicate extends js.Object {
  var name: String = js.native
  var p_type: String = js.native
  var p_value: Double = js.native
  var restrictions: js.Array[Restriction] = js.native
}

object ProofSchemaPredicate {
  @scala.inline
  def apply(name: String, p_type: String, p_value: Double, restrictions: js.Array[Restriction]): ProofSchemaPredicate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], p_type = p_type.asInstanceOf[js.Any], p_value = p_value.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchemaPredicate]
  }
  @scala.inline
  implicit class ProofSchemaPredicateOps[Self <: ProofSchemaPredicate] (val x: Self) extends AnyVal {
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
    def withP_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP_value(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: js.Array[Restriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

