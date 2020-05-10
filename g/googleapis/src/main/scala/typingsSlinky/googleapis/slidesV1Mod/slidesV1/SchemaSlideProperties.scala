package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of Page that are only relevant for pages with page_type
  * SLIDE.
  */
@js.native
trait SchemaSlideProperties extends js.Object {
  /**
    * The object ID of the layout that this slide is based on. This property is
    * read-only.
    */
  var layoutObjectId: js.UndefOr[String] = js.native
  /**
    * The object ID of the master that this slide is based on. This property is
    * read-only.
    */
  var masterObjectId: js.UndefOr[String] = js.native
  /**
    * The notes page that this slide is associated with. It defines the visual
    * appearance of a notes page when printing or exporting slides with speaker
    * notes. A notes page inherits properties from the notes master. The
    * placeholder shape with type BODY on the notes page contains the speaker
    * notes for this slide. The ID of this shape is identified by the
    * speakerNotesObjectId field. The notes page is read-only except for the
    * text content and styles of the speaker notes shape. This property is
    * read-only.
    */
  var notesPage: js.UndefOr[SchemaPage] = js.native
}

object SchemaSlideProperties {
  @scala.inline
  def apply(): SchemaSlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlideProperties]
  }
  @scala.inline
  implicit class SchemaSlidePropertiesOps[Self <: SchemaSlideProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotesPage(value: SchemaPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotesPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesPage")(js.undefined)
        ret
    }
  }
  
}

