package typingsSlinky.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppProfile extends StObject {
  
  /** Long form description of the use case for this AppProfile. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Strongly validated etag for optimistic concurrency control. Preserve the value returned from `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a
    * modification in the mean time. The `update_mask` of the request need not include `etag` for this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and
    * [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Use a multi-cluster routing policy. */
  var multiClusterRoutingUseAny: js.UndefOr[js.Any] = js.native
  
  /** The unique name of the app profile. Values are of the form `projects/{project}/instances/{instance}/appProfiles/_a-zA-Z0-9*`. */
  var name: js.UndefOr[String] = js.native
  
  /** Use a single-cluster routing policy. */
  var singleClusterRouting: js.UndefOr[SingleClusterRouting] = js.native
}
object AppProfile {
  
  @scala.inline
  def apply(): AppProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppProfile]
  }
  
  @scala.inline
  implicit class AppProfileMutableBuilder[Self <: AppProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setMultiClusterRoutingUseAny(value: js.Any): Self = StObject.set(x, "multiClusterRoutingUseAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiClusterRoutingUseAnyUndefined: Self = StObject.set(x, "multiClusterRoutingUseAny", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSingleClusterRouting(value: SingleClusterRouting): Self = StObject.set(x, "singleClusterRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleClusterRoutingUndefined: Self = StObject.set(x, "singleClusterRouting", js.undefined)
  }
}
