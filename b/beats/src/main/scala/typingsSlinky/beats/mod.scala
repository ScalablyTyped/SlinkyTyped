package typingsSlinky.beats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("beats", JSImport.Namespace)
  @js.native
  def apply(bins: js.Array[Bin]): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = js.native
  @JSImport("beats", JSImport.Namespace)
  @js.native
  def apply(bins: js.Array[Bin], minSeparation: Double): js.Function2[
    /* frequencies */ js.typedarray.Uint8Array | js.typedarray.Float32Array | js.Array[Double], 
    /* dt */ js.UndefOr[Double], 
    js.typedarray.Float32Array
  ] = js.native
  
  @js.native
  trait Bin extends StObject {
    
    var decay: Double = js.native
    
    var hi: Double = js.native
    
    var lo: Double = js.native
    
    var threshold: Double = js.native
  }
  object Bin {
    
    @scala.inline
    def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
      val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHi(value: Double): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLo(value: Double): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
}
