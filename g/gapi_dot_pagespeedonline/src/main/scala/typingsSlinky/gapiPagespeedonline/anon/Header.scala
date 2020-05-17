package typingsSlinky.gapiPagespeedonline.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  /**
    * Heading to be displayed with the list of URLs.
    */
  var header: Args = js.native
  /**
    * List of entries that provide information about URLs in the URL block. Optional.
    */
  var urls: js.Array[Details] = js.native
}

object Header {
  @scala.inline
  def apply(header: Args, urls: js.Array[Details]): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: Args): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[Details]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

