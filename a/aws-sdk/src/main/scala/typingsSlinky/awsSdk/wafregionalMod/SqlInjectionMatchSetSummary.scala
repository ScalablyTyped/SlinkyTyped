package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSetSummary extends js.Object {
  /**
    * The name of the SqlInjectionMatchSet, if any, specified by Id.
    */
  var Name: ResourceName = js.native
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId = js.native
}

object SqlInjectionMatchSetSummary {
  @scala.inline
  def apply(Name: ResourceName, SqlInjectionMatchSetId: ResourceId): SqlInjectionMatchSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetSummary]
  }
  @scala.inline
  implicit class SqlInjectionMatchSetSummaryOps[Self <: SqlInjectionMatchSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlInjectionMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

