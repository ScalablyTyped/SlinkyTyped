package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  /**
    * Used by the file selection dialog.
    *
    * Restrict the valid file types that appear in the selection dialog by listing valid content-type specifiers
    *
    * @default `null`
    */
  var acceptFiles: js.UndefOr[js.Any] = js.native
  /**
    * Specify file valid file extensions here to restrict uploads to specific types
    *
    * @default `[]`
    */
  var allowedExtensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * ImageOptions
    */
  var image: js.UndefOr[ImageOptions] = js.native
  /**
    * Maximum number of items that can be potentially uploaded in this session.
    *
    * Will reject all items that are added or retried after this limit is reached
    *
    * @default `0`
    */
  var itemLimit: js.UndefOr[Double] = js.native
  /**
    * The minimum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var minSizeLimit: js.UndefOr[Double] = js.native
  /**
    * The maximum allowable size, in bytes, for an item
    *
    * @default `0`
    */
  var sizeLimit: js.UndefOr[Double] = js.native
  /**
    * When `true` the first invalid item will stop processing further files
    *
    * @default `true`
    */
  var stopOnFirstInvalidFile: js.UndefOr[Boolean] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptFiles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: ImageOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withItemLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnFirstInvalidFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnFirstInvalidFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnFirstInvalidFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnFirstInvalidFile")(js.undefined)
        ret
    }
  }
  
}

