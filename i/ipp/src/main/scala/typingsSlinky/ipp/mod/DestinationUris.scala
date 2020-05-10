package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationUris extends js.Object {
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.native
  var `destination-uri`: js.UndefOr[String] = js.native
  var `feed-orientation`: js.UndefOr[FeedOrientation] = js.native
  var `post-dial-string`: js.UndefOr[String] = js.native
  var `pre-dial-string`: js.UndefOr[String] = js.native
  var `t33-subaddress`: js.UndefOr[Double] = js.native
}

object DestinationUris {
  @scala.inline
  def apply(): DestinationUris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUris]
  }
  @scala.inline
  implicit class DestinationUrisOps[Self <: DestinationUris] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDestination-attributes`(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withFeed-orientation`(value: FeedOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed-orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFeed-orientation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feed-orientation")(js.undefined)
        ret
    }
    @scala.inline
    def `withPost-dial-string`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post-dial-string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPost-dial-string`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post-dial-string")(js.undefined)
        ret
    }
    @scala.inline
    def `withPre-dial-string`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-dial-string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPre-dial-string`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre-dial-string")(js.undefined)
        ret
    }
    @scala.inline
    def `withT33-subaddress`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t33-subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutT33-subaddress`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t33-subaddress")(js.undefined)
        ret
    }
  }
  
}

