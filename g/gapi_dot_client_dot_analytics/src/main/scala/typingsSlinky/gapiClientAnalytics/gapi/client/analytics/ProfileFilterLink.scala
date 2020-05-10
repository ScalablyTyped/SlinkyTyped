package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileFilterLink extends js.Object {
  /** Filter for this link. */
  var filterRef: js.UndefOr[FilterRef] = js.native
  /** Profile filter link ID. */
  var id: js.UndefOr[String] = js.native
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[String] = js.native
  /** View (Profile) for this link. */
  var profileRef: js.UndefOr[ProfileRef] = js.native
  /**
    * The rank of this profile filter link relative to the other filters linked to the same profile.
    * For readonly (i.e., list and get) operations, the rank always starts at 1.
    * For write (i.e., create, update, or delete) operations, you may specify a value between 0 and 255 inclusively, [0, 255]. In order to insert a link at
    * the end of the list, either don't specify a rank or set a rank to a number greater than the largest rank in the list. In order to insert a link to the
    * beginning of the list specify a rank that is less than or equal to 1. The new link will move all existing filters with the same or lower rank down the
    * list. After the link is inserted/updated/deleted all profile filter links will be renumbered starting at 1.
    */
  var rank: js.UndefOr[Double] = js.native
  /** Link for this profile filter link. */
  var selfLink: js.UndefOr[String] = js.native
}

object ProfileFilterLink {
  @scala.inline
  def apply(): ProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileFilterLink]
  }
  @scala.inline
  implicit class ProfileFilterLinkOps[Self <: ProfileFilterLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterRef(value: FilterRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRef")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
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
    def withProfileRef(value: ProfileRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileRef")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
  }
  
}

