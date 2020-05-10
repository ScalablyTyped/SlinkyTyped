package typingsSlinky.googleapis

import typingsSlinky.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaderUrls extends js.Object {
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
  var urls: js.UndefOr[js.Array[AnonDetailsArray]] = js.native
}

object AnonHeaderUrls {
  @scala.inline
  def apply(): AnonHeaderUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHeaderUrls]
  }
  @scala.inline
  implicit class AnonHeaderUrlsOps[Self <: AnonHeaderUrls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: SchemaPagespeedApiFormatStringV4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withUrls(value: js.Array[AnonDetailsArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(js.undefined)
        ret
    }
  }
  
}

