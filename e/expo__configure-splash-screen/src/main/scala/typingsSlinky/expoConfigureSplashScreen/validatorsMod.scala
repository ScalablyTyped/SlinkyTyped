package typingsSlinky.expoConfigureSplashScreen

import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfig
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfig
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  
  def validateAndroidConfig(config: AndroidSplashScreenConfigJSON): js.Promise[AndroidSplashScreenConfig] = js.native
  
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  
  def validateIosConfig(config: IosSplashScreenConfigJSON): js.Promise[IosSplashScreenConfig] = js.native
}
