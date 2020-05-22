package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNative.mod.Rationale
import typingsSlinky.reactNativePermissions.anon.ReadonlyACCEPTHANDOVERand
import typingsSlinky.reactNativePermissions.anon.ReadonlyANDROIDReadonlyAC
import typingsSlinky.reactNativePermissions.anon.ReadonlyBLUETOOTHPERIPHER
import typingsSlinky.reactNativePermissions.anon.ReadonlyUNAVAILABLEunavai
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.blocked
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.denied
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.granted
import typingsSlinky.reactNativePermissions.reactNativePermissionsStrings.unavailable
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import typingsSlinky.reactNativePermissions.typesMod.Permission
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def check(permission: Permission): js.Promise[unavailable | denied | blocked | granted] = js.native
  def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | denied | blocked | granted
    ]
  ] = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def openSettings(): js.Promise[Unit] = js.native
  def request(permission: Permission): js.Promise[unavailable | denied | blocked | granted] = js.native
  def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | denied | blocked | granted] = js.native
  def requestMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
    Record[
      /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
      unavailable | denied | blocked | granted
    ]
  ] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  @js.native
  object PERMISSIONS extends js.Object {
    val ANDROID: ReadonlyACCEPTHANDOVERand = js.native
    val IOS: ReadonlyBLUETOOTHPERIPHER = js.native
  }
  
  @js.native
  object RESULTS extends js.Object {
    val BLOCKED: blocked = js.native
    val DENIED: denied = js.native
    val GRANTED: granted = js.native
    val UNAVAILABLE: unavailable = js.native
  }
  
  @js.native
  object default extends js.Object {
    var PERMISSIONS: ReadonlyANDROIDReadonlyAC = js.native
    var RESULTS: ReadonlyUNAVAILABLEunavai = js.native
    def check(permission: Permission): js.Promise[unavailable | denied | blocked | granted] = js.native
    def checkMultiple[P /* <: js.Array[Permission] */](permissions: P): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any, 
          unavailable | denied | blocked | granted
        ]
      ] = js.native
    def checkNotifications(): js.Promise[NotificationsResponse] = js.native
    def openSettings(): js.Promise[Unit] = js.native
    def request(permission: Permission): js.Promise[unavailable | denied | blocked | granted] = js.native
    def request(permission: Permission, rationale: Rationale): js.Promise[unavailable | denied | blocked | granted] = js.native
    def requestMultiple[P_1 /* <: js.Array[Permission] */](permissions: P_1): js.Promise[
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: P_1[number] */ js.Any, 
          unavailable | denied | blocked | granted
        ]
      ] = js.native
    def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
  }
  
}

