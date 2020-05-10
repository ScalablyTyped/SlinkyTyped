package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadRequest extends js.Object {
  /**
    * gdata
    */
  var checksumsInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffUploadRequest {
  @scala.inline
  def apply(): SchemaGdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadRequest]
  }
  @scala.inline
  implicit class SchemaGdataDiffUploadRequestOps[Self <: SchemaGdataDiffUploadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChecksumsInfo(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksumsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectInfo(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectInfo")(js.undefined)
        ret
    }
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
  }
  
}

