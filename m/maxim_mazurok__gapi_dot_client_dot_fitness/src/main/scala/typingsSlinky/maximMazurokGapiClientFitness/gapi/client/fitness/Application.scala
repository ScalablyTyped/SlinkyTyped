package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  /** An optional URI that can be used to link back to the application. */
  var detailsUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of this application. This is required for REST clients, but we do not enforce uniqueness of this name. It is provided as a matter of convenience for other developers who
    * would like to identify which REST created an Application or Data Source.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Package name for this application. This is used as a unique identifier when created by Android applications, but cannot be specified by REST clients. REST clients will have their
    * developer project number reflected into the Data Source data stream IDs, instead of the packageName.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /** Version of the application. You should update this field whenever the application changes in a way that affects the computation of the data. */
  var version: js.UndefOr[String] = js.native
}
object Application {
  
  @scala.inline
  def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailsUrl(value: String): Self = StObject.set(x, "detailsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUrlUndefined: Self = StObject.set(x, "detailsUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
