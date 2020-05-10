package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDraftsResponse extends js.Object {
  /**
    * List of drafts.
    */
  var drafts: js.UndefOr[js.Array[SchemaDraft]] = js.native
  /**
    * Token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Estimated total number of results.
    */
  var resultSizeEstimate: js.UndefOr[Double] = js.native
}

object SchemaListDraftsResponse {
  @scala.inline
  def apply(): SchemaListDraftsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDraftsResponse]
  }
  @scala.inline
  implicit class SchemaListDraftsResponseOps[Self <: SchemaListDraftsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrafts(value: js.Array[SchemaDraft]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrafts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drafts")(js.undefined)
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
    def withResultSizeEstimate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultSizeEstimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSizeEstimate")(js.undefined)
        ret
    }
  }
  
}

