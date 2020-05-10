package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffDownloadResponse extends js.Object {
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}

object SchemaGdataDiffDownloadResponse {
  @scala.inline
  def apply(): SchemaGdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffDownloadResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffDownloadResponseOps[Self <: SchemaGdataDiffDownloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectLocation(value: SchemaGdataCompositeMedia): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectLocation")(js.undefined)
        ret
    }
  }
  
}

