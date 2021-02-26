package typingsSlinky.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseAppInfo extends StObject {
  
  /**
    * Output only. Immutable. The globally unique, Firebase-assigned identifier for the `WebApp`. This identifier should be treated as an opaque token, as the data format is not
    * specified.
    */
  var appId: js.UndefOr[String] = js.native
  
  /** The user-assigned display name of the Firebase App. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The resource name of the Firebase App, in the format: projects/PROJECT_ID /iosApps/APP_ID or projects/PROJECT_ID/androidApps/APP_ID or projects/ PROJECT_ID/webApps/APP_ID */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. Immutable. The platform-specific identifier of the App. *Note:* For most use cases, use `appId`, which is the canonical, globally unique identifier for referencing an
    * App. This string is derived from a native identifier for each platform: `packageName` for an `AndroidApp`, `bundleId` for an `IosApp`, and `webId` for a `WebApp`. Its contents
    * should be treated as opaque, as the native identifier format may change as platforms evolve. This string is only unique within a `FirebaseProject` and its associated Apps.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /** The platform of the Firebase App. */
  var platform: js.UndefOr[String] = js.native
}
object FirebaseAppInfo {
  
  @scala.inline
  def apply(): FirebaseAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseAppInfo]
  }
  
  @scala.inline
  implicit class FirebaseAppInfoMutableBuilder[Self <: FirebaseAppInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
  }
}
