package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PageElement kind representing an image.
  */
@js.native
trait SchemaImage extends js.Object {
  /**
    * An URL to an image with a default lifetime of 30 minutes. This URL is
    * tagged with the account of the requester. Anyone with the URL effectively
    * accesses the image as the original requester. Access to the image may be
    * lost if the presentation&#39;s sharing settings change.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The properties of the image.
    */
  var imageProperties: js.UndefOr[SchemaImageProperties] = js.native
  /**
    * The source URL is the URL used to insert the image. The source URL can be
    * empty.
    */
  var sourceUrl: js.UndefOr[String] = js.native
}

object SchemaImage {
  @scala.inline
  def apply(): SchemaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImage]
  }
  @scala.inline
  implicit class SchemaImageOps[Self <: SchemaImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImageProperties(value: SchemaImageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUrl")(js.undefined)
        ret
    }
  }
  
}

