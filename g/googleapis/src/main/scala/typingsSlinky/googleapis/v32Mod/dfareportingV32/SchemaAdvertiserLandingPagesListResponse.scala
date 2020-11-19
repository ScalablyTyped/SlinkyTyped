package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Landing Page List Response
  */
@js.native
trait SchemaAdvertiserLandingPagesListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiserLandingPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Landing page collection
    */
  var landingPages: js.UndefOr[js.Array[SchemaLandingPage]] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaAdvertiserLandingPagesListResponse {
  
  @scala.inline
  def apply(): SchemaAdvertiserLandingPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserLandingPagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaAdvertiserLandingPagesListResponseOps[Self <: SchemaAdvertiserLandingPagesListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLandingPagesVarargs(value: SchemaLandingPage*): Self = this.set("landingPages", js.Array(value :_*))
    
    @scala.inline
    def setLandingPages(value: js.Array[SchemaLandingPage]): Self = this.set("landingPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandingPages: Self = this.set("landingPages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
