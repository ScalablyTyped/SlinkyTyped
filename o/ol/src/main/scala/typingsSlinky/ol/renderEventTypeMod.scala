package typingsSlinky.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderEventTypeMod {
  
  @JSImport("ol/render/EventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
    
    /* "postcompose" */ val POSTCOMPOSE: typingsSlinky.ol.renderEventTypeMod.EventType.POSTCOMPOSE with String = js.native
    
    /* "postrender" */ val POSTRENDER: typingsSlinky.ol.renderEventTypeMod.EventType.POSTRENDER with String = js.native
    
    /* "precompose" */ val PRECOMPOSE: typingsSlinky.ol.renderEventTypeMod.EventType.PRECOMPOSE with String = js.native
    
    /* "prerender" */ val PRERENDER: typingsSlinky.ol.renderEventTypeMod.EventType.PRERENDER with String = js.native
    
    /* "rendercomplete" */ val RENDERCOMPLETE: typingsSlinky.ol.renderEventTypeMod.EventType.RENDERCOMPLETE with String = js.native
  }
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("ol/render/EventType", "EventType")
  @js.native
  object EventType extends StObject {
    
    @js.native
    sealed trait POSTCOMPOSE extends EventType
    
    @js.native
    sealed trait POSTRENDER extends EventType
    
    @js.native
    sealed trait PRECOMPOSE extends EventType
    
    @js.native
    sealed trait PRERENDER extends EventType
    
    @js.native
    sealed trait RENDERCOMPLETE extends EventType
  }
}
