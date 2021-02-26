package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventTypeMod {
  
  @JSImport("ol/MapBrowserEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapBrowserEventType with String] = js.native
    
    /* "click" */ val CLICK: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.CLICK with String = js.native
    
    /* "dblclick" */ val DBLCLICK: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.DBLCLICK with String = js.native
    
    /* "pointercancel" */ val POINTERCANCEL: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERCANCEL with String = js.native
    
    /* "pointerdown" */ val POINTERDOWN: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDOWN with String = js.native
    
    /* "pointerdrag" */ val POINTERDRAG: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERDRAG with String = js.native
    
    /* "pointerenter" */ val POINTERENTER: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERENTER with String = js.native
    
    /* "pointerleave" */ val POINTERLEAVE: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERLEAVE with String = js.native
    
    /* "pointermove" */ val POINTERMOVE: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERMOVE with String = js.native
    
    /* "pointerout" */ val POINTEROUT: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROUT with String = js.native
    
    /* "pointerover" */ val POINTEROVER: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTEROVER with String = js.native
    
    /* "pointerup" */ val POINTERUP: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.POINTERUP with String = js.native
    
    /* "singleclick" */ val SINGLECLICK: typingsSlinky.ol.mapBrowserEventTypeMod.MapBrowserEventType.SINGLECLICK with String = js.native
  }
  
  @js.native
  sealed trait MapBrowserEventType extends StObject
  @JSImport("ol/MapBrowserEventType", "MapBrowserEventType")
  @js.native
  object MapBrowserEventType extends StObject {
    
    @js.native
    sealed trait CLICK extends MapBrowserEventType
    
    @js.native
    sealed trait DBLCLICK extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERCANCEL extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERDOWN extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERDRAG extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERENTER extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERLEAVE extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERMOVE extends MapBrowserEventType
    
    @js.native
    sealed trait POINTEROUT extends MapBrowserEventType
    
    @js.native
    sealed trait POINTEROVER extends MapBrowserEventType
    
    @js.native
    sealed trait POINTERUP extends MapBrowserEventType
    
    @js.native
    sealed trait SINGLECLICK extends MapBrowserEventType
  }
}
