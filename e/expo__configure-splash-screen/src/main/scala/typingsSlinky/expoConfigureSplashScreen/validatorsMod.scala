package typingsSlinky.expoConfigureSplashScreen

import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfig
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfig
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("@expo/configure-splash-screen/build/validators", "validateAndroidConfig")
  @js.native
  def validateAndroidConfig(config: AndroidSplashScreenConfigJSON): js.Promise[AndroidSplashScreenConfig] = js.native
  
  @JSImport("@expo/configure-splash-screen/build/validators", "validateEnumValue")
  @js.native
  def validateEnumValue[T /* <: Record[String, String] */](value: String, availableValues: T): /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  
  @JSImport("@expo/configure-splash-screen/build/validators", "validateIosConfig")
  @js.native
  def validateIosConfig(config: IosSplashScreenConfigJSON): js.Promise[IosSplashScreenConfig] = js.native
}
