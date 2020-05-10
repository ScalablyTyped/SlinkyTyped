package typingsSlinky.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOpts extends js.Object {
  /**
    * Configure the authentication provider.
    * Default: No Authentication
    */
  var authentication: js.UndefOr[AuthenticationTls] = js.native
  /**
    * The number of concurrent lookup requests that can be sent on each broker connection.
    * Setting a maximum helps to keep from overloading brokers.
    * You should set values over the default only if the client needs to produce and/or subscribe to thousands of Pulsar topics.
    * Default: 50000
    */
  var concurrentLookupRequest: js.UndefOr[Double] = js.native
  /**
    * The number of threads to use for handling connections to Pulsar brokers.
    * Default: 1
    */
  var ioThreads: js.UndefOr[Double] = js.native
  /**
    * The number of threads used by message listeners (consumers and readers).
    * Default: 1
    */
  var messageListenerThreads: js.UndefOr[Double] = js.native
  /**
    * The timeout for Node.js client operations (creating producers, subscribing to and unsubscribing from topics).
    * Retries will occur until this threshold is reached, at which point the operation will fail.
    * Default: 30
    */
  var operationTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * The connection URL for the Pulsar cluster.
    */
  var serviceUrl: String = js.native
  /**
    * Interval between each stat info. Stats is activated with positive statsInterval. The value should be set to >= 1 second.
    * Default: 600
    */
  var statsIntervalInSeconds: js.UndefOr[Double] = js.native
  /**
    * The boolean value of setup whether the Pulsar client accepts untrusted TLS certificate from broker.
    * Default: false
    */
  var tlsAllowInsecureConnection: js.UndefOr[Boolean] = js.native
  /**
    * The file path for the trusted TLS certificate.
    */
  var tlsTrustCertsFilePath: js.UndefOr[String] = js.native
  /**
    * The boolean value of setup whether to enable TLS hostname verification.
    * Default: false
    */
  var tlsValidateHostname: js.UndefOr[Boolean] = js.native
}

object ClientOpts {
  @scala.inline
  def apply(serviceUrl: String): ClientOpts = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOpts]
  }
  @scala.inline
  implicit class ClientOptsOps[Self <: ClientOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthentication(value: AuthenticationTls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrentLookupRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentLookupRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrentLookupRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrentLookupRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withIoThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIoThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioThreads")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageListenerThreads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListenerThreads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageListenerThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListenerThreads")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationTimeoutSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTimeoutSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationTimeoutSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationTimeoutSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatsIntervalInSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsIntervalInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatsIntervalInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statsIntervalInSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsAllowInsecureConnection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInsecureConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsAllowInsecureConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsAllowInsecureConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsTrustCertsFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsTrustCertsFilePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsTrustCertsFilePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsTrustCertsFilePath")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsValidateHostname(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsValidateHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsValidateHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsValidateHostname")(js.undefined)
        ret
    }
  }
  
}

