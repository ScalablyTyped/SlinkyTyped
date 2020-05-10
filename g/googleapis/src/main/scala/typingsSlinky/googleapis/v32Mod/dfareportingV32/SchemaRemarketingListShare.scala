package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a remarketing list&#39;s sharing information.
  * Sharing allows other accounts or advertisers to target to your remarketing
  * lists. This resource can be used to manage remarketing list sharing to
  * other accounts and advertisers.
  */
@js.native
trait SchemaRemarketingListShare extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingListShare&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var remarketingListId: js.UndefOr[String] = js.native
  /**
    * Accounts that the remarketing list is shared with.
    */
  var sharedAccountIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertisers that the remarketing list is shared with.
    */
  var sharedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRemarketingListShare {
  @scala.inline
  def apply(): SchemaRemarketingListShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemarketingListShare]
  }
  @scala.inline
  implicit class SchemaRemarketingListShareOps[Self <: SchemaRemarketingListShare] (val x: Self) extends AnyVal {
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
    def withRemarketingListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListId")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedAccountIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAccountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedAdvertiserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAdvertiserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAdvertiserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAdvertiserIds")(js.undefined)
        ret
    }
  }
  
}

