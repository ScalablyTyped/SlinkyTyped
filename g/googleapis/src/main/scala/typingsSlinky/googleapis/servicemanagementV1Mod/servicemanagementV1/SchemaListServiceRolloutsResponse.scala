package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListServiceRollouts method.
  */
@js.native
trait SchemaListServiceRolloutsResponse extends js.Object {
  /**
    * The token of the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of rollout resources.
    */
  var rollouts: js.UndefOr[js.Array[SchemaRollout]] = js.native
}

object SchemaListServiceRolloutsResponse {
  @scala.inline
  def apply(): SchemaListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceRolloutsResponse]
  }
  @scala.inline
  implicit class SchemaListServiceRolloutsResponseOps[Self <: SchemaListServiceRolloutsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withRollouts(value: js.Array[SchemaRollout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollouts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollouts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollouts")(js.undefined)
        ret
    }
  }
  
}

