package typingsSlinky.firebaseAnalytics

import typingsSlinky.firebaseAnalytics.anon.ApiKey
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFakeFirebaseServicesMod {
  
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeApp")
  @js.native
  def getFakeApp(): FirebaseApp = js.native
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeApp")
  @js.native
  def getFakeApp(fakeAppParams: ApiKey): FirebaseApp = js.native
  
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeInstallations")
  @js.native
  def getFakeInstallations(): FirebaseInstallations = js.native
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeInstallations")
  @js.native
  def getFakeInstallations(fid: js.UndefOr[scala.Nothing], onFidResolve: js.Function): FirebaseInstallations = js.native
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeInstallations")
  @js.native
  def getFakeInstallations(fid: String): FirebaseInstallations = js.native
  @JSImport("@firebase/analytics/dist/testing/get-fake-firebase-services", "getFakeInstallations")
  @js.native
  def getFakeInstallations(fid: String, onFidResolve: js.Function): FirebaseInstallations = js.native
}
