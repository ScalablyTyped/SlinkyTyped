package typingsSlinky.firebaseApp

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.firebaseApp.firebaseAppLiteMod.FirebaseAppLiteImpl
import typingsSlinky.firebaseApp.firebaseAppMod.FirebaseAppImpl
import typingsSlinky.firebaseAppTypes.mod.FirebaseAppConfig
import typingsSlinky.firebaseAppTypes.mod.FirebaseOptions
import typingsSlinky.firebaseAppTypes.privateMod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/packages/app/src/firebaseNamespaceCore", JSImport.Namespace)
@js.native
object firebaseNamespaceCoreMod extends js.Object {
  def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable3[
      /* options */ FirebaseOptions, 
      /* config */ FirebaseAppConfig, 
      /* firebase_ */ FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): typingsSlinky.firebaseAppTypes.mod.FirebaseNamespace = js.native
}

