package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for profiles visible to the buyer.
  */
@js.native
trait SchemaListPublisherProfilesResponse extends js.Object {
  /**
    * List pagination support
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching publisher profiles.
    */
  var publisherProfiles: js.UndefOr[js.Array[SchemaPublisherProfile]] = js.native
}

object SchemaListPublisherProfilesResponse {
  @scala.inline
  def apply(): SchemaListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherProfilesResponse]
  }
  @scala.inline
  implicit class SchemaListPublisherProfilesResponseOps[Self <: SchemaListPublisherProfilesResponse] (val x: Self) extends AnyVal {
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
    def withPublisherProfiles(value: js.Array[SchemaPublisherProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisherProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherProfiles")(js.undefined)
        ret
    }
  }
  
}

