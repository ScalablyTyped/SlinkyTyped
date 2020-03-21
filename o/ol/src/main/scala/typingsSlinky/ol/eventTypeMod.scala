package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/EventType", JSImport.Namespace)
@js.native
object eventTypeMod extends js.Object {
  @js.native
  sealed trait EventType extends js.Object
  
  @js.native
  object EventType extends js.Object {
    @js.native
    sealed trait BLUR extends EventType
    
    @js.native
    sealed trait CHANGE extends EventType
    
    @js.native
    sealed trait CLEAR extends EventType
    
    @js.native
    sealed trait CLICK extends EventType
    
    @js.native
    sealed trait CONTEXTMENU extends EventType
    
    @js.native
    sealed trait DBLCLICK extends EventType
    
    @js.native
    sealed trait DRAGENTER extends EventType
    
    @js.native
    sealed trait DRAGOVER extends EventType
    
    @js.native
    sealed trait DROP extends EventType
    
    @js.native
    sealed trait ERROR extends EventType
    
    @js.native
    sealed trait FOCUS extends EventType
    
    @js.native
    sealed trait KEYDOWN extends EventType
    
    @js.native
    sealed trait KEYPRESS extends EventType
    
    @js.native
    sealed trait LOAD extends EventType
    
    @js.native
    sealed trait RESIZE extends EventType
    
    @js.native
    sealed trait WHEEL extends EventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "blur" */ val BLUR: typingsSlinky.ol.eventTypeMod.EventType.BLUR with String = js.native
    /* "change" */ val CHANGE: typingsSlinky.ol.eventTypeMod.EventType.CHANGE with String = js.native
    /* "clear" */ val CLEAR: typingsSlinky.ol.eventTypeMod.EventType.CLEAR with String = js.native
    /* "click" */ val CLICK: typingsSlinky.ol.eventTypeMod.EventType.CLICK with String = js.native
    /* "contextmenu" */ val CONTEXTMENU: typingsSlinky.ol.eventTypeMod.EventType.CONTEXTMENU with String = js.native
    /* "dblclick" */ val DBLCLICK: typingsSlinky.ol.eventTypeMod.EventType.DBLCLICK with String = js.native
    /* "dragenter" */ val DRAGENTER: typingsSlinky.ol.eventTypeMod.EventType.DRAGENTER with String = js.native
    /* "dragover" */ val DRAGOVER: typingsSlinky.ol.eventTypeMod.EventType.DRAGOVER with String = js.native
    /* "drop" */ val DROP: typingsSlinky.ol.eventTypeMod.EventType.DROP with String = js.native
    /* "error" */ val ERROR: typingsSlinky.ol.eventTypeMod.EventType.ERROR with String = js.native
    /* "focus" */ val FOCUS: typingsSlinky.ol.eventTypeMod.EventType.FOCUS with String = js.native
    /* "keydown" */ val KEYDOWN: typingsSlinky.ol.eventTypeMod.EventType.KEYDOWN with String = js.native
    /* "keypress" */ val KEYPRESS: typingsSlinky.ol.eventTypeMod.EventType.KEYPRESS with String = js.native
    /* "load" */ val LOAD: typingsSlinky.ol.eventTypeMod.EventType.LOAD with String = js.native
    /* "resize" */ val RESIZE: typingsSlinky.ol.eventTypeMod.EventType.RESIZE with String = js.native
    /* "wheel" */ val WHEEL: typingsSlinky.ol.eventTypeMod.EventType.WHEEL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
  }
  
}

