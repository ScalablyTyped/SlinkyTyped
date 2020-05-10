package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotesProperties extends js.Object {
  var speakerNotesObjectId: js.UndefOr[String] = js.native
}

object NotesProperties {
  @scala.inline
  def apply(): NotesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotesProperties]
  }
  @scala.inline
  implicit class NotesPropertiesOps[Self <: NotesProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpeakerNotesObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakerNotesObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeakerNotesObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speakerNotesObjectId")(js.undefined)
        ret
    }
  }
  
}

