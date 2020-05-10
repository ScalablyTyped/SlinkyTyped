package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadResponse extends js.Object {
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var originalObject: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}

object SchemaGdataDiffUploadResponse {
  @scala.inline
  def apply(): SchemaGdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffUploadResponseOps[Self <: SchemaGdataDiffUploadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalObject(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalObject")(js.undefined)
        ret
    }
  }
  
}

