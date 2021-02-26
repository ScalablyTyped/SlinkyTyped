package typingsSlinky.maximMazurokGapiClientCompute.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrainTimeoutSeconds extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * The drain timeout specifies the upper bound in seconds on the amount of time allowed to drain connections from the current ACTIVE subnetwork to the current BACKUP subnetwork.
    * The drain timeout is only applicable when the following conditions are true: - the subnetwork being patched has purpose = INTERNAL_HTTPS_LOAD_BALANCER - the subnetwork being
    * patched has role = BACKUP - the patch request is setting the role to ACTIVE. Note that after this patch operation the roles of the ACTIVE and BACKUP subnetworks will be swapped.
    */
  var drainTimeoutSeconds: js.UndefOr[Double] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Project ID for this request. */
  var project: String = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Name of the region scoping this request. */
  var region: String = js.native
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already
    * been completed.
    *
    * For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if
    * original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.
    *
    * The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork = js.native
  
  /** Name of the Subnetwork resource to patch. */
  var subnetwork: String = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object DrainTimeoutSeconds {
  
  @scala.inline
  def apply(
    project: String,
    region: String,
    resource: typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork,
    subnetwork: String
  ): DrainTimeoutSeconds = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subnetwork = subnetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrainTimeoutSeconds]
  }
  
  @scala.inline
  implicit class DrainTimeoutSecondsMutableBuilder[Self <: DrainTimeoutSeconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setDrainTimeoutSeconds(value: Double): Self = StObject.set(x, "drainTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrainTimeoutSecondsUndefined: Self = StObject.set(x, "drainTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setResource(value: typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute.Subnetwork): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
