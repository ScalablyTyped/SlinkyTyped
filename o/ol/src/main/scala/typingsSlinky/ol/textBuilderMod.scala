package typingsSlinky.ol

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/render/canvas/TextBuilder", JSImport.Namespace)
@js.native
object textBuilderMod extends js.Object {
  
  @js.native
  sealed trait TEXT_ALIGN extends js.Object
  @js.native
  object TEXT_ALIGN extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TEXT_ALIGN with Double] = js.native
    
    @js.native
    sealed trait alphabetic extends TEXT_ALIGN
    /* 0.8 */ @js.native
    object alphabetic extends TopLevel[alphabetic with Double]
    
    @js.native
    sealed trait bottom extends TEXT_ALIGN
    /* 1 */ @js.native
    object bottom extends TopLevel[bottom with Double]
    
    @js.native
    sealed trait center extends TEXT_ALIGN
    /* 0.5 */ @js.native
    object center extends TopLevel[center with Double]
    
    @js.native
    sealed trait end extends TEXT_ALIGN
    /* 0 */ @js.native
    object end extends TopLevel[end with Double]
    
    @js.native
    sealed trait hanging extends TEXT_ALIGN
    /* 0.2 */ @js.native
    object hanging extends TopLevel[hanging with Double]
    
    @js.native
    sealed trait ideographic extends TEXT_ALIGN
    /* 0.8 */ @js.native
    object ideographic extends TopLevel[ideographic with Double]
    
    @js.native
    sealed trait left extends TEXT_ALIGN
    /* 0 */ @js.native
    object left extends TopLevel[left with Double]
    
    @js.native
    sealed trait middle extends TEXT_ALIGN
    /* 0.5 */ @js.native
    object middle extends TopLevel[middle with Double]
    
    @js.native
    sealed trait right extends TEXT_ALIGN
    /* 1 */ @js.native
    object right extends TopLevel[right with Double]
    
    @js.native
    sealed trait start extends TEXT_ALIGN
    /* 1 */ @js.native
    object start extends TopLevel[start with Double]
    
    @js.native
    sealed trait top extends TEXT_ALIGN
    /* 0 */ @js.native
    object top extends TopLevel[top with Double]
  }
  
  @js.native
  class default protected ()
    extends typingsSlinky.ol.builderMod.default {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  type CanvasTextBuilder = typingsSlinky.ol.builderMod.default
}
