package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message resulting from reading an image file.
  */
@js.native
trait SchemaImageError extends js.Object {
  /**
    * The type of image error encountered. Optional for older image errors.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The file path in the import of the image that was rejected.
    */
  var filePath: js.UndefOr[String] = js.native
}

object SchemaImageError {
  @scala.inline
  def apply(): SchemaImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageError]
  }
  @scala.inline
  implicit class SchemaImageErrorOps[Self <: SchemaImageError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(js.undefined)
        ret
    }
  }
  
}

