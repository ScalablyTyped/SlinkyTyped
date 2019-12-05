package typingsSlinky.atFirebaseApp

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.atFirebaseApp.distAppSrcFirebaseAppMod.FirebaseAppImpl
import typingsSlinky.atFirebaseApp.distAppSrcLiteFirebaseAppLiteMod.FirebaseAppLiteImpl
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseAppConfig
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseNamespace
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseOptions
import typingsSlinky.atFirebaseAppDashTypes.privateMod._FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/app/src/firebaseNamespaceCore", JSImport.Namespace)
@js.native
object distAppSrcFirebaseNamespaceCoreMod extends js.Object {
  def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable3[
      /* options */ FirebaseOptions, 
      /* config */ FirebaseAppConfig, 
      /* firebase_ */ _FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): FirebaseNamespace = js.native
}

