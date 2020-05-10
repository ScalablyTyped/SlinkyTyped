package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlInjectionMatchSet extends js.Object {
  /**
    * The name, if any, of the SqlInjectionMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for a SqlInjectionMatchSet. You use SqlInjectionMatchSetId to get information about a SqlInjectionMatchSet (see GetSqlInjectionMatchSet), update a SqlInjectionMatchSet (see UpdateSqlInjectionMatchSet), insert a SqlInjectionMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SqlInjectionMatchSet from AWS WAF (see DeleteSqlInjectionMatchSet).  SqlInjectionMatchSetId is returned by CreateSqlInjectionMatchSet and by ListSqlInjectionMatchSets.
    */
  var SqlInjectionMatchSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect for snippets of malicious SQL code.
    */
  var SqlInjectionMatchTuples: typingsSlinky.awsSdk.wafregionalMod.SqlInjectionMatchTuples = js.native
}

object SqlInjectionMatchSet {
  @scala.inline
  def apply(SqlInjectionMatchSetId: ResourceId, SqlInjectionMatchTuples: SqlInjectionMatchTuples): SqlInjectionMatchSet = {
    val __obj = js.Dynamic.literal(SqlInjectionMatchSetId = SqlInjectionMatchSetId.asInstanceOf[js.Any], SqlInjectionMatchTuples = SqlInjectionMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSet]
  }
  @scala.inline
  implicit class SqlInjectionMatchSetOps[Self <: SqlInjectionMatchSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSqlInjectionMatchSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSqlInjectionMatchTuples(value: SqlInjectionMatchTuples): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchTuples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
  }
  
}

