package typingsSlinky.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkingMetadata extends js.Object {
  /**
    * The entity ID returned in the connect reply as entity_guid
    */
  @JSName("entity.guid")
  var entityDotguid: js.UndefOr[String] = js.native
  /**
    * The application name specified in the connect request as
    * app_name. If multiple application names are specified this will only be
    * the first name
    */
  @JSName("entity.name")
  var entityDotname: String = js.native
  /**
    * The string "SERVICE"
    */
  @JSName("entity.type")
  var entityDottype: String = js.native
  /**
    * The hostname as specified in the connect request as
    * utilization.full_hostname. If utilization.full_hostname is null or empty,
    * this will be the hostname specified in the connect request as host.
    */
  var hostname: String = js.native
  /**
    * The current span ID
    */
  @JSName("span.id")
  var spanDotid: js.UndefOr[String] = js.native
  /**
    * The current trace ID
    */
  @JSName("trace.id")
  var traceDotid: js.UndefOr[String] = js.native
}

object LinkingMetadata {
  @scala.inline
  def apply(entityDotname: String, entityDottype: String, hostname: String): LinkingMetadata = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any])
    __obj.updateDynamic("entity.name")(entityDotname.asInstanceOf[js.Any])
    __obj.updateDynamic("entity.type")(entityDottype.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkingMetadata]
  }
  @scala.inline
  implicit class LinkingMetadataOps[Self <: LinkingMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityDotname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity.name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityDottype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity.type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityDotguid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity.guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityDotguid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity.guid")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanDotid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span.id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpanDotid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span.id")(js.undefined)
        ret
    }
    @scala.inline
    def withTraceDotid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace.id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraceDotid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace.id")(js.undefined)
        ret
    }
  }
  
}

