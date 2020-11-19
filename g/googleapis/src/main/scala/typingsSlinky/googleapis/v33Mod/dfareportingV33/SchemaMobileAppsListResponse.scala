package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile app List Response
  */
@js.native
trait SchemaMobileAppsListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Mobile apps collection.
    */
  var mobileApps: js.UndefOr[js.Array[SchemaMobileApp]] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaMobileAppsListResponse {
  
  @scala.inline
  def apply(): SchemaMobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileAppsListResponse]
  }
  
  @scala.inline
  implicit class SchemaMobileAppsListResponseOps[Self <: SchemaMobileAppsListResponse] (val x: Self) extends AnyVal {
    
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
    def setMobileAppsVarargs(value: SchemaMobileApp*): Self = this.set("mobileApps", js.Array(value :_*))
    
    @scala.inline
    def setMobileApps(value: js.Array[SchemaMobileApp]): Self = this.set("mobileApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileApps: Self = this.set("mobileApps", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
