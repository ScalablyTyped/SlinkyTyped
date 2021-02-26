package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEditsExpansionfilesGet extends StandardParameters {
  
  /**
    * The version code of the APK whose Expansion File configuration is being
    * read or modified.
    */
  var apkVersionCode: js.UndefOr[Double] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var expansionFileType: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier for the Android app that is being updated; for example,
    * "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
}
object ParamsResourceEditsExpansionfilesGet {
  
  @scala.inline
  def apply(): ParamsResourceEditsExpansionfilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsExpansionfilesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceEditsExpansionfilesGetMutableBuilder[Self <: ParamsResourceEditsExpansionfilesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApkVersionCode(value: Double): Self = StObject.set(x, "apkVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApkVersionCodeUndefined: Self = StObject.set(x, "apkVersionCode", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    @scala.inline
    def setExpansionFileType(value: String): Self = StObject.set(x, "expansionFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpansionFileTypeUndefined: Self = StObject.set(x, "expansionFileType", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
