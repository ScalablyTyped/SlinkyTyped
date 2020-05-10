package typingsSlinky.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListReferenceImages` method.
  */
@js.native
trait SchemaListReferenceImagesResponse extends js.Object {
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The list of reference images.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaReferenceImage]] = js.native
}

object SchemaListReferenceImagesResponse {
  @scala.inline
  def apply(): SchemaListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReferenceImagesResponse]
  }
  @scala.inline
  implicit class SchemaListReferenceImagesResponseOps[Self <: SchemaListReferenceImagesResponse] (val x: Self) extends AnyVal {
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
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceImages(value: js.Array[SchemaReferenceImage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceImages")(js.undefined)
        ret
    }
  }
  
}

