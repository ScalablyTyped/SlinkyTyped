package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNative.mod.Rationale
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracy
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracyOptions
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import typingsSlinky.reactNativePermissions.typesMod.Permission
import typingsSlinky.reactNativePermissions.typesMod.PermissionStatus
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contractMod {
  
  @js.native
  trait Contract extends StObject {
    
    def check(permission: Permission): js.Promise[PermissionStatus] = js.native
    
    def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
    
    def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          PermissionStatus
        ]
      ] = js.native
    
    def checkNotifications(): js.Promise[NotificationsResponse] = js.native
    
    def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
    
    def openSettings(): js.Promise[Unit] = js.native
    
    def request(permission: Permission): js.Promise[PermissionStatus] = js.native
    def request(permission: Permission, rationale: Rationale): js.Promise[PermissionStatus] = js.native
    
    def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
    
    def requestMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          PermissionStatus
        ]
      ] = js.native
    
    def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  }
}
