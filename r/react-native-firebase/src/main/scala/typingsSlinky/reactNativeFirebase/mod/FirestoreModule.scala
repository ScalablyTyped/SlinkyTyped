package typingsSlinky.reactNativeFirebase.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.reactNativeFirebase.anon.TypeofBlob
import typingsSlinky.reactNativeFirebase.anon.TypeofFieldPath
import typingsSlinky.reactNativeFirebase.anon.TypeofFieldValue
import typingsSlinky.reactNativeFirebase.anon.TypeofTimestamp
import typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-firebase.react-native-firebase.FirebaseModuleAndStatics<react-native-firebase.react-native-firebase.RNFirebase.firestore.Firestore, react-native-firebase.react-native-firebase.RNFirebase.firestore.FirestoreStatics> */
@js.native
trait FirestoreModule extends StObject {
  
  def apply(): Firestore = js.native
  
  var Blob: TypeofBlob with Instantiable0[typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Blob] = js.native
  
  var FieldPath: TypeofFieldPath with (Instantiable1[
    /* segments (repeated) */ String, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
  ]) = js.native
  
  var FieldValue: TypeofFieldValue with Instantiable0[typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue] = js.native
  
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ] = js.native
  
  var Timestamp: TypeofTimestamp with (Instantiable2[
    /* seconds */ Double, 
    /* nanoseconds */ Double, 
    typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
  ]) = js.native
  
  def enableLogging(enabled: Boolean): Unit = js.native
  
  var nativeModuleExists: Boolean = js.native
  
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error_): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}
