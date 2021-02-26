package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBuilderMod {
  
  @JSImport("ol/render/canvas/TextBuilder", JSImport.Default)
  @js.native
  class default protected () extends CanvasTextBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  sealed trait TEXT_ALIGN extends StObject
  @JSImport("ol/render/canvas/TextBuilder", "TEXT_ALIGN")
  @js.native
  object TEXT_ALIGN extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_ALIGN with Double] = js.native
    
    @js.native
    sealed trait alphabetic extends TEXT_ALIGN
    /* 0.8 */ val alphabetic: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.alphabetic with Double = js.native
    
    @js.native
    sealed trait bottom extends TEXT_ALIGN
    /* 1 */ val bottom: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.bottom with Double = js.native
    
    @js.native
    sealed trait center extends TEXT_ALIGN
    /* 0.5 */ val center: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.center with Double = js.native
    
    @js.native
    sealed trait end extends TEXT_ALIGN
    /* 0 */ val end: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.end with Double = js.native
    
    @js.native
    sealed trait hanging extends TEXT_ALIGN
    /* 0.2 */ val hanging: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.hanging with Double = js.native
    
    @js.native
    sealed trait ideographic extends TEXT_ALIGN
    /* 0.8 */ val ideographic: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.ideographic with Double = js.native
    
    @js.native
    sealed trait left extends TEXT_ALIGN
    /* 0 */ val left: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.left with Double = js.native
    
    @js.native
    sealed trait middle extends TEXT_ALIGN
    /* 0.5 */ val middle: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.middle with Double = js.native
    
    @js.native
    sealed trait right extends TEXT_ALIGN
    /* 1 */ val right: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.right with Double = js.native
    
    @js.native
    sealed trait start extends TEXT_ALIGN
    /* 1 */ val start: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.start with Double = js.native
    
    @js.native
    sealed trait top extends TEXT_ALIGN
    /* 0 */ val top: typingsSlinky.ol.textBuilderMod.TEXT_ALIGN.top with Double = js.native
  }
  
  @js.native
  trait CanvasTextBuilder
    extends typingsSlinky.ol.builderMod.default
}
