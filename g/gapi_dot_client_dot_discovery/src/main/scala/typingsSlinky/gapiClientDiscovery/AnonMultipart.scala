package typingsSlinky.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMultipart extends js.Object {
  /** True if this endpoint supports upload multipart media. */
  var multipart: js.UndefOr[Boolean] = js.native
  /** The URI path to be used for upload. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.native
}

object AnonMultipart {
  @scala.inline
  def apply(): AnonMultipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMultipart]
  }
  @scala.inline
  implicit class AnonMultipartOps[Self <: AnonMultipart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultipart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipart")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

