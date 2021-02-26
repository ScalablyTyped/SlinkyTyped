package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayPositioningMod {
  
  @JSImport("ol/OverlayPositioning", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverlayPositioning with String] = js.native
    
    /* "bottom-center" */ val BOTTOM_CENTER: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_CENTER with String = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_LEFT with String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.BOTTOM_RIGHT with String = js.native
    
    /* "center-center" */ val CENTER_CENTER: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.CENTER_CENTER with String = js.native
    
    /* "center-left" */ val CENTER_LEFT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.CENTER_LEFT with String = js.native
    
    /* "center-right" */ val CENTER_RIGHT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.CENTER_RIGHT with String = js.native
    
    /* "top-center" */ val TOP_CENTER: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.TOP_CENTER with String = js.native
    
    /* "top-left" */ val TOP_LEFT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.TOP_LEFT with String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typingsSlinky.ol.overlayPositioningMod.OverlayPositioning.TOP_RIGHT with String = js.native
  }
  
  @js.native
  sealed trait OverlayPositioning extends StObject
  @JSImport("ol/OverlayPositioning", "OverlayPositioning")
  @js.native
  object OverlayPositioning extends StObject {
    
    @js.native
    sealed trait BOTTOM_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait BOTTOM_RIGHT extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait CENTER_RIGHT extends OverlayPositioning
    
    @js.native
    sealed trait TOP_CENTER extends OverlayPositioning
    
    @js.native
    sealed trait TOP_LEFT extends OverlayPositioning
    
    @js.native
    sealed trait TOP_RIGHT extends OverlayPositioning
  }
}
