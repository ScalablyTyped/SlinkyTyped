package typingsSlinky.luminoDomutils

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  object Platform {
    
    /**
      * A flag indicating whether the browser is Edge.
      */
    @JSImport("@lumino/domutils/types/platform", "Platform.IS_EDGE")
    @js.native
    val IS_EDGE: Boolean = js.native
    
    /**
      * A flag indicating whether the browser is IE.
      */
    @JSImport("@lumino/domutils/types/platform", "Platform.IS_IE")
    @js.native
    val IS_IE: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Mac.
      */
    @JSImport("@lumino/domutils/types/platform", "Platform.IS_MAC")
    @js.native
    val IS_MAC: Boolean = js.native
    
    /**
      * A flag indicating whether the platform is Windows.
      */
    @JSImport("@lumino/domutils/types/platform", "Platform.IS_WIN")
    @js.native
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
    @JSImport("@lumino/domutils/types/platform", "Platform.accelKey")
    @js.native
    def accelKey(event: KeyboardEvent): Boolean = js.native
    @JSImport("@lumino/domutils/types/platform", "Platform.accelKey")
    @js.native
    def accelKey(event: MouseEvent): Boolean = js.native
  }
}
