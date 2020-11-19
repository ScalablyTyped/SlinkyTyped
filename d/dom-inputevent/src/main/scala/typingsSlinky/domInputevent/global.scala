package typingsSlinky.domInputevent

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class InputEvent protected ()
    extends typingsSlinky.domInputevent.InputEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: InputEventInit) = this()
  }
  @js.native
  object InputEvent
    extends Instantiable1[/* type */ String, typingsSlinky.domInputevent.InputEvent]
       with Instantiable2[
          /* type */ String, 
          /* eventInitDict */ InputEventInit, 
          typingsSlinky.domInputevent.InputEvent
        ]
}
