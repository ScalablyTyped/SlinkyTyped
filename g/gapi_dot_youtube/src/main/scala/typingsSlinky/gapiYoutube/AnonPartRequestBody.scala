package typingsSlinky.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPartRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: String = js.native
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and contentDetails.
    */
  var part: String = js.native
}

object AnonPartRequestBody {
  @scala.inline
  def apply(RequestBody: String, part: String): AnonPartRequestBody = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartRequestBody]
  }
  @scala.inline
  implicit class AnonPartRequestBodyOps[Self <: AnonPartRequestBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

