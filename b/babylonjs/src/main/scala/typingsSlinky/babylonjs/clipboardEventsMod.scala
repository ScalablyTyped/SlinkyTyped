package typingsSlinky.babylonjs

import org.scalajs.dom.raw.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardEventsMod {
  
  @JSImport("babylonjs/Events/clipboardEvents", "ClipboardEventTypes")
  @js.native
  class ClipboardEventTypes () extends StObject
  /* static members */
  object ClipboardEventTypes {
    
    /**
      * The clipboard event is fired when a copy command is active (pressed).
      */
    @JSImport("babylonjs/Events/clipboardEvents", "ClipboardEventTypes.COPY")
    @js.native
    val COPY: Double = js.native
    
    /**
      *  The clipboard event is fired when a cut command is active (pressed).
      */
    @JSImport("babylonjs/Events/clipboardEvents", "ClipboardEventTypes.CUT")
    @js.native
    val CUT: Double = js.native
    
    /**
      * The clipboard event is fired when a paste command is active (pressed).
      */
    @JSImport("babylonjs/Events/clipboardEvents", "ClipboardEventTypes.PASTE")
    @js.native
    val PASTE: Double = js.native
  }
  
  @JSImport("babylonjs/Events/clipboardEvents", "ClipboardInfo")
  @js.native
  class ClipboardInfo protected () extends StObject {
    /**
      *Creates an instance of ClipboardInfo.
      * @param type Defines the type of event (BABYLON.ClipboardEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (BABYLON.ClipboardEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: ClipboardEvent
    ) = this()
    
    /**
      * Defines the related dom event
      */
    var event: ClipboardEvent = js.native
    
    /**
      * Defines the type of event (BABYLON.ClipboardEventTypes)
      */
    var `type`: Double = js.native
  }
  /* static members */
  object ClipboardInfo {
    
    /**
      *  Get the clipboard event's type from the keycode.
      * @param keyCode Defines the keyCode for the current keyboard event.
      * @return {number}
      */
    @JSImport("babylonjs/Events/clipboardEvents", "ClipboardInfo.GetTypeFromCharacter")
    @js.native
    def GetTypeFromCharacter(keyCode: Double): Double = js.native
  }
}
