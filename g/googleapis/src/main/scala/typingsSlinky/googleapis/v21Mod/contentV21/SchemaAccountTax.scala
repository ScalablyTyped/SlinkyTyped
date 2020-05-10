package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The tax settings of a merchant account. All methods require the admin role.
  */
@js.native
trait SchemaAccountTax extends js.Object {
  /**
    * The ID of the account to which these account tax settings belong.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountTax&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Tax rules. Updating the tax rules will enable US taxes (not reversible).
    * Defining no rules is equivalent to not charging tax at all.
    */
  var rules: js.UndefOr[js.Array[SchemaAccountTaxTaxRule]] = js.native
}

object SchemaAccountTax {
  @scala.inline
  def apply(): SchemaAccountTax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountTax]
  }
  @scala.inline
  implicit class SchemaAccountTaxOps[Self <: SchemaAccountTax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[SchemaAccountTaxTaxRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

