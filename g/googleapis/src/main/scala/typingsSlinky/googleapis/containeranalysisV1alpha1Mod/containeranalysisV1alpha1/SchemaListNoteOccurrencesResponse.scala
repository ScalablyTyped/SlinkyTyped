package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed occurrences for a note.
  */
@js.native
trait SchemaListNoteOccurrencesResponse extends js.Object {
  /**
    * Token to receive the next page of notes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences attached to the specified note.
    */
  var occurrences: js.UndefOr[js.Array[SchemaOccurrence]] = js.native
}

object SchemaListNoteOccurrencesResponse {
  @scala.inline
  def apply(): SchemaListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNoteOccurrencesResponse]
  }
  @scala.inline
  implicit class SchemaListNoteOccurrencesResponseOps[Self <: SchemaListNoteOccurrencesResponse] (val x: Self) extends AnyVal {
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
    def withOccurrences(value: js.Array[SchemaOccurrence]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOccurrences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("occurrences")(js.undefined)
        ret
    }
  }
  
}

