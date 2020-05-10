package typingsSlinky.awsIotDeviceSdk.mod

import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.mqtts
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.newest
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.oldest
import typingsSlinky.awsIotDeviceSdk.awsIotDeviceSdkStrings.wss
import typingsSlinky.mqtt.clientOptionsMod.IClientOptions
import typingsSlinky.node.Buffer
import typingsSlinky.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceOptions extends IClientOptions {
  /**
    * used to specify the Access Key ID when protocol is set to "wss".
    * Overrides the environment variable AWS_ACCESS_KEY_ID if set.
    */
  var accessKeyId: js.UndefOr[String] = js.native
  /**
    * set to "true" to automatically re-subscribe to topics after
    * reconnection (default "true")
    */
  var autoResubscribe: js.UndefOr[Boolean] = js.native
  /** the base reconnection time in milliseconds (default 1000) */
  var baseReconnectTimeMs: js.UndefOr[Double] = js.native
  /**
    * same as caPath, but can also accept a buffer containing CA certificate
    * data
    */
  var caCert: js.UndefOr[String | Buffer] = js.native
  /** path of your CA certificate file */
  var caPath: js.UndefOr[String] = js.native
  /**
    * path of the client certificate file path of the private key file
    * associated with the client certificate
    */
  var certPath: js.UndefOr[String] = js.native
  /**
    * same as certPath, but can also accept a buffer containing client
    * certificate data
    */
  var clientCert: js.UndefOr[String | Buffer] = js.native
  /** enable console logging, default false */
  // NB Not documented but present in examples, see
  // https://github.com/aws/aws-iot-device-sdk-js/blob/97b0b468d/device/index.js#L436
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * the minimum time in milliseconds between publishes when draining
    * after reconnection (default 250)
    */
  var drainTimeMs: js.UndefOr[Double] = js.native
  /** path of the private key file associated with the client certificate */
  var keyPath: js.UndefOr[String] = js.native
  /** the maximum reconnection time in milliseconds (default 128000) */
  var maximumReconnectTimeMs: js.UndefOr[Double] = js.native
  /**
    * the minimum time in milliseconds that a connection must be maintained
    * in order to be considered stable (default 20000)
    */
  var minimumConnectionTimeMs: js.UndefOr[Double] = js.native
  /**
    * set to "oldest" or "newest" to define drop behavior on a full
    * queue when offlineQueueMaxSize > 0
    */
  var offlineQueueDropBehavior: js.UndefOr[oldest | newest] = js.native
  /**
    * enforce a maximum size for the offline message queue
    * (default 0, e.g. no maximum)
    */
  var offlineQueueMaxSize: js.UndefOr[Double] = js.native
  /** set to "true" to automatically queue published messages while
    * offline (default "true")
    */
  var offlineQueueing: js.UndefOr[Boolean] = js.native
  /**
    * same as keyPath, but can also accept a buffer containing private key
    * data
    */
  var privateKey: js.UndefOr[String | Buffer] = js.native
  /**
    * the connection type, either "mqtts" (default) or "wss" (WebSocket/TLS).
    * Note that when set to "wss", values must be provided for the
    * Access Key ID and Secret Key in either the following options or in
    * environment variables as specified in WebSocket Configuration[1].
    *
    * 1. https://github.com/aws/aws-iot-device-sdk-js#websockets
    */
  @JSName("protocol")
  var protocol_DeviceOptions: js.UndefOr[mqtts | wss] = js.native
  /** the AWS IoT region you will operate in (default "us-east-1") */
  var region: js.UndefOr[String] = js.native
  /**
    * used to specify the Secret Key when protocol is set to "wss".
    * Overrides the environment variable AWS_SECRET_ACCESS_KEY if set.
    */
  var secretKey: js.UndefOr[String] = js.native
  /**
    * (required when authenticating via Cognito, optional otherwise) used
    * to specify the Session Token when protocol is set to "wss". Overrides
    * the environment variable AWS_SESSION_TOKEN if set.
    */
  var sessionToken: js.UndefOr[String] = js.native
  /**
    * if protocol is set to "wss", you can use this parameter to pass
    * additional options to the underlying WebSocket object;
    * these options are documented here.
    */
  var websocketOptions: js.UndefOr[ClientOptions] = js.native
}

object DeviceOptions {
  @scala.inline
  def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  @scala.inline
  implicit class DeviceOptionsOps[Self <: DeviceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResubscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseReconnectTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseReconnectTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseReconnectTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseReconnectTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withCaCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCert")(js.undefined)
        ret
    }
    @scala.inline
    def withCaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCertPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certPath")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCert(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCert")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDrainTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrainTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drainTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumReconnectTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumReconnectTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumReconnectTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumReconnectTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumConnectionTimeMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumConnectionTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumConnectionTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumConnectionTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineQueueDropBehavior(value: oldest | newest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueDropBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineQueueDropBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueDropBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineQueueMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineQueueMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueMaxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineQueueing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineQueueing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineQueueing")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: mqtts | wss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsocketOptions(value: ClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsocketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("websocketOptions")(js.undefined)
        ret
    }
  }
  
}

