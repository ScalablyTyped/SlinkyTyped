package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.reactDashNativeDashFirebase.TypeofClassBlob
import typingsSlinky.reactDashNativeDashFirebase.TypeofClassFieldPath
import typingsSlinky.reactDashNativeDashFirebase.TypeofClassFieldValue
import typingsSlinky.reactDashNativeDashFirebase.TypeofClassTimestamp
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.debug
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.error_
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirestoreStatics extends js.Object {
  var Blob: TypeofClassBlob = js.native
  var FieldPath: TypeofClassFieldPath = js.native
  var FieldValue: TypeofClassFieldValue = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.GeoPoint
  ] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  def enableLogging(enabled: Boolean): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error_): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}

