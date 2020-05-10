package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single resource related to a threat hit.
  */
@js.native
trait SchemaThreatSource extends js.Object {
  /**
    * Referrer of the resource. Only set if the referrer is available.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /**
    * The type of source reported.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The URL of the resource.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaThreatSource {
  @scala.inline
  def apply(): SchemaThreatSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatSource]
  }
  @scala.inline
  implicit class SchemaThreatSourceOps[Self <: SchemaThreatSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteIp")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

