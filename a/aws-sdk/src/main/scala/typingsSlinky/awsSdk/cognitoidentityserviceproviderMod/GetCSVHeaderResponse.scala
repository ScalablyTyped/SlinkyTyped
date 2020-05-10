package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCSVHeaderResponse extends js.Object {
  /**
    * The header information for the .csv file for the user import job.
    */
  var CSVHeader: js.UndefOr[ListOfStringTypes] = js.native
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object GetCSVHeaderResponse {
  @scala.inline
  def apply(): GetCSVHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCSVHeaderResponse]
  }
  @scala.inline
  implicit class GetCSVHeaderResponseOps[Self <: GetCSVHeaderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCSVHeader(value: ListOfStringTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSVHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCSVHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CSVHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(js.undefined)
        ret
    }
  }
  
}

