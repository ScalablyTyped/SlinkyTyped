package typingsSlinky.evernote

import typingsSlinky.evernote.mod.Types.Guid
import typingsSlinky.evernote.mod.Types.LazyMap
import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAltitude extends js.Object {
  var altitude: js.UndefOr[Double] = js.native
  var applicationData: js.UndefOr[LazyMap] = js.native
  var author: js.UndefOr[String] = js.native
  var classifications: js.UndefOr[Map[String, String]] = js.native
  var conflictSourceNoteGuid: js.UndefOr[Guid] = js.native
  var contentClass: js.UndefOr[String] = js.native
  var creatorId: js.UndefOr[UserID] = js.native
  var lastEditedBy: js.UndefOr[String] = js.native
  var lastEditorId: js.UndefOr[UserID] = js.native
  var latitude: js.UndefOr[Double] = js.native
  var longitude: js.UndefOr[Double] = js.native
  var noteTitleQuality: js.UndefOr[Double] = js.native
  var placeName: js.UndefOr[String] = js.native
  var reminderDoneTime: js.UndefOr[Timestamp] = js.native
  var reminderOrder: js.UndefOr[Double] = js.native
  var reminderTime: js.UndefOr[Timestamp] = js.native
  var shareDate: js.UndefOr[Timestamp] = js.native
  var sharedWithBusiness: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[String] = js.native
  var sourceApplication: js.UndefOr[String] = js.native
  var sourceURL: js.UndefOr[String] = js.native
  var subjectDate: js.UndefOr[Timestamp] = js.native
}

object AnonAltitude {
  @scala.inline
  def apply(): AnonAltitude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAltitude]
  }
  @scala.inline
  implicit class AnonAltitudeOps[Self <: AnonAltitude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationData(value: LazyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationData")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(js.undefined)
        ret
    }
    @scala.inline
    def withClassifications(value: Map[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classifications")(js.undefined)
        ret
    }
    @scala.inline
    def withConflictSourceNoteGuid(value: Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictSourceNoteGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictSourceNoteGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictSourceNoteGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withContentClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatorId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEditedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEditedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastEditorId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEditorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditorId")(js.undefined)
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteTitleQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTitleQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteTitleQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTitleQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeName")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderDoneTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderDoneTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderDoneTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderDoneTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShareDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedWithBusiness(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithBusiness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedWithBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedWithBusiness")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectDate")(js.undefined)
        ret
    }
  }
  
}

