package typingsSlinky.googleapis.storageV1beta2Mod.storageV1beta2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBucketsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.native
  
  /**
    * Makes the return of the bucket metadata conditional on whether the
    * bucket's current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the return of the bucket metadata conditional on whether the
    * bucket's current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Set of properties to return. Defaults to full.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBucket] = js.native
}
object ParamsResourceBucketsPatch {
  
  @scala.inline
  def apply(): ParamsResourceBucketsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceBucketsPatchOps[Self <: ParamsResourceBucketsPatch] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaBucket): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
}
