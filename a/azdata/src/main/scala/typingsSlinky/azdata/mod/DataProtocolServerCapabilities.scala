package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProtocolServerCapabilities extends js.Object {
  var adminServicesProvider: AdminServicesOptions = js.native
  var connectionProvider: ConnectionProviderOptions = js.native
  var features: js.Array[FeatureMetadataProvider] = js.native
  var protocolVersion: String = js.native
  var providerDisplayName: String = js.native
  var providerName: String = js.native
}

object DataProtocolServerCapabilities {
  @scala.inline
  def apply(
    adminServicesProvider: AdminServicesOptions,
    connectionProvider: ConnectionProviderOptions,
    features: js.Array[FeatureMetadataProvider],
    protocolVersion: String,
    providerDisplayName: String,
    providerName: String
  ): DataProtocolServerCapabilities = {
    val __obj = js.Dynamic.literal(adminServicesProvider = adminServicesProvider.asInstanceOf[js.Any], connectionProvider = connectionProvider.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], providerDisplayName = providerDisplayName.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtocolServerCapabilities]
  }
  @scala.inline
  implicit class DataProtocolServerCapabilitiesOps[Self <: DataProtocolServerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminServicesProvider(value: AdminServicesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminServicesProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionProvider(value: ConnectionProviderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[FeatureMetadataProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocolVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

