package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Forms item.
  */
@js.native
trait SchemaForm extends js.Object {
  /**
    * URL of the form.
    */
  var formUrl: js.UndefOr[String] = js.native
  /**
    * URL of the form responses document. Only set if respsonses have been
    * recorded and only when the requesting user is an editor of the form.
    * Read-only.
    */
  var responseUrl: js.UndefOr[String] = js.native
  /**
    * URL of a thumbnail image of the Form.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Title of the Form.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaForm {
  @scala.inline
  def apply(): SchemaForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaForm]
  }
  @scala.inline
  implicit class SchemaFormOps[Self <: SchemaForm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

