package typingsSlinky.elasticElasticsearch.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.elasticElasticsearch.AnonId
import typingsSlinky.elasticElasticsearch.AnonInstantiable
import typingsSlinky.elasticElasticsearch.AnonResurrectStrategies
import typingsSlinky.elasticElasticsearch.AnonSniffReasons
import typingsSlinky.elasticElasticsearch.connectionMod.AgentOptions
import typingsSlinky.elasticElasticsearch.connectionMod.agentFn
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.gzip
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.none
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.optimistic
import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.ping
import typingsSlinky.elasticElasticsearch.poolMod.ApiKeyAuth
import typingsSlinky.elasticElasticsearch.poolMod.BasicAuth
import typingsSlinky.elasticElasticsearch.serializerMod.default
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestOptions
import typingsSlinky.elasticElasticsearch.transportMod.TransportRequestParams
import typingsSlinky.elasticElasticsearch.transportMod.generateRequestIdFn
import typingsSlinky.elasticElasticsearch.transportMod.nodeFilterFn
import typingsSlinky.elasticElasticsearch.transportMod.nodeSelectorFn
import typingsSlinky.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var Connection: js.UndefOr[AnonInstantiable] = js.native
  var ConnectionPool: js.UndefOr[AnonResurrectStrategies] = js.native
  var Serializer: js.UndefOr[Instantiable0[default]] = js.native
  var Transport: js.UndefOr[AnonSniffReasons] = js.native
  var agent: js.UndefOr[AgentOptions | agentFn] = js.native
  var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
  var cloud: js.UndefOr[AnonId] = js.native
  var compression: js.UndefOr[gzip] = js.native
  var generateRequestId: js.UndefOr[generateRequestIdFn] = js.native
  var headers: js.UndefOr[anyObject] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var node: js.UndefOr[String | (js.Array[NodeOptions | String]) | NodeOptions] = js.native
  var nodeFilter: js.UndefOr[nodeFilterFn] = js.native
  var nodeSelector: js.UndefOr[nodeSelectorFn | String] = js.native
  var nodes: js.UndefOr[String | js.Array[String]] = js.native
  var opaqueIdPrefix: js.UndefOr[String] = js.native
  var pingTimeout: js.UndefOr[Double] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var resurrectStrategy: js.UndefOr[ping | optimistic | none] = js.native
  var sniffEndpoint: js.UndefOr[String] = js.native
  var sniffInterval: js.UndefOr[Double | Boolean] = js.native
  var sniffOnConnectionFault: js.UndefOr[Boolean] = js.native
  var sniffOnStart: js.UndefOr[Boolean] = js.native
  var ssl: js.UndefOr[ConnectionOptions] = js.native
  var suggestCompression: js.UndefOr[Boolean] = js.native
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
    def withConnection(value: AnonInstantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionPool(value: AnonResurrectStrategies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionPool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionPool")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: Instantiable0[default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Serializer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: AnonSniffReasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transport")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentFunction0(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAgent(value: AgentOptions | agentFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: BasicAuth | ApiKeyAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withCloud(value: AnonId): Self = {
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
    def withCompression(value: gzip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateRequestId(value: (/* params */ TransportRequestParams, /* options */ TransportRequestOptions) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateRequestId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: anyObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: String | (js.Array[NodeOptions | String]) | NodeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeFilter(value: /* connection */ typingsSlinky.elasticElasticsearch.connectionMod.default => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNodeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeSelectorFunction1(
      value: /* connections */ js.Array[typingsSlinky.elasticElasticsearch.connectionMod.default] => typingsSlinky.elasticElasticsearch.connectionMod.default
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNodeSelector(value: nodeSelectorFn | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withNodes(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withOpaqueIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaqueIdPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpaqueIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opaqueIdPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPingTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPingTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pingTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResurrectStrategy(value: ping | optimistic | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResurrectStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withSniffEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniffEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withSniffInterval(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniffInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSniffOnConnectionFault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffOnConnectionFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniffOnConnectionFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffOnConnectionFault")(js.undefined)
        ret
    }
    @scala.inline
    def withSniffOnStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffOnStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSniffOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sniffOnStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: ConnectionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestCompression")(js.undefined)
        ret
    }
  }
  
}

