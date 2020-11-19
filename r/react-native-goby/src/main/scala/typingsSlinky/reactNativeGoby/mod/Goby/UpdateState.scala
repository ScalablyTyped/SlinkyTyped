package typingsSlinky.reactNativeGoby.mod.Goby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateState extends js.Object
/**
  * Indicates the state that an update is currently in.
  */
@JSImport("react-native-goby", "Goby.UpdateState")
@js.native
object UpdateState extends js.Object {
  
  /**
    * Indicates than an update represents the latest available
    * release, and can be either currently running or pending.
    */
  @js.native
  sealed trait LATEST extends UpdateState
  
  /**
    * Indicates than an update has been installed, but the
    * app hasn't been restarted yet in order to apply it.
    */
  @js.native
  sealed trait PENDING extends UpdateState
  
  /**
    * Indicates that an update represents the
    * version of the app that is currently running.
    */
  @js.native
  sealed trait RUNNING extends UpdateState
}
