package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response including listed notes.
  */
@js.native
trait SchemaListNotesResponse extends js.Object {
  /**
    * The next pagination token in the list response. It should be used as
    * page_token for the following request. An empty value means no more
    * result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The occurrences requested
    */
  var notes: js.UndefOr[js.Array[SchemaNote]] = js.native
}

object SchemaListNotesResponse {
  @scala.inline
  def apply(): SchemaListNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotesResponse]
  }
  @scala.inline
  implicit class SchemaListNotesResponseOps[Self <: SchemaListNotesResponse] (val x: Self) extends AnyVal {
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
    def withNotes(value: js.Array[SchemaNote]): Self = {
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
  }
  
}

