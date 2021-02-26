package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A configured rewrite that will direct any requests to a Cloud Run service.
  * If the Cloud Run service does not exist when setting or updating your
  * Firebase Hosting configuration then the request will fail. Any errors from
  * the Cloud Run service (including when the service has been deleted) will be
  * passed back down to the end user.
  */
@js.native
trait SchemaCloudRunRewrite extends StObject {
  
  /**
    * Optional. The region where the Cloud Run service is hosted.  Defaults to
    * `us-central1` if not supplied.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Required. User supplied ID of the Cloud Run service.
    */
  var serviceId: js.UndefOr[String] = js.native
}
object SchemaCloudRunRewrite {
  
  @scala.inline
  def apply(): SchemaCloudRunRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudRunRewrite]
  }
  
  @scala.inline
  implicit class SchemaCloudRunRewriteMutableBuilder[Self <: SchemaCloudRunRewrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
