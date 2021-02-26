package typingsSlinky.babylonjs

import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.pickingInfoMod.PickingInfo
import typingsSlinky.babylonjs.rayMod.Ray
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerEventsMod {
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes")
  @js.native
  class PointerEventTypes () extends StObject
  /* static members */
  object PointerEventTypes {
    
    /**
      * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERDOUBLETAP")
    @js.native
    val POINTERDOUBLETAP: Double = js.native
    
    /**
      * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERDOWN")
    @js.native
    val POINTERDOWN: Double = js.native
    
    /**
      * The pointermove event is fired when a pointer changes coordinates.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERMOVE")
    @js.native
    val POINTERMOVE: Double = js.native
    
    /**
      * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERPICK")
    @js.native
    val POINTERPICK: Double = js.native
    
    /**
      * The pointertap event is fired when a the object has been touched and released without drag.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERTAP")
    @js.native
    val POINTERTAP: Double = js.native
    
    /**
      * The pointerup event is fired when a pointer is no longer active.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERUP")
    @js.native
    val POINTERUP: Double = js.native
    
    /**
      * The pointerwheel event is fired when a mouse wheel has been rotated.
      */
    @JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes.POINTERWHEEL")
    @js.native
    val POINTERWHEEL: Double = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfo")
  @js.native
  class PointerInfo protected () extends PointerInfoBase {
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
    
    /**
      * Defines the picking info associated to the info (if any)\
      */
    var pickInfo: Nullable[PickingInfo] = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfoBase")
  @js.native
  class PointerInfoBase protected () extends StObject {
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
    
    /**
      * Defines the related dom event
      */
    var event: PointerEvent | WheelEvent = js.native
    
    /**
      * Defines the type of event (PointerEventTypes)
      */
    var `type`: Double = js.native
  }
  
  @JSImport("babylonjs/Events/pointerEvents", "PointerInfoPre")
  @js.native
  class PointerInfoPre protected () extends PointerInfoBase {
    /**
      * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
      * @param type Defines the type of event (PointerEventTypes)
      * @param event Defines the related dom event
      * @param localX Defines the local x coordinates of the pointer when the event occured
      * @param localY Defines the local y coordinates of the pointer when the event occured
      */
    def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
    def this(`type`: Double, event: WheelEvent, localX: Double, localY: Double) = this()
    
    /**
      * Defines the local position of the pointer on the canvas.
      */
    var localPosition: Vector2 = js.native
    
    /**
      * Ray from a pointer if availible (eg. 6dof controller)
      */
    var ray: Nullable[Ray] = js.native
    
    /**
      * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
      */
    var skipOnPointerObservable: Boolean = js.native
  }
  
  @js.native
  trait PointerTouch extends StObject {
    
    /**
      * Id of touch. Unique for each finger.
      */
    var pointerId: Double = js.native
    
    /**
      * Event type passed from DOM.
      */
    var `type`: js.Any = js.native
    
    /**
      * X coordinate of touch.
      */
    var x: Double = js.native
    
    /**
      * Y coordinate of touch.
      */
    var y: Double = js.native
  }
  object PointerTouch {
    
    @scala.inline
    def apply(pointerId: Double, `type`: js.Any, x: Double, y: Double): PointerTouch = {
      val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerTouch]
    }
    
    @scala.inline
    implicit class PointerTouchMutableBuilder[Self <: PointerTouch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
