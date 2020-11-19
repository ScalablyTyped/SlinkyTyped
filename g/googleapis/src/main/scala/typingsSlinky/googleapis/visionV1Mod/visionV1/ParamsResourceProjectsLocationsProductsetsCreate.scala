package typingsSlinky.googleapis.visionV1Mod.visionV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsProductsetsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The project in which the ProductSet should be created.  Format is
    * `projects/PROJECT_ID/locations/LOC_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied resource id for this ProductSet. If set, the server will
    * attempt to use this value as the resource id. If it is already in use, an
    * error is returned with code ALREADY_EXISTS. Must be at most 128
    * characters long. It cannot contain the character `/`.
    */
  var productSetId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductSet] = js.native
}
object ParamsResourceProjectsLocationsProductsetsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsProductsetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsetsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsProductsetsCreateOps[Self <: ParamsResourceProjectsLocationsProductsetsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProductSetId(value: String): Self = this.set("productSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductSetId: Self = this.set("productSetId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaProductSet): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
