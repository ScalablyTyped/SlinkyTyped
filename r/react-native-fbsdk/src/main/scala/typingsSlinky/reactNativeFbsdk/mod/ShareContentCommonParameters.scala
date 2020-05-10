package typingsSlinky.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareContentCommonParameters extends js.Object {
  /**
    * A hashtag to be added to the share interface. The hashtag must be 32 characters or less.
    */
  var hashtag: js.UndefOr[String] = js.native
  /**
    * List of IDs for taggable people to tag with this content.
    */
  var peopleIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID for a place to tag with this content.
    */
  var placeId: js.UndefOr[String] = js.native
  /**
    * A value to be added to the referrer URL when a person follows a link from
    * this shared content on feed.
    */
  var ref: js.UndefOr[String] = js.native
}

object ShareContentCommonParameters {
  @scala.inline
  def apply(): ShareContentCommonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareContentCommonParameters]
  }
  @scala.inline
  implicit class ShareContentCommonParametersOps[Self <: ShareContentCommonParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashtag")(js.undefined)
        ret
    }
    @scala.inline
    def withPeopleIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeopleIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peopleIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeId")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
  }
  
}

