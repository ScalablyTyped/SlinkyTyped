package typingsSlinky.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `ReferenceImage` represents a product image and its associated metadata,
  * such as bounding boxes.
  */
@js.native
trait SchemaReferenceImage extends js.Object {
  /**
    * Bounding polygons around the areas of interest in the reference image.
    * Optional. If this field is empty, the system will try to detect regions
    * of interest. At most 10 bounding polygons will be used.  The provided
    * shape is converted into a non-rotated rectangle. Once converted, the
    * small edge of the rectangle must be greater than or equal to 300 pixels.
    * The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
    */
  var boundingPolys: js.UndefOr[js.Array[SchemaBoundingPoly]] = js.native
  /**
    * The resource name of the reference image.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
    * This field is ignored when creating a reference image.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google Cloud Storage URI of the reference image.  The URI must start
    * with `gs://`.  Required.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaReferenceImage {
  @scala.inline
  def apply(): SchemaReferenceImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReferenceImage]
  }
  @scala.inline
  implicit class SchemaReferenceImageOps[Self <: SchemaReferenceImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPolys(value: js.Array[SchemaBoundingPoly]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPolys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPolys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPolys")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

