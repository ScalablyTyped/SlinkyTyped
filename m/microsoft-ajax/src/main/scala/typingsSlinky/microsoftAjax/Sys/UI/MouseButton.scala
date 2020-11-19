package typingsSlinky.microsoftAjax.Sys.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MouseButton extends js.Object
/**
  * Describes mouse button locations.
  */
@JSGlobal("Sys.UI.MouseButton")
@js.native
object MouseButton extends js.Object {
  
  /**
    * Represents the left mouse button.
    */
  @js.native
  sealed trait leftButton extends MouseButton
  
  /**
    * Represents the middle mouse button.
    */
  @js.native
  sealed trait middleButton extends MouseButton
  
  /**
    * Represents the right mouse button.
    */
  @js.native
  sealed trait rightButton extends MouseButton
}
