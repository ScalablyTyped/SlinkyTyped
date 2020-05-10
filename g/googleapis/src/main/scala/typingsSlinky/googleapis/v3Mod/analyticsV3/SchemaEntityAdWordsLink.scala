package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics Entity Google Ads Link.
  */
@js.native
trait SchemaEntityAdWordsLink extends js.Object {
  /**
    * A list of Google Ads client accounts. These cannot be MCC accounts. This
    * field is required when creating a Google Ads link. It cannot be empty.
    */
  var adWordsAccounts: js.UndefOr[js.Array[SchemaAdWordsAccount]] = js.native
  /**
    * Web property being linked.
    */
  var entity: js.UndefOr[AnonWebPropertyRef] = js.native
  /**
    * Entity Google Ads link ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for entity Google Ads link.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the link. This field is required when creating a Google Ads link.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of linked Views (Profiles) represented as strings.
    */
  var profileIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL link for this Google Analytics - Google Ads link.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaEntityAdWordsLink {
  @scala.inline
  def apply(): SchemaEntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityAdWordsLink]
  }
  @scala.inline
  implicit class SchemaEntityAdWordsLinkOps[Self <: SchemaEntityAdWordsLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdWordsAccounts(value: js.Array[SchemaAdWordsAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adWordsAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdWordsAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adWordsAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: AnonWebPropertyRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileIds")(js.undefined)
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

