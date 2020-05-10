package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * NOTES.
  */
@js.native
trait SchemaNotesProperties extends js.Object {
  /**
    * The object ID of the shape on this notes page that contains the speaker
    * notes for the corresponding slide. The actual shape may not always exist
    * on the notes page. Inserting text using this object ID will automatically
    * create the shape. In this case, the actual shape may have different
    * object ID. The `GetPresentation` or `GetPage` action will always return
    * the latest object ID.
    */
  var speakerNotesObjectId: js.UndefOr[String] = js.native
}

object SchemaNotesProperties {
  @scala.inline
  def apply(): SchemaNotesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotesProperties]
  }
  @scala.inline
  implicit class SchemaNotesPropertiesOps[Self <: SchemaNotesProperties] (val x: Self) extends AnyVal {
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

