package typingsSlinky.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.popperjsCore.anon.Reference
import typingsSlinky.popperjsCore.enumsMod.Placement
import typingsSlinky.popperjsCore.popperjsCoreStrings.offset
import typingsSlinky.popperjsCore.typesMod.Modifier
import typingsSlinky.popperjsCore.typesMod.Offsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/offset", JSImport.Default)
  @js.native
  val default: Modifier[offset, Options] = js.native
  
  @JSImport("@popperjs/core/lib/modifiers/offset", "distanceAndSkiddingToXY")
  @js.native
  def distanceAndSkiddingToXY(placement: Placement, rects: Reference, offset: Offset): Offsets = js.native
  
  type Offset = OffsetsFunction | (js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]])
  
  type OffsetModifier = Modifier[offset, Options]
  
  type OffsetsFunction = js.Function1[
    /* arg0 */ typingsSlinky.popperjsCore.anon.Placement, 
    js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
  ]
  
  @js.native
  trait Options extends StObject {
    
    var offset: Offset = js.native
  }
  object Options {
    
    @scala.inline
    def apply(offset: Offset): Options = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction1(
        value: /* arg0 */ typingsSlinky.popperjsCore.anon.Placement => js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
      ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Modifier[offset, Options]
  
  /* This means you don't have to write `default`, but can instead just say `offsetMod.foo` */
  override def _to: Modifier[offset, Options] = default
}
