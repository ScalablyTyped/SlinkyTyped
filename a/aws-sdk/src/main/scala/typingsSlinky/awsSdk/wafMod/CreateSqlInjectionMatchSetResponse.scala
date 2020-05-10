package typingsSlinky.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSqlInjectionMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typingsSlinky.awsSdk.wafMod.ChangeToken] = js.native
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[typingsSlinky.awsSdk.wafMod.SqlInjectionMatchSet] = js.native
}

object CreateSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
  @scala.inline
  implicit class CreateSqlInjectionMatchSetResponseOps[Self <: CreateSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeToken(value: ChangeToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeToken")(js.undefined)
        ret
    }
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

