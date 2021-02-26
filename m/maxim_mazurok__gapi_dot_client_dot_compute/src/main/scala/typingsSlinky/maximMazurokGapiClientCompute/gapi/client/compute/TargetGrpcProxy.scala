package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGrpcProxy extends StObject {
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetGrpcProxy. An
    * up-to-date fingerprint must be provided in order to patch/update the TargetGrpcProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
    * make a get() request to retrieve the TargetGrpcProxy.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /** [Output Only] The unique identifier for the resource type. The server generates this identifier. */
  var id: js.UndefOr[String] = js.native
  
  /** [Output Only] Type of the resource. Always compute#targetGrpcProxy for target grpc proxies. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL with id for the resource. */
  var selfLinkWithId: js.UndefOr[String] = js.native
  
  /** URL to the UrlMap resource that defines the mapping from URL to the BackendService. The protocol field in the BackendService must be set to GRPC. */
  var urlMap: js.UndefOr[String] = js.native
  
  /**
    * If true, indicates that the BackendServices referenced by the urlMap may be accessed by gRPC applications without using a sidecar proxy. This will enable configuration checks on
    * urlMap and its referenced BackendServices to not allow unsupported features. A gRPC application must use "xds:///" scheme in the target URI of the service it is connecting to. If
    * false, indicates that the BackendServices referenced by the urlMap will be accessed by gRPC applications via a sidecar proxy. In this case, a gRPC application must not use "xds:///"
    * scheme in the target URI of the service it is connecting to
    */
  var validateForProxyless: js.UndefOr[Boolean] = js.native
}
object TargetGrpcProxy {
  
  @scala.inline
  def apply(): TargetGrpcProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGrpcProxy]
  }
  
  @scala.inline
  implicit class TargetGrpcProxyMutableBuilder[Self <: TargetGrpcProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSelfLinkWithId(value: String): Self = StObject.set(x, "selfLinkWithId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkWithIdUndefined: Self = StObject.set(x, "selfLinkWithId", js.undefined)
    
    @scala.inline
    def setUrlMap(value: String): Self = StObject.set(x, "urlMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapUndefined: Self = StObject.set(x, "urlMap", js.undefined)
    
    @scala.inline
    def setValidateForProxyless(value: Boolean): Self = StObject.set(x, "validateForProxyless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateForProxylessUndefined: Self = StObject.set(x, "validateForProxyless", js.undefined)
  }
}
