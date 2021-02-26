package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetPool extends StObject {
  
  /**
    * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field
    * is properly set to a value between [0, 1].
    *
    * backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below
    * failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool.
    *
    * In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force"
    * mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
    */
  var backupPool: js.UndefOr[String] = js.native
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of
    * the field must be in [0, 1].
    *
    * If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below
    * this number, traffic arriving at the load-balanced IP will be directed to the backup pool.
    *
    * In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where
    * traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
    */
  var failoverRatio: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. An empty list means all member instances will be
    * considered healthy at all times. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.native
  
  /** A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool. */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /** [Output Only] Type of the resource. Always compute#targetPool for target pools. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  
  /** [Output Only] URL of the region where the target pool resides. */
  var region: js.UndefOr[String] = js.native
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Session affinity option, must be one of the following values:
    * NONE: Connections from the same client IP may go to any instance in the pool.
    * CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy.
    * CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
}
object TargetPool {
  
  @scala.inline
  def apply(): TargetPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPool]
  }
  
  @scala.inline
  implicit class TargetPoolMutableBuilder[Self <: TargetPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPool(value: String): Self = StObject.set(x, "backupPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPoolUndefined: Self = StObject.set(x, "backupPool", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFailoverRatio(value: Double): Self = StObject.set(x, "failoverRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverRatioUndefined: Self = StObject.set(x, "failoverRatio", js.undefined)
    
    @scala.inline
    def setHealthChecks(value: js.Array[String]): Self = StObject.set(x, "healthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthChecksUndefined: Self = StObject.set(x, "healthChecks", js.undefined)
    
    @scala.inline
    def setHealthChecksVarargs(value: String*): Self = StObject.set(x, "healthChecks", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSessionAffinity(value: String): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAffinityUndefined: Self = StObject.set(x, "sessionAffinity", js.undefined)
  }
}
