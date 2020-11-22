package typingsSlinky.expo

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DangerZone: typingsSlinky.expo.dangerZoneMod.DangerZone = js.native
  
  def apisAreAvailable(): Boolean = js.native
  
  def registerRootComponent[P](component: ReactComponentClass[P]): Unit = js.native
  
  @js.native
  class AppLoading ()
    extends typingsSlinky.expo.appLoadingMod.AppLoading
  
  @js.native
  object Logs extends js.Object {
    
    def disableExpoCliLogging(): Unit = js.native
    
    def enableExpoCliLogging(): Unit = js.native
  }
}
