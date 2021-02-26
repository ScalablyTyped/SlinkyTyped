package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends StObject {
  
  /**
    * This is motivated by informing a management server during canary which version of Envoy is being tested in a heterogeneous fleet. This will be set by Envoy in management server
    * RPCs. This field is deprecated in favor of the user_agent_name and user_agent_version values.
    */
  var buildVersion: js.UndefOr[String] = js.native
  
  /**
    * Client feature support list. These are well known features described in the Envoy API repository for a given major version of an API. Client features use reverse DNS naming scheme,
    * for example `com.acme.feature`. See :ref:`the list of features ` that xDS client may support.
    */
  var clientFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines the local service cluster name where Envoy is running. Though optional, it should be set if any of the following features are used: :ref:`statsd `, :ref:`health check
    * cluster verification `, :ref:`runtime override directory `, :ref:`user agent addition `, :ref:`HTTP global rate limiting `, :ref:`CDS `, and :ref:`HTTP tracing `, either in this
    * message or via :option:`--service-cluster`.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /** List of extensions and their versions supported by the node. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  
  /**
    * An opaque node identifier for the Envoy node. This also provides the local service node name. It should be set if any of the following features are used: :ref:`statsd `, :ref:`CDS
    * `, and :ref:`HTTP tracing `, either in this message or via :option:`--service-node`.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Known listening ports on the node as a generic hint to the management server for filtering :ref:`listeners ` to be returned. For example, if there is a listener bound to port 80,
    * the list can optionally contain the SocketAddress `(0.0.0.0,80)`. The field is optional and just a hint.
    */
  var listeningAddresses: js.UndefOr[js.Array[Address]] = js.native
  
  /** Locality specifying where the Envoy instance is running. */
  var locality: js.UndefOr[Locality] = js.native
  
  /** Opaque metadata extending the node identifier. Envoy will pass this directly to the management server. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.Node with TopLevel[js.Any]
  ] = js.native
  
  /** Structured version of the entity requesting config. */
  var userAgentBuildVersion: js.UndefOr[BuildVersion] = js.native
  
  /** Free-form string that identifies the entity requesting config. E.g. "envoy" or "grpc" */
  var userAgentName: js.UndefOr[String] = js.native
  
  /** Free-form string that identifies the version of the entity requesting config. E.g. "1.12.2" or "abcd1234", or "SpecialEnvoyBuild" */
  var userAgentVersion: js.UndefOr[String] = js.native
}
object Node {
  
  @scala.inline
  def apply(): Node = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
    
    @scala.inline
    def setClientFeatures(value: js.Array[String]): Self = StObject.set(x, "clientFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientFeaturesUndefined: Self = StObject.set(x, "clientFeatures", js.undefined)
    
    @scala.inline
    def setClientFeaturesVarargs(value: String*): Self = StObject.set(x, "clientFeatures", js.Array(value :_*))
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setListeningAddresses(value: js.Array[Address]): Self = StObject.set(x, "listeningAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListeningAddressesUndefined: Self = StObject.set(x, "listeningAddresses", js.undefined)
    
    @scala.inline
    def setListeningAddressesVarargs(value: Address*): Self = StObject.set(x, "listeningAddresses", js.Array(value :_*))
    
    @scala.inline
    def setLocality(value: Locality): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.Node with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUserAgentBuildVersion(value: BuildVersion): Self = StObject.set(x, "userAgentBuildVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentBuildVersionUndefined: Self = StObject.set(x, "userAgentBuildVersion", js.undefined)
    
    @scala.inline
    def setUserAgentName(value: String): Self = StObject.set(x, "userAgentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentNameUndefined: Self = StObject.set(x, "userAgentName", js.undefined)
    
    @scala.inline
    def setUserAgentVersion(value: String): Self = StObject.set(x, "userAgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentVersionUndefined: Self = StObject.set(x, "userAgentVersion", js.undefined)
  }
}
