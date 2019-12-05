package typingsSlinky.relayDashRuntime.libNetworkRelayNetworkLoggerTransactionMod

import typingsSlinky.relayDashRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typingsSlinky.relayDashRuntime.libUtilRelayConcreteNodeMod.RequestParameters
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsSlinky.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerTransactionConfig extends js.Object {
  var cacheConfig: CacheConfig
  var request: RequestParameters
  var uploadables: js.UndefOr[UploadableMap] = js.undefined
  var variables: Variables
}

object LoggerTransactionConfig {
  @scala.inline
  def apply(
    cacheConfig: CacheConfig,
    request: RequestParameters,
    variables: Variables,
    uploadables: UploadableMap = null
  ): LoggerTransactionConfig = {
    val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (uploadables != null) __obj.updateDynamic("uploadables")(uploadables.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerTransactionConfig]
  }
}

