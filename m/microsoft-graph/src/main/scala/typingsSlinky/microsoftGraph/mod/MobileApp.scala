package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileApp extends Entity {
  // The list of group assignments for this mobile app.
  var assignments: js.UndefOr[js.Array[MobileAppAssignment]] = js.native
  // The list of categories for this app.
  var categories: js.UndefOr[js.Array[MobileAppCategory]] = js.native
  // The date and time the app was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // The description of the app.
  var description: js.UndefOr[String] = js.native
  // The developer of the app.
  var developer: js.UndefOr[String] = js.native
  // The admin provided or imported title of the app.
  var displayName: js.UndefOr[String] = js.native
  // The more information Url.
  var informationUrl: js.UndefOr[String] = js.native
  // The value indicating whether the app is marked as featured by the admin.
  var isFeatured: js.UndefOr[Boolean] = js.native
  // The large icon, to be displayed in the app details and used for upload of the icon.
  var largeIcon: js.UndefOr[MimeContent] = js.native
  // The date and time the app was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Notes for the app.
  var notes: js.UndefOr[String] = js.native
  // The owner of the app.
  var owner: js.UndefOr[String] = js.native
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[String] = js.native
  // The publisher of the app.
  var publisher: js.UndefOr[String] = js.native
  /**
    * The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are:
    * notPublished, processing, published.
    */
  var publishingState: js.UndefOr[MobileAppPublishingState] = js.native
}

object MobileApp {
  @scala.inline
  def apply(): MobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileApp]
  }
  @scala.inline
  implicit class MobileAppOps[Self <: MobileApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[MobileAppAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[MobileAppCategory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
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
    def withDeveloper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developer")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withInformationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFeatured(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFeatured")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFeatured: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFeatured")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeIcon(value: MimeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivacyInformationUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyInformationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivacyInformationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privacyInformationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishingState(value: MobileAppPublishingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishingState")(js.undefined)
        ret
    }
  }
  
}

