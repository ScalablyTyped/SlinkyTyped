package typingsSlinky.chromeApps.chrome

import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.runtime.OptionalPermission
import typingsSlinky.chromeApps.chrome.runtime.UrlMatches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.permissions
/////////////////
// Permissions //
/////////////////
/**
  * Use the chrome.permissions API to request declared optional permissions at run time rather than install time,
  * so users understand why the permissions are needed and grant only those that are necessary.
  * @since Chrome 16.
  */
object permissions {
  
  type PermissionEvent = Event[js.Function1[/* permissions */ Permissions, Unit]]
  
  @js.native
  trait Permissions extends StObject {
    
    /**
      * List of origin permissions.
      * Anything listed here must be a subset of a host that appears in the
      * optional_permissions list in the manifest. For example, if
      * http:// *.example.com/ or http:// * appears in optional_permissions,
      * you can request an origin of http://help.example.com/.
      * Any path is ignored.
      */
    var origins: js.UndefOr[js.Array[String | UrlMatches]] = js.native
    
    /**
      * List of named permissions (does not include hosts or origins).
      * Anything listed here must appear in the optional_permissions list in the manifest.
      */
    var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.native
  }
  object Permissions {
    
    @scala.inline
    def apply(): Permissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Permissions]
    }
    
    @scala.inline
    implicit class PermissionsMutableBuilder[Self <: Permissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigins(value: js.Array[String | UrlMatches]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      @scala.inline
      def setOriginsVarargs(value: (String | UrlMatches)*): Self = StObject.set(x, "origins", js.Array(value :_*))
      
      @scala.inline
      def setPermissions(value: js.Array[OptionalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      @scala.inline
      def setPermissionsVarargs(value: OptionalPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    }
  }
}
