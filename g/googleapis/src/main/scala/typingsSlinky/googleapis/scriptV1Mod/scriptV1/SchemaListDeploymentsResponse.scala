package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response with the list of deployments for the specified Apps Script
  * project.
  */
@js.native
trait SchemaListDeploymentsResponse extends js.Object {
  /**
    * The list of deployments.
    */
  var deployments: js.UndefOr[js.Array[SchemaDeployment]] = js.native
  /**
    * The token that can be used in the next call to get the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDeploymentsResponse {
  @scala.inline
  def apply(): SchemaListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeploymentsResponse]
  }
  @scala.inline
  implicit class SchemaListDeploymentsResponseOps[Self <: SchemaListDeploymentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployments(value: js.Array[SchemaDeployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployments")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

