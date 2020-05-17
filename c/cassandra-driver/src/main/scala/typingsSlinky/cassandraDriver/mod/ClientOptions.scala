package typingsSlinky.cassandraDriver.mod

import typingsSlinky.cassandraDriver.anon.AddressResolution
import typingsSlinky.cassandraDriver.anon.CoalescingThreshold
import typingsSlinky.cassandraDriver.anon.CopyBuffer
import typingsSlinky.cassandraDriver.anon.CoreConnectionsPerHost
import typingsSlinky.cassandraDriver.anon.MaxSchemaAgreementWaitSeconds
import typingsSlinky.cassandraDriver.anon.Password
import typingsSlinky.cassandraDriver.anon.SecureConnectBundle
import typingsSlinky.cassandraDriver.authMod.auth.AuthProvider
import typingsSlinky.cassandraDriver.metricsMod.metrics.ClientMetrics
import typingsSlinky.cassandraDriver.trackerMod.tracker.RequestTracker
import typingsSlinky.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var authProvider: js.UndefOr[AuthProvider] = js.native
  var cloud: js.UndefOr[SecureConnectBundle] = js.native
  var contactPoints: js.UndefOr[js.Array[String]] = js.native
  var credentials: js.UndefOr[Password] = js.native
  var encoding: js.UndefOr[CopyBuffer] = js.native
  var isMetadataSyncEnabled: js.UndefOr[Boolean] = js.native
  var keyspace: js.UndefOr[String] = js.native
  var localDataCenter: js.UndefOr[String] = js.native
  var maxPrepared: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[ClientMetrics] = js.native
  var policies: js.UndefOr[AddressResolution] = js.native
  var pooling: js.UndefOr[CoreConnectionsPerHost] = js.native
  var prepareOnAllHosts: js.UndefOr[Boolean] = js.native
  var profiles: js.UndefOr[js.Array[ExecutionProfile]] = js.native
  var promiseFactory: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[
        /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      js.Promise[_]
    ]
  ] = js.native
  var protocolOptions: js.UndefOr[MaxSchemaAgreementWaitSeconds] = js.native
  var queryOptions: js.UndefOr[QueryOptions] = js.native
  var rePrepareOnUp: js.UndefOr[Boolean] = js.native
  var refreshSchemaDelay: js.UndefOr[Double] = js.native
  var requestTracker: js.UndefOr[RequestTracker] = js.native
  var socketOptions: js.UndefOr[CoalescingThreshold] = js.native
  var sslOptions: js.UndefOr[ConnectionOptions] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCloud(value: SecureConnectBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloud: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloud")(js.undefined)
        ret
    }
    @scala.inline
    def withContactPoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Password): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: CopyBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMetadataSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetadataSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMetadataSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMetadataSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyspace")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalDataCenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDataCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDataCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localDataCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPrepared(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrepared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPrepared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPrepared")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: ClientMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: AddressResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policies")(js.undefined)
        ret
    }
    @scala.inline
    def withPooling(value: CoreConnectionsPerHost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pooling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPooling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pooling")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareOnAllHosts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareOnAllHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepareOnAllHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareOnAllHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withProfiles(value: js.Array[ExecutionProfile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profiles")(js.undefined)
        ret
    }
    @scala.inline
    def withPromiseFactory(
      value: /* handler */ js.Function1[
          /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[js.Any], Unit], 
          Unit
        ] => js.Promise[_]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPromiseFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promiseFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocolOptions(value: MaxSchemaAgreementWaitSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocolOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocolOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryOptions(value: QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRePrepareOnUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rePrepareOnUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRePrepareOnUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rePrepareOnUp")(js.undefined)
        ret
    }
    @scala.inline
    def withRefreshSchemaDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSchemaDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshSchemaDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSchemaDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTracker(value: RequestTracker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTracker")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketOptions(value: CoalescingThreshold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSslOptions(value: ConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslOptions")(js.undefined)
        ret
    }
  }
  
}

