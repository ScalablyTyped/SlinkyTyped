package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionsResponse extends js.Object {
  /**
    * A continuation token, if the list of functions returned does not include the last requested function.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of requested function definitions.
    */
  var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.native
}

object GetUserDefinedFunctionsResponse {
  @scala.inline
  def apply(): GetUserDefinedFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
  }
  @scala.inline
  implicit class GetUserDefinedFunctionsResponseOps[Self <: GetUserDefinedFunctionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedFunctions(value: UserDefinedFunctionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedFunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserDefinedFunctions")(js.undefined)
        ret
    }
  }
  
}

