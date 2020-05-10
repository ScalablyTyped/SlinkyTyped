package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targetable remarketing list response
  */
@js.native
trait SchemaTargetableRemarketingListsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetableRemarketingListsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Targetable remarketing list collection.
    */
  var targetableRemarketingLists: js.UndefOr[js.Array[SchemaTargetableRemarketingList]] = js.native
}

object SchemaTargetableRemarketingListsListResponse {
  @scala.inline
  def apply(): SchemaTargetableRemarketingListsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetableRemarketingListsListResponse]
  }
  @scala.inline
  implicit class SchemaTargetableRemarketingListsListResponseOps[Self <: SchemaTargetableRemarketingListsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withTargetableRemarketingLists(value: js.Array[SchemaTargetableRemarketingList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetableRemarketingLists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetableRemarketingLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetableRemarketingLists")(js.undefined)
        ret
    }
  }
  
}

