package typingsSlinky.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFargateProfilesResponse extends js.Object {
  /**
    * A list of all of the Fargate profiles associated with the specified cluster.
    */
  var fargateProfileNames: js.UndefOr[StringList] = js.native
  /**
    * The nextToken value to include in a future ListFargateProfiles request. When the results of a ListFargateProfiles request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListFargateProfilesResponse {
  @scala.inline
  def apply(): ListFargateProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFargateProfilesResponse]
  }
  @scala.inline
  implicit class ListFargateProfilesResponseOps[Self <: ListFargateProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFargateProfileNames(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFargateProfileNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fargateProfileNames")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

