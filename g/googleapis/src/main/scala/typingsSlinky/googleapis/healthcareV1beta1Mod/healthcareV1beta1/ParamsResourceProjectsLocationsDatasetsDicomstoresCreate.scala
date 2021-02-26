package typingsSlinky.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsDicomstoresCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the DICOM store that is being created. Any string value up to
    * 256 characters in length.
    */
  var dicomStoreId: js.UndefOr[String] = js.native
  
  /**
    * The name of the dataset this DICOM store belongs to.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDicomStore] = js.native
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsDicomstoresCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDicomStoreId(value: String): Self = StObject.set(x, "dicomStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDicomStoreIdUndefined: Self = StObject.set(x, "dicomStoreId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDicomStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
