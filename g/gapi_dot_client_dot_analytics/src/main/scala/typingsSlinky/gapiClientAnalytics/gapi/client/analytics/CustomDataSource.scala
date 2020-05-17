package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDataSource extends js.Object {
  /** Account ID to which this custom data source belongs. */
  var accountId: js.UndefOr[String] = js.native
  var childLink: js.UndefOr[Href] = js.native
  /** Time this custom data source was created. */
  var created: js.UndefOr[String] = js.native
  /** Description of custom data source. */
  var description: js.UndefOr[String] = js.native
  /** Custom data source ID. */
  var id: js.UndefOr[String] = js.native
  var importBehavior: js.UndefOr[String] = js.native
  /** Resource type for Analytics custom data source. */
  var kind: js.UndefOr[String] = js.native
  /** Name of this custom data source. */
  var name: js.UndefOr[String] = js.native
  /** Parent link for this custom data source. Points to the web property to which this custom data source belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** IDs of views (profiles) linked to the custom data source. */
  var profilesLinked: js.UndefOr[js.Array[String]] = js.native
  /** Collection of schema headers of the custom data source. */
  var schema: js.UndefOr[js.Array[String]] = js.native
  /** Link for this Analytics custom data source. */
  var selfLink: js.UndefOr[String] = js.native
  /** Type of the custom data source. */
  var `type`: js.UndefOr[String] = js.native
  /** Time this custom data source was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Upload type of the custom data source. */
  var uploadType: js.UndefOr[String] = js.native
  /** Web property ID of the form UA-XXXXX-YY to which this custom data source belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}

object CustomDataSource {
  @scala.inline
  def apply(): CustomDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDataSource]
  }
  @scala.inline
  implicit class CustomDataSourceOps[Self <: CustomDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withChildLink(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withImportBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importBehavior")(js.undefined)
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
    def withParentLink(value: Href): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withProfilesLinked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilesLinked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilesLinked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilesLinked")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
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
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadType")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

