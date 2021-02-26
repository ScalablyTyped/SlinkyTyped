package typingsSlinky.imageQ

import typingsSlinky.imageQ.pointContainerMod.PointContainer
import typingsSlinky.imageQ.utilsPaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @js.native
  trait IImageDitherer extends StObject {
    
    def quantize(pointBuffer: PointContainer, palette: Palette): PointContainer = js.native
  }
  object IImageDitherer {
    
    @scala.inline
    def apply(quantize: (PointContainer, Palette) => PointContainer): IImageDitherer = {
      val __obj = js.Dynamic.literal(quantize = js.Any.fromFunction2(quantize))
      __obj.asInstanceOf[IImageDitherer]
    }
    
    @scala.inline
    implicit class IImageDithererMutableBuilder[Self <: IImageDitherer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuantize(value: (PointContainer, Palette) => PointContainer): Self = StObject.set(x, "quantize", js.Any.fromFunction2(value))
    }
  }
}
