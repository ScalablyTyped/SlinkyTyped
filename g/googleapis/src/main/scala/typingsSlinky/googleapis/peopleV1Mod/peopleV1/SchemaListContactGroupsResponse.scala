package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a list contact groups request.
  */
@js.native
trait SchemaListContactGroupsResponse extends js.Object {
  /**
    * The list of contact groups. Members of the contact groups are not
    * populated.
    */
  var contactGroups: js.UndefOr[js.Array[SchemaContactGroup]] = js.native
  /**
    * The token that can be used to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The token that can be used to retrieve changes since the last request.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  /**
    * The total number of items in the list without pagination.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object SchemaListContactGroupsResponse {
  @scala.inline
  def apply(): SchemaListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContactGroupsResponse]
  }
  @scala.inline
  implicit class SchemaListContactGroupsResponseOps[Self <: SchemaListContactGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroups(value: js.Array[SchemaContactGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroups")(js.undefined)
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
    def withNextSyncToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextSyncToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextSyncToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

