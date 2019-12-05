package typingsSlinky.ol

import typingsSlinky.ol.renderReplayMod.TEXT_ALIGN
import typingsSlinky.ol.renderReplayTypeMod.ReplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/replay", JSImport.Namespace)
@js.native
object renderReplayMod extends js.Object {
  @js.native
  sealed trait TEXT_ALIGN extends js.Object
  
  val ORDER: js.Array[ReplayType] = js.native
  @js.native
  object TEXT_ALIGN extends js.Object {
    @js.native
    sealed trait alphabetic extends TEXT_ALIGN
    
    @js.native
    sealed trait bottom extends TEXT_ALIGN
    
    @js.native
    sealed trait center extends TEXT_ALIGN
    
    @js.native
    sealed trait end extends TEXT_ALIGN
    
    @js.native
    sealed trait hanging extends TEXT_ALIGN
    
    @js.native
    sealed trait ideographic extends TEXT_ALIGN
    
    @js.native
    sealed trait left extends TEXT_ALIGN
    
    @js.native
    sealed trait middle extends TEXT_ALIGN
    
    @js.native
    sealed trait right extends TEXT_ALIGN
    
    @js.native
    sealed trait start extends TEXT_ALIGN
    
    @js.native
    sealed trait top extends TEXT_ALIGN
    
    /* 0.8 */ val alphabetic: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.alphabetic with Double = js.native
    /* 1 */ val bottom: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.bottom with Double = js.native
    /* 0.5 */ val center: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.center with Double = js.native
    /* 0 */ val end: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.end with Double = js.native
    /* 0.2 */ val hanging: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.hanging with Double = js.native
    /* 0.8 */ val ideographic: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.ideographic with Double = js.native
    /* 0 */ val left: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.left with Double = js.native
    /* 0.5 */ val middle: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.middle with Double = js.native
    /* 1 */ val right: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.right with Double = js.native
    /* 1 */ val start: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.start with Double = js.native
    /* 0 */ val top: typingsSlinky.ol.renderReplayMod.TEXT_ALIGN.top with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_ALIGN with Double] = js.native
  }
  
}

