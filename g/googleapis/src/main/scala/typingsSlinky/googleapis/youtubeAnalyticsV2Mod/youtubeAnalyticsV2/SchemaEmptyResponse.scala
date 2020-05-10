package typingsSlinky.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Empty response.
  */
@js.native
trait SchemaEmptyResponse extends js.Object {
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
}

object SchemaEmptyResponse {
  @scala.inline
  def apply(): SchemaEmptyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmptyResponse]
  }
  @scala.inline
  implicit class SchemaEmptyResponseOps[Self <: SchemaEmptyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: SchemaErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
  }
  
}

