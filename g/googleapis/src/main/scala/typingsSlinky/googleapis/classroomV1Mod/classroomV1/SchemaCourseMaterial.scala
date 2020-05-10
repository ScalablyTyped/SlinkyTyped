package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A material attached to a course as part of a material set.
  */
@js.native
trait SchemaCourseMaterial extends js.Object {
  /**
    * Google Drive file attachment.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.native
  /**
    * Google Forms attachment.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  /**
    * Link atatchment.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * Youtube video attachment.
    */
  var youTubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}

object SchemaCourseMaterial {
  @scala.inline
  def apply(): SchemaCourseMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseMaterial]
  }
  @scala.inline
  implicit class SchemaCourseMaterialOps[Self <: SchemaCourseMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFile(value: SchemaDriveFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: SchemaForm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: SchemaLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withYouTubeVideo(value: SchemaYouTubeVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYouTubeVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youTubeVideo")(js.undefined)
        ret
    }
  }
  
}

