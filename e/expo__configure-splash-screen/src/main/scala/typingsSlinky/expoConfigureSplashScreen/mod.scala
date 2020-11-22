package typingsSlinky.expoConfigureSplashScreen

import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.`dark-content`
import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.`light-content`
import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.contain
import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.cover
import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.default
import typingsSlinky.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.native
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.AndroidSplashScreenConfigJSON
import typingsSlinky.expoConfigureSplashScreen.splashScreenConfigMod.IosSplashScreenConfigJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def configureAndroidSplashScreen(projectRootPath: String, configJSON: AndroidSplashScreenConfigJSON): js.Promise[Unit] = js.native
  
  def configureIosSplashScreen(projectRootPath: String, config: IosSplashScreenConfigJSON): js.Promise[Unit] = js.native
  
  @js.native
  object SplashScreenImageResizeMode extends js.Object {
    
    val CONTAIN: contain = js.native
    
    val COVER: cover = js.native
    
    val NATIVE: native = js.native
  }
  
  @js.native
  object SplashScreenStatusBarStyle extends js.Object {
    
    val DARK_CONTENT: `dark-content` = js.native
    
    val DEFAULT: default = js.native
    
    val LIGHT_CONTENT: `light-content` = js.native
  }
}
