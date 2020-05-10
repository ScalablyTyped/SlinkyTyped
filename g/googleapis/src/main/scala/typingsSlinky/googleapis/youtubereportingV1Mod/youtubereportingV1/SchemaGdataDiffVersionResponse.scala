package typingsSlinky.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffVersionResponse extends js.Object {
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}

object SchemaGdataDiffVersionResponse {
  @scala.inline
  def apply(): SchemaGdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffVersionResponse]
  }
  @scala.inline
  implicit class SchemaGdataDiffVersionResponseOps[Self <: SchemaGdataDiffVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectSizeBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectSizeBytes")(js.undefined)
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

