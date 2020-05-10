package typingsSlinky.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for group by findings.
  */
@js.native
trait SchemaGroupFindingsResponse extends js.Object {
  /**
    * Group results. There exists an element for each existing unique
    * combination of property/values. The element contains a count for the
    * number of times those specific property/values appear.
    */
  var groupByResults: js.UndefOr[js.Array[SchemaGroupResult]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Time used for executing the groupBy request.
    */
  var readTime: js.UndefOr[String] = js.native
}

object SchemaGroupFindingsResponse {
  @scala.inline
  def apply(): SchemaGroupFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupFindingsResponse]
  }
  @scala.inline
  implicit class SchemaGroupFindingsResponseOps[Self <: SchemaGroupFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupByResults(value: js.Array[SchemaGroupResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByResults")(js.undefined)
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
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
        ret
    }
  }
  
}

