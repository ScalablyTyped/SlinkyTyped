package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDownloadParameters extends js.Object {
  /**
    * gdata
    */
  var allowGzipCompression: js.UndefOr[Boolean] = js.native
  /**
    * gdata
    */
  var ignoreRange: js.UndefOr[Boolean] = js.native
}

object SchemaGdataDownloadParameters {
  @scala.inline
  def apply(): SchemaGdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDownloadParameters]
  }
  @scala.inline
  implicit class SchemaGdataDownloadParametersOps[Self <: SchemaGdataDownloadParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowGzipCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGzipCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowGzipCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowGzipCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRange")(js.undefined)
        ret
    }
  }
  
}

