package typingsSlinky.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidInfo extends StObject {
  
  /** Link to open on Android if the app is not installed. */
  var androidFallbackLink: js.UndefOr[String] = js.native
  
  /** If specified, this overrides the ‘link’ parameter on Android. */
  var androidLink: js.UndefOr[String] = js.native
  
  /** Minimum version code for the Android app. If the installed app’s version code is lower, then the user is taken to the Play Store. */
  var androidMinPackageVersionCode: js.UndefOr[String] = js.native
  
  /** Android package name of the app. */
  var androidPackageName: js.UndefOr[String] = js.native
}
object AndroidInfo {
  
  @scala.inline
  def apply(): AndroidInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidInfo]
  }
  
  @scala.inline
  implicit class AndroidInfoMutableBuilder[Self <: AndroidInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidFallbackLink(value: String): Self = StObject.set(x, "androidFallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidFallbackLinkUndefined: Self = StObject.set(x, "androidFallbackLink", js.undefined)
    
    @scala.inline
    def setAndroidLink(value: String): Self = StObject.set(x, "androidLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidLinkUndefined: Self = StObject.set(x, "androidLink", js.undefined)
    
    @scala.inline
    def setAndroidMinPackageVersionCode(value: String): Self = StObject.set(x, "androidMinPackageVersionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidMinPackageVersionCodeUndefined: Self = StObject.set(x, "androidMinPackageVersionCode", js.undefined)
    
    @scala.inline
    def setAndroidPackageName(value: String): Self = StObject.set(x, "androidPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidPackageNameUndefined: Self = StObject.set(x, "androidPackageName", js.undefined)
  }
}
