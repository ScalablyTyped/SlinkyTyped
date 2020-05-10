package typingsSlinky.pdfjsDist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseUrl extends js.Object {
  var baseUrl: String = js.native
  var isCompressed: Boolean = js.native
}

object AnonBaseUrl {
  @scala.inline
  def apply(baseUrl: String, isCompressed: Boolean): AnonBaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseUrl]
  }
  @scala.inline
  implicit class AnonBaseUrlOps[Self <: AnonBaseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompressed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

