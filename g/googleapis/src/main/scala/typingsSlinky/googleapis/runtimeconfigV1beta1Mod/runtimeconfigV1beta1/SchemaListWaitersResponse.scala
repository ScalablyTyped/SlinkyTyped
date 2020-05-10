package typingsSlinky.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListWaiters()` method. Order of returned waiter objects
  * is arbitrary.
  */
@js.native
trait SchemaListWaitersResponse extends js.Object {
  /**
    * This token allows you to get the next page of results for list requests.
    * If the number of results is larger than `pageSize`, use the
    * `nextPageToken` as a value for the query parameter `pageToken` in the
    * next list request. Subsequent list requests will have their own
    * `nextPageToken` to continue paging through the results
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Found waiters in the project.
    */
  var waiters: js.UndefOr[js.Array[SchemaWaiter]] = js.native
}

object SchemaListWaitersResponse {
  @scala.inline
  def apply(): SchemaListWaitersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWaitersResponse]
  }
  @scala.inline
  implicit class SchemaListWaitersResponseOps[Self <: SchemaListWaitersResponse] (val x: Self) extends AnyVal {
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
    def withWaiters(value: js.Array[SchemaWaiter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waiters")(js.undefined)
        ret
    }
  }
  
}

