package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the private GKE cluster in a Cloud Composer
  * environment.
  */
@js.native
trait SchemaPrivateClusterConfig extends js.Object {
  /**
    * Optional. If `true`, access to the public endpoint of the GKE cluster is
    * denied.
    */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.native
  /**
    * The IP range in CIDR notation to use for the hosted master network. This
    * range is used for assigning internal IP addresses to the cluster master
    * or set of masters and to the internal load balancer virtual IP. This
    * range must not overlap with any other ranges in use within the
    * cluster&#39;s network. If left blank, the default value of
    * &#39;172.16.0.0/28&#39; is used.
    */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.native
}

object SchemaPrivateClusterConfig {
  @scala.inline
  def apply(): SchemaPrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateClusterConfig]
  }
  @scala.inline
  implicit class SchemaPrivateClusterConfigOps[Self <: SchemaPrivateClusterConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnablePrivateEndpoint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePrivateEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePrivateEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterIpv4CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterIpv4CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterIpv4CidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterIpv4CidrBlock")(js.undefined)
        ret
    }
  }
  
}

