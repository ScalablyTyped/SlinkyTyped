package typingsSlinky.bootstrap.popoverMod.Popover

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends js.Object
@JSImport("bootstrap/js/dist/popover", "Popover.Events")
@js.native
object Events extends js.Object {
  
  /**
    * This event is fired when the popover has finished being hidden from
    * the user (will wait for CSS transitions to complete).
    */
  @js.native
  sealed trait hidden extends Events
  
  /**
    * This event is fired immediately when the hide instance method has
    * been called.
    */
  @js.native
  sealed trait hide extends Events
  
  /**
    * This event is fired after the show.bs.popover event when the popover
    * template has been added to the DOM.
    */
  @js.native
  sealed trait inserted extends Events
  
  /**
    * This event fires immediately when the show instance method is called.
    */
  @js.native
  sealed trait show extends Events
  
  /**
    * This event is fired when the popover has been made visible to the
    * user (will wait for CSS transitions to complete).
    */
  @js.native
  sealed trait shown extends Events
}
