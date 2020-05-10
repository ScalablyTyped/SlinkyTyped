package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedEBook extends Entity {
  // The list of assignments for this eBook.
  var assignments: js.UndefOr[js.Array[ManagedEBookAssignment]] = js.native
  // The date and time when the eBook file was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Description.
  var description: js.UndefOr[String] = js.native
  // The list of installation states for this eBook.
  var deviceStates: js.UndefOr[js.Array[DeviceInstallState]] = js.native
  // Name of the eBook.
  var displayName: js.UndefOr[String] = js.native
  // The more information Url.
  var informationUrl: js.UndefOr[String] = js.native
  // Mobile App Install Summary.
  var installSummary: js.UndefOr[EBookInstallSummary] = js.native
  // Book cover.
  var largeCover: js.UndefOr[MimeContent] = js.native
  // The date and time when the eBook was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The privacy statement Url.
  var privacyInformationUrl: js.UndefOr[String] = js.native
  // The date and time when the eBook was published.
  var publishedDateTime: js.UndefOr[String] = js.native
  // Publisher.
  var publisher: js.UndefOr[String] = js.native
  // The list of installation states for this eBook.
  var userStateSummary: js.UndefOr[js.Array[UserInstallStateSummary]] = js.native
}

object ManagedEBook {
  @scala.inline
  def apply(): ManagedEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedEBook]
  }
  @scala.inline
  implicit class ManagedEBookOps[Self <: ManagedEBook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssignments(value: js.Array[ManagedEBookAssignment]): Self = {
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
    def withDeviceStates(value: js.Array[DeviceInstallState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(js.undefined)
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
    def withInstallSummary(value: EBookInstallSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeCover(value: MimeContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeCover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCover")(js.undefined)
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
    def withPublishedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDateTime")(js.undefined)
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
    def withUserStateSummary(value: js.Array[UserInstallStateSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStateSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStateSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStateSummary")(js.undefined)
        ret
    }
  }
  
}

