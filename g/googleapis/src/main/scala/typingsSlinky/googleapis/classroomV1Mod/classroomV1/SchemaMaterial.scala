package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Material attached to course work.  When creating attachments, setting the
  * `form` field is not supported.
  */
@js.native
trait SchemaMaterial extends js.Object {
  /**
    * Google Drive file material.
    */
  var driveFile: js.UndefOr[SchemaSharedDriveFile] = js.native
  /**
    * Google Forms material.
    */
  var form: js.UndefOr[SchemaForm] = js.native
  /**
    * Link material. On creation, will be upgraded to a more appropriate type
    * if possible, and this will be reflected in the response.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * YouTube video material.
    */
  var youtubeVideo: js.UndefOr[SchemaYouTubeVideo] = js.native
}

object SchemaMaterial {
  @scala.inline
  def apply(): SchemaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterial]
  }
  @scala.inline
  implicit class SchemaMaterialOps[Self <: SchemaMaterial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriveFile(value: SchemaSharedDriveFile): Self = {
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
    def withYoutubeVideo(value: SchemaYouTubeVideo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYoutubeVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("youtubeVideo")(js.undefined)
        ret
    }
  }
  
}

