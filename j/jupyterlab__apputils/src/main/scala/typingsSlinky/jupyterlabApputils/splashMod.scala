package typingsSlinky.jupyterlabApputils

import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splashMod {
  
  @js.native
  trait ISplashScreen extends StObject {
    
    /**
      * Show the application splash screen.
      *
      * @param light - Whether to show the light splash screen or the dark one.
      *
      * @returns A disposable used to clear the splash screen.
      */
    def show(): IDisposable = js.native
    def show(light: Boolean): IDisposable = js.native
  }
  @JSImport("@jupyterlab/apputils/lib/splash", "ISplashScreen")
  @js.native
  val ISplashScreen: Token[typingsSlinky.jupyterlabApputils.splashMod.ISplashScreen] = js.native
}
