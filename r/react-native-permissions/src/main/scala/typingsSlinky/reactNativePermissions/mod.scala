package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNative.mod.Rationale
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyACCEPTHAN
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyACCESSORY
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyANDROIDRe
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyAPPTRACKI
import typingsSlinky.reactNativePermissions.anon.ReadonlyreadonlyUNAVAILAB
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.limited
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.unavailable
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracy
import typingsSlinky.reactNativePermissions.typesMod.LocationAccuracyOptions
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import typingsSlinky.reactNativePermissions.typesMod.Permission
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def check(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  
  def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
  
  def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | blocked | denied | granted | limited
    ]
  ] = js.native
  
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  
  def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
  
  def openSettings(): js.Promise[Unit] = js.native
  
  def request(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
  
  def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
  
  def requestMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | blocked | denied | granted | limited
    ]
  ] = js.native
  
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  
  @js.native
  object PERMISSIONS extends js.Object {
    
    val ANDROID: ReadonlyreadonlyACCEPTHAN = js.native
    
    val IOS: ReadonlyreadonlyAPPTRACKI = js.native
    
    val WINDOWS: ReadonlyreadonlyACCESSORY = js.native
  }
  
  @js.native
  object RESULTS extends js.Object {
    
    val BLOCKED: blocked = js.native
    
    val DENIED: denied = js.native
    
    val GRANTED: granted = js.native
    
    val LIMITED: limited = js.native
    
    val UNAVAILABLE: unavailable = js.native
  }
  
  @js.native
  object default extends js.Object {
    
    var PERMISSIONS: ReadonlyreadonlyANDROIDRe = js.native
    
    var RESULTS: ReadonlyreadonlyUNAVAILAB = js.native
    
    def check(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    
    def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
    
    def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          unavailable | blocked | denied | granted | limited
        ]
      ] = js.native
    
    def checkNotifications(): js.Promise[NotificationsResponse] = js.native
    
    def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
    
    def openSettings(): js.Promise[Unit] = js.native
    
    def request(permission: Permission): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | blocked | denied | granted | limited] = js.native
    
    def requestLocationAccuracy(options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
    
    def requestMultiple[P_1 /* <: js.Array[Permission] */](permissions: P_1): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P_1[number] */ js.Any, 
          unavailable | blocked | denied | granted | limited
        ]
      ] = js.native
    
    def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  }
}
