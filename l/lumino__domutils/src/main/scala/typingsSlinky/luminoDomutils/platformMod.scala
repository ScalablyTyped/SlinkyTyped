package typingsSlinky.luminoDomutils

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/domutils/types/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  
  @js.native
  object Platform extends js.Object {
    
    /**
      * A flag indicating whether the browser is Edge.
      */
    val IS_EDGE: Boolean = js.native
    
    /**
      * A flag indicating whether the browser is IE.
      */
    val IS_IE: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Mac.
      */
    val IS_MAC: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Windows.
      */
    val IS_WIN: Boolean = js.native
    
    /**
      * Test whether the `accel` key is pressed.
      *
      * @param event - The keyboard or mouse event of interest.
      *
      * @returns Whether the `accel` key is pressed.
      *
      * #### Notes
      * On Mac the `accel` key is the command key. On all other
      * platforms the `accel` key is the control key.
      */
    def accelKey(event: KeyboardEvent): Boolean = js.native
    def accelKey(event: MouseEvent): Boolean = js.native
  }
}
