package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines attributes for a node that handles a network request.
  * The node can be either a service or an application that sends, forwards, or
  * receives the request. Service peers should fill in the `service`,
  * `principal`, and `labels` as appropriate.
  */
@js.native
trait SchemaPeer extends js.Object {
  /**
    * The IP address of the peer.
    */
  var ip: js.UndefOr[String] = js.native
  /**
    * The labels associated with the peer.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The network port of the peer.
    */
  var port: js.UndefOr[String] = js.native
  /**
    * The identity of this peer. Similar to `Request.auth.principal`, but
    * relative to the peer instead of the request. For example, the idenity
    * associated with a load balancer that forwared the request.
    */
  var principal: js.UndefOr[String] = js.native
  /**
    * The CLDR country/region code associated with the above IP address. If the
    * IP address is private, the `region_code` should reflect the physical
    * location where this peer is running.
    */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * The canonical service name of the peer.  NOTE: different systems may have
    * different service naming schemes.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaPeer {
  @scala.inline
  def apply(): SchemaPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPeer]
  }
  @scala.inline
  implicit class SchemaPeerOps[Self <: SchemaPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: String): Self = {
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
    @scala.inline
    def withPrincipal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrincipal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("principal")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

