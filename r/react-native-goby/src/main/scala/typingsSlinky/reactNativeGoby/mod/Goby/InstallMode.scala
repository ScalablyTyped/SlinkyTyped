package typingsSlinky.reactNativeGoby.mod.Goby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InstallMode extends js.Object
/**
  * Indicates when you would like an installed update to actually be applied.
  */
@JSImport("react-native-goby", "Goby.InstallMode")
@js.native
object InstallMode extends js.Object {
  
  /**
    * Indicates that you want to install the update and restart the app immediately.
    */
  @js.native
  sealed trait IMMEDIATE extends InstallMode
  
  /**
    * Indicates that you want to install the update, but not forcibly restart the app.
    */
  @js.native
  sealed trait ON_NEXT_RESTART extends InstallMode
  
  /**
    * Indicates that you want to install the update, but don't want to restart the
    * app until the next time the end user resumes it from the background.
    */
  @js.native
  sealed trait ON_NEXT_RESUME extends InstallMode
}
