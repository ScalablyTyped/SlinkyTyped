package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileProviderOptions[T] extends js.Object {
  /** Specifies which data field provides timestamps that indicate when a file was last modified. */
  var dateModifiedExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field provides information about whether a file system item is a directory. */
  var isDirectoryExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies the data field that provides keys. */
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field provides file and directory names. */
  var nameExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field provides file sizes. */
  var sizeExpr: js.UndefOr[String | js.Function] = js.native
  /** Specifies which data field provides icons to be used as thumbnails. */
  var thumbnailExpr: js.UndefOr[String | js.Function] = js.native
}

object FileProviderOptions {
  @scala.inline
  def apply[T](): FileProviderOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileProviderOptions[T]]
  }
  @scala.inline
  implicit class FileProviderOptionsOps[Self[t] <: FileProviderOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDateModifiedExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateModifiedExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirectoryExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectoryExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirectoryExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectoryExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withNameExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailExpr(value: String | js.Function): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailExpr")(js.undefined)
        ret
    }
  }
  
}

