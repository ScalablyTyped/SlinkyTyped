package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomerConnectorInfo extends js.Object {
  /**
    * Number of active discovery connectors.
    */
  var activeConnectors: Integer = js.native
  /**
    * Number of blacklisted discovery connectors.
    */
  var blackListedConnectors: Integer = js.native
  /**
    * Number of healthy discovery connectors.
    */
  var healthyConnectors: Integer = js.native
  /**
    * Number of discovery connectors with status SHUTDOWN,
    */
  var shutdownConnectors: Integer = js.native
  /**
    * Total number of discovery connectors.
    */
  var totalConnectors: Integer = js.native
  /**
    * Number of unhealthy discovery connectors.
    */
  var unhealthyConnectors: Integer = js.native
  /**
    * Number of unknown discovery connectors.
    */
  var unknownConnectors: Integer = js.native
}

object CustomerConnectorInfo {
  @scala.inline
  def apply(
    activeConnectors: Integer,
    blackListedConnectors: Integer,
    healthyConnectors: Integer,
    shutdownConnectors: Integer,
    totalConnectors: Integer,
    unhealthyConnectors: Integer,
    unknownConnectors: Integer
  ): CustomerConnectorInfo = {
    val __obj = js.Dynamic.literal(activeConnectors = activeConnectors.asInstanceOf[js.Any], blackListedConnectors = blackListedConnectors.asInstanceOf[js.Any], healthyConnectors = healthyConnectors.asInstanceOf[js.Any], shutdownConnectors = shutdownConnectors.asInstanceOf[js.Any], totalConnectors = totalConnectors.asInstanceOf[js.Any], unhealthyConnectors = unhealthyConnectors.asInstanceOf[js.Any], unknownConnectors = unknownConnectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerConnectorInfo]
  }
  @scala.inline
  implicit class CustomerConnectorInfoOps[Self <: CustomerConnectorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlackListedConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackListedConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthyConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthyConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdownConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhealthyConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhealthyConnectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknownConnectors(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownConnectors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

