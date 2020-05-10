package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationUriReady extends js.Object {
  var `destination-attributes`: js.UndefOr[js.Array[js.Object]] = js.native
  var `destination-attributes-supported`: js.UndefOr[js.Array[String]] = js.native
  var `destination-info`: js.UndefOr[String] = js.native
  var `destination-is-directory`: js.UndefOr[Boolean] = js.native
  var `destination-mandatory-access-attributes`: js.UndefOr[js.Array[String]] = js.native
  var `destination-name`: js.UndefOr[String] = js.native
  var `destination-oauth-scope`: js.UndefOr[js.Array[String]] = js.native
  var `destination-oauth-token`: js.UndefOr[js.Array[String]] = js.native
  var `destination-oauth-uri`: js.UndefOr[String] = js.native
  var `destination-uri`: js.UndefOr[String] = js.native
}

object DestinationUriReady {
  @scala.inline
  def apply(): DestinationUriReady = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationUriReady]
  }
  @scala.inline
  implicit class DestinationUriReadyOps[Self <: DestinationUriReady] (val x: Self) extends AnyVal {
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
    def `withDestination-attributes-supported`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-attributes-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-attributes-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-attributes-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-info`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-is-directory`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-is-directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-is-directory`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-is-directory")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-mandatory-access-attributes`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-mandatory-access-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-mandatory-access-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-mandatory-access-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-oauth-scope`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-oauth-scope`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-scope")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-oauth-token`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-oauth-token`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-token")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-oauth-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-oauth-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-oauth-uri")(js.undefined)
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
  }
  
}

