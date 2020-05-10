package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a hold within Vault. A hold restricts purging of artifacts based
  * on the combination of the query and accounts restrictions. A hold can be
  * configured to either apply to an explicitly configured set of accounts, or
  * can be applied to all members of an organizational unit.
  */
@js.native
trait SchemaHold extends js.Object {
  /**
    * If set, the hold applies to the enumerated accounts and org_unit must be
    * empty.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.native
  /**
    * The corpus to be searched.
    */
  var corpus: js.UndefOr[String] = js.native
  /**
    * The unique immutable ID of the hold. Assigned during creation.
    */
  var holdId: js.UndefOr[String] = js.native
  /**
    * The name of the hold.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If set, the hold applies to all members of the organizational unit and
    * accounts must be empty. This property is mutable. For groups holds, set
    * the accounts field.
    */
  var orgUnit: js.UndefOr[SchemaHeldOrgUnit] = js.native
  /**
    * The corpus-specific query. If set, the corpusQuery must match corpus
    * type.
    */
  var query: js.UndefOr[SchemaCorpusQuery] = js.native
  /**
    * The last time this hold was modified.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaHold {
  @scala.inline
  def apply(): SchemaHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHold]
  }
  @scala.inline
  implicit class SchemaHoldOps[Self <: SchemaHold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[SchemaHeldAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
    @scala.inline
    def withCorpus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corpus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorpus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corpus")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holdId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgUnit(value: SchemaHeldOrgUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaCorpusQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

