package typingsSlinky.multer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldNameSize extends js.Object {
  /** Maximum size of each form field name in bytes. (Default: 100) */
  var fieldNameSize: js.UndefOr[Double] = js.native
  /** Maximum size of each form field value in bytes. (Default: 1048576) */
  var fieldSize: js.UndefOr[Double] = js.native
  /** Maximum number of non-file form fields. (Default: Infinity) */
  var fields: js.UndefOr[Double] = js.native
  /** Maximum size of each file in bytes. (Default: Infinity) */
  var fileSize: js.UndefOr[Double] = js.native
  /** Maximum number of file fields. (Default: Infinity) */
  var files: js.UndefOr[Double] = js.native
  /** Maximum number of headers. (Default: 2000) */
  var headerPairs: js.UndefOr[Double] = js.native
  /** Maximum number of parts (non-file fields + files). (Default: Infinity) */
  var parts: js.UndefOr[Double] = js.native
}

object FieldNameSize {
  @scala.inline
  def apply(): FieldNameSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldNameSize]
  }
  @scala.inline
  implicit class FieldNameSizeOps[Self <: FieldNameSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldNameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldNameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldNameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderPairs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerPairs")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
  }
  
}

