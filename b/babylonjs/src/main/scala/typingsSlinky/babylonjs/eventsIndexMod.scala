package typingsSlinky.babylonjs

import org.scalajs.dom.raw.ClipboardEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.babylonjs.pickingInfoMod.PickingInfo
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsIndexMod {
  
  @JSImport("babylonjs/Events/index", "ClipboardEventTypes")
  @js.native
  class ClipboardEventTypes ()
    extends typingsSlinky.babylonjs.clipboardEventsMod.ClipboardEventTypes
  /* static members */
  object ClipboardEventTypes {
    
    /**
      * The clipboard event is fired when a copy command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.COPY")
    @js.native
    val COPY: Double = js.native
    
    /**
      *  The clipboard event is fired when a cut command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.CUT")
    @js.native
    val CUT: Double = js.native
    
    /**
      * The clipboard event is fired when a paste command is active (pressed).
      */
    @JSImport("babylonjs/Events/index", "ClipboardEventTypes.PASTE")
    @js.native
    val PASTE: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "ClipboardInfo")
  @js.native
  class ClipboardInfo protected ()
    extends typingsSlinky.babylonjs.clipboardEventsMod.ClipboardInfo {
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
  }
  /* static members */
  object ClipboardInfo {
    
    /**
      *  Get the clipboard event's type from the keycode.
      * @param keyCode Defines the keyCode for the current keyboard event.
      * @return {number}
      */
    @JSImport("babylonjs/Events/index", "ClipboardInfo.GetTypeFromCharacter")
    @js.native
    def GetTypeFromCharacter(keyCode: Double): Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardEventTypes")
  @js.native
  class KeyboardEventTypes ()
    extends typingsSlinky.babylonjs.keyboardEventsMod.KeyboardEventTypes
  /* static members */
  object KeyboardEventTypes {
    
    /**
      * The keydown event is fired when a key becomes active (pressed).
      */
    @JSImport("babylonjs/Events/index", "KeyboardEventTypes.KEYDOWN")
    @js.native
    val KEYDOWN: Double = js.native
    
    /**
      * The keyup event is fired when a key has been released.
      */
    @JSImport("babylonjs/Events/index", "KeyboardEventTypes.KEYUP")
    @js.native
    val KEYUP: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardInfo")
  @js.native
  class KeyboardInfo protected ()
    extends typingsSlinky.babylonjs.keyboardEventsMod.KeyboardInfo {
    /**
      * Instantiates a new keyboard info.
      * This class is used to store keyboard related info for the onKeyboardObservable event.
      * @param type Defines the type of event (KeyboardEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (KeyboardEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: KeyboardEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "KeyboardInfoPre")
  @js.native
  class KeyboardInfoPre protected ()
    extends typingsSlinky.babylonjs.keyboardEventsMod.KeyboardInfoPre {
    /**
      * Instantiates a new keyboard pre info.
      * This class is used to store keyboard related info for the onPreKeyboardObservable event.
      * @param type Defines the type of event (KeyboardEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (KeyboardEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: KeyboardEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerEventTypes")
  @js.native
  class PointerEventTypes ()
    extends typingsSlinky.babylonjs.pointerEventsMod.PointerEventTypes
  /* static members */
  object PointerEventTypes {
    
    /**
      * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERDOUBLETAP")
    @js.native
    val POINTERDOUBLETAP: Double = js.native
    
    /**
      * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERDOWN")
    @js.native
    val POINTERDOWN: Double = js.native
    
    /**
      * The pointermove event is fired when a pointer changes coordinates.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERMOVE")
    @js.native
    val POINTERMOVE: Double = js.native
    
    /**
      * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERPICK")
    @js.native
    val POINTERPICK: Double = js.native
    
    /**
      * The pointertap event is fired when a the object has been touched and released without drag.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERTAP")
    @js.native
    val POINTERTAP: Double = js.native
    
    /**
      * The pointerup event is fired when a pointer is no longer active.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERUP")
    @js.native
    val POINTERUP: Double = js.native
    
    /**
      * The pointerwheel event is fired when a mouse wheel has been rotated.
      */
    @JSImport("babylonjs/Events/index", "PointerEventTypes.POINTERWHEEL")
    @js.native
    val POINTERWHEEL: Double = js.native
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfo")
  @js.native
  class PointerInfo protected ()
    extends typingsSlinky.babylonjs.pointerEventsMod.PointerInfo {
    /**
      * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param pickInfo Defines the picking info associated to the info (if any)\
      */
    def this(
      `type`: Double,
      event: PointerEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
    def this(
      `type`: Double,
      event: WheelEvent,
      /**
      * Defines the picking info associated to the info (if any)\
      */
    pickInfo: Nullable[PickingInfo]
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfoBase")
  @js.native
  class PointerInfoBase protected ()
    extends typingsSlinky.babylonjs.pointerEventsMod.PointerInfoBase {
    /**
      * Instantiates the base class of pointers info.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      */
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: PointerEvent
    ) = this()
    def this(
      /**
      * Defines the type of event (PointerEventTypes)
      */
    `type`: Double,
      /**
      * Defines the related dom event
      */
    event: WheelEvent
    ) = this()
  }
  
  @JSImport("babylonjs/Events/index", "PointerInfoPre")
  @js.native
  class PointerInfoPre protected ()
    extends typingsSlinky.babylonjs.pointerEventsMod.PointerInfoPre {
    /**
      * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param localX Defines the local x coordinates of the pointer when the event occured
      * @param localY Defines the local y coordinates of the pointer when the event occured
      */
    def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
    def this(`type`: Double, event: WheelEvent, localX: Double, localY: Double) = this()
  }
}
