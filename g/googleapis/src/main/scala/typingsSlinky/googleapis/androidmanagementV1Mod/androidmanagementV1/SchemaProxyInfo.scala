package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration info for an HTTP proxy. For a direct proxy, set the host,
  * port, and excluded_hosts fields. For a PAC script proxy, set the pac_uri
  * field.
  */
@js.native
trait SchemaProxyInfo extends js.Object {
  /**
    * For a direct proxy, the hosts for which the proxy is bypassed. The host
    * names may contain wildcards such as *.example.com.
    */
  var excludedHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * The host of the direct proxy.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * The URI of the PAC script used to configure the proxy.
    */
  var pacUri: js.UndefOr[String] = js.native
  /**
    * The port of the direct proxy.
    */
  var port: js.UndefOr[Double] = js.native
}

object SchemaProxyInfo {
  @scala.inline
  def apply(): SchemaProxyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProxyInfo]
  }
  @scala.inline
  implicit class SchemaProxyInfoOps[Self <: SchemaProxyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludedHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withPacUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pacUri")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

