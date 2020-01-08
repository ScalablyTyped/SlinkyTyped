package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/EventType", JSImport.Namespace)
@js.native
object renderEventTypeMod extends js.Object {
  @js.native
  sealed trait EventType extends js.Object
  
  @js.native
  object EventType extends js.Object {
    @js.native
    sealed trait POSTCOMPOSE extends EventType
    
    @js.native
    sealed trait PRECOMPOSE extends EventType
    
    @js.native
    sealed trait RENDER extends EventType
    
    @js.native
    sealed trait RENDERCOMPLETE extends EventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "postcompose" */ val POSTCOMPOSE: typingsSlinky.ol.renderEventTypeMod.EventType.POSTCOMPOSE with String = js.native
    /* "precompose" */ val PRECOMPOSE: typingsSlinky.ol.renderEventTypeMod.EventType.PRECOMPOSE with String = js.native
    /* "render" */ val RENDER: typingsSlinky.ol.renderEventTypeMod.EventType.RENDER with String = js.native
    /* "rendercomplete" */ val RENDERCOMPLETE: typingsSlinky.ol.renderEventTypeMod.EventType.RENDERCOMPLETE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventType with String] = js.native
  }
  
}

