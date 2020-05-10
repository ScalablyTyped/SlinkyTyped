package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementExchangeConnector extends Entity {
  // The name of the server hosting the Exchange Connector.
  var connectorServerName: js.UndefOr[String] = js.native
  // An alias assigned to the Exchange server
  var exchangeAlias: js.UndefOr[String] = js.native
  // The type of Exchange Connector Configured. Possible values are: onPremises, hosted, serviceToService, dedicated.
  var exchangeConnectorType: js.UndefOr[DeviceManagementExchangeConnectorType] = js.native
  // Exchange Organization to the Exchange server
  var exchangeOrganization: js.UndefOr[String] = js.native
  // Last sync time for the Exchange Connector
  var lastSyncDateTime: js.UndefOr[String] = js.native
  // Email address used to configure the Service To Service Exchange Connector.
  var primarySmtpAddress: js.UndefOr[String] = js.native
  // The name of the Exchange server.
  var serverName: js.UndefOr[String] = js.native
  // Exchange Connector Status. Possible values are: none, connectionPending, connected, disconnected.
  var status: js.UndefOr[DeviceManagementExchangeConnectorStatus] = js.native
  // The version of the ExchangeConnectorAgent
  var version: js.UndefOr[String] = js.native
}

object DeviceManagementExchangeConnector {
  @scala.inline
  def apply(): DeviceManagementExchangeConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementExchangeConnector]
  }
  @scala.inline
  implicit class DeviceManagementExchangeConnectorOps[Self <: DeviceManagementExchangeConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectorServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorServerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorServerName")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeConnectorType(value: DeviceManagementExchangeConnectorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeConnectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeConnectorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeConnectorType")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSyncDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimarySmtpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySmtpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimarySmtpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primarySmtpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withServerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DeviceManagementExchangeConnectorStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

