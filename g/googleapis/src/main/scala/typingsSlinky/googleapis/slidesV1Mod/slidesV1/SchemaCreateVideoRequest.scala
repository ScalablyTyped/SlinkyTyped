package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a video.  NOTE: Creating a video from Google Drive requires that
  * the requesting app have at least one of the drive, drive.readonly, or
  * drive.file OAuth scopes.
  */
@js.native
trait SchemaCreateVideoRequest extends js.Object {
  /**
    * The element properties for the video.  The PageElementProperties.size
    * property is optional. If you don&#39;t specify a size, a default size is
    * chosen by the server.  The PageElementProperties.transform property is
    * optional. The transform must not have shear components. If you don&#39;t
    * specify a transform, the video will be placed at the top left corner of
    * the page.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  /**
    * The video source&#39;s unique identifier for this video.  e.g. For
    * YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0, the ID is
    * 7U3axjORYZ0. For a Google Drive video
    * https://drive.google.com/file/d/1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q the ID
    * is 1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaCreateVideoRequest {
  @scala.inline
  def apply(): SchemaCreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVideoRequest]
  }
  @scala.inline
  implicit class SchemaCreateVideoRequestOps[Self <: SchemaCreateVideoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementProperties(value: SchemaPageElementProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
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
  }
  
}

