package typingsSlinky.gapiPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeader extends js.Object {
  /**
    * Heading to be displayed with the list of URLs.
    */
  var header: AnonArgs = js.native
  /**
    * List of entries that provide information about URLs in the URL block. Optional.
    */
  var urls: js.Array[AnonDetails] = js.native
}

object AnonHeader {
  @scala.inline
  def apply(header: AnonArgs, urls: js.Array[AnonDetails]): AnonHeader = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
  @scala.inline
  implicit class AnonHeaderOps[Self <: AnonHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: AnonArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[AnonDetails]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

