package typingsSlinky.firebaseAnalytics

import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", JSImport.Namespace)
@js.native
object getFakeFirebaseServicesMod extends js.Object {
  def getFakeApp(): FirebaseApp = js.native
  def getFakeApp(measurementId: String): FirebaseApp = js.native
  def getFakeInstallations(): FirebaseInstallations = js.native
  def getFakeInstallations(fid: String): FirebaseInstallations = js.native
}

