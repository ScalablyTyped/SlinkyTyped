package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSqlInjectionMatchSetResponse extends js.Object {
  /**
    * Information about the SqlInjectionMatchSet that you specified in the GetSqlInjectionMatchSet request. For more information, see the following topics:    SqlInjectionMatchSet: Contains Name, SqlInjectionMatchSetId, and an array of SqlInjectionMatchTuple objects    SqlInjectionMatchTuple: Each SqlInjectionMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var SqlInjectionMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.SqlInjectionMatchSet] = js.native
}

object GetSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(): GetSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSqlInjectionMatchSetResponse]
  }
  @scala.inline
  implicit class GetSqlInjectionMatchSetResponseOps[Self <: GetSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSqlInjectionMatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SqlInjectionMatchSet")(js.undefined)
        ret
    }
  }
  
}

