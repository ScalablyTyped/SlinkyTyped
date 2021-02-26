package typingsSlinky.iltorb

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iltorb", "compress")
  @js.native
  def compress(buffer: Buffer): js.Promise[Buffer] = js.native
  @JSImport("iltorb", "compress")
  @js.native
  def compress(buffer: Buffer, callback: IltorbCallback): Unit = js.native
  @JSImport("iltorb", "compress")
  @js.native
  def compress(buffer: Buffer, options: BrotliEncodeParams): js.Promise[Buffer] = js.native
  @JSImport("iltorb", "compress")
  @js.native
  def compress(buffer: Buffer, options: BrotliEncodeParams, callback: IltorbCallback): Unit = js.native
  
  @JSImport("iltorb", "compressStream")
  @js.native
  def compressStream(): Transform with BrotliFlushable = js.native
  @JSImport("iltorb", "compressStream")
  @js.native
  def compressStream(options: BrotliEncodeParams): Transform with BrotliFlushable = js.native
  
  @JSImport("iltorb", "compressSync")
  @js.native
  def compressSync(buffer: Buffer): Buffer = js.native
  @JSImport("iltorb", "compressSync")
  @js.native
  def compressSync(buffer: Buffer, options: BrotliEncodeParams): Buffer = js.native
  
  @JSImport("iltorb", "decompress")
  @js.native
  def decompress(buffer: Buffer): js.Promise[Buffer] = js.native
  @JSImport("iltorb", "decompress")
  @js.native
  def decompress(buffer: Buffer, callback: IltorbCallback): Unit = js.native
  
  @JSImport("iltorb", "decompressStream")
  @js.native
  def decompressStream(): Transform = js.native
  
  @JSImport("iltorb", "decompressSync")
  @js.native
  def decompressSync(buffer: Buffer): Buffer = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iltorb.iltorbNumbers.`0`
    - typingsSlinky.iltorb.iltorbNumbers.`1`
    - typingsSlinky.iltorb.iltorbNumbers.`2`
    - typingsSlinky.iltorb.iltorbNumbers.`3`
    - typingsSlinky.iltorb.iltorbNumbers.`4`
    - typingsSlinky.iltorb.iltorbNumbers.`5`
    - typingsSlinky.iltorb.iltorbNumbers.`6`
    - typingsSlinky.iltorb.iltorbNumbers.`7`
    - typingsSlinky.iltorb.iltorbNumbers.`8`
    - typingsSlinky.iltorb.iltorbNumbers.`9`
    - typingsSlinky.iltorb.iltorbNumbers.`10`
    - typingsSlinky.iltorb.iltorbNumbers.`11`
  */
  trait BrotliCompressionQuality extends StObject
  object BrotliCompressionQuality {
    
    @scala.inline
    def `0`: typingsSlinky.iltorb.iltorbNumbers.`0` = 0.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.iltorb.iltorbNumbers.`1` = 1.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`1`]
    
    @scala.inline
    def `10`: typingsSlinky.iltorb.iltorbNumbers.`10` = 10.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`10`]
    
    @scala.inline
    def `11`: typingsSlinky.iltorb.iltorbNumbers.`11` = 11.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`11`]
    
    @scala.inline
    def `2`: typingsSlinky.iltorb.iltorbNumbers.`2` = 2.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.iltorb.iltorbNumbers.`3` = 3.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.iltorb.iltorbNumbers.`4` = 4.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`4`]
    
    @scala.inline
    def `5`: typingsSlinky.iltorb.iltorbNumbers.`5` = 5.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`5`]
    
    @scala.inline
    def `6`: typingsSlinky.iltorb.iltorbNumbers.`6` = 6.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`6`]
    
    @scala.inline
    def `7`: typingsSlinky.iltorb.iltorbNumbers.`7` = 7.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`7`]
    
    @scala.inline
    def `8`: typingsSlinky.iltorb.iltorbNumbers.`8` = 8.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`8`]
    
    @scala.inline
    def `9`: typingsSlinky.iltorb.iltorbNumbers.`9` = 9.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`9`]
  }
  
  @js.native
  trait BrotliEncodeParams extends StObject {
    
    var disable_literal_context_modeling: js.UndefOr[Boolean] = js.native
    
    var lgblock: js.UndefOr[Double] = js.native
    
    var lgwin: js.UndefOr[Double] = js.native
    
    /** @default 0 */
    var mode: js.UndefOr[BrotliMode] = js.native
    
    /** @default 11 */
    var quality: js.UndefOr[BrotliCompressionQuality] = js.native
    
    var size_hint: js.UndefOr[Double] = js.native
  }
  object BrotliEncodeParams {
    
    @scala.inline
    def apply(): BrotliEncodeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrotliEncodeParams]
    }
    
    @scala.inline
    implicit class BrotliEncodeParamsMutableBuilder[Self <: BrotliEncodeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable_literal_context_modeling(value: Boolean): Self = StObject.set(x, "disable_literal_context_modeling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_literal_context_modelingUndefined: Self = StObject.set(x, "disable_literal_context_modeling", js.undefined)
      
      @scala.inline
      def setLgblock(value: Double): Self = StObject.set(x, "lgblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgblockUndefined: Self = StObject.set(x, "lgblock", js.undefined)
      
      @scala.inline
      def setLgwin(value: Double): Self = StObject.set(x, "lgwin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgwinUndefined: Self = StObject.set(x, "lgwin", js.undefined)
      
      @scala.inline
      def setMode(value: BrotliMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setQuality(value: BrotliCompressionQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize_hint(value: Double): Self = StObject.set(x, "size_hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize_hintUndefined: Self = StObject.set(x, "size_hint", js.undefined)
    }
  }
  
  @js.native
  trait BrotliFlushable extends StObject {
    
    def flush(): Unit = js.native
  }
  object BrotliFlushable {
    
    @scala.inline
    def apply(flush: () => Unit): BrotliFlushable = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[BrotliFlushable]
    }
    
    @scala.inline
    implicit class BrotliFlushableMutableBuilder[Self <: BrotliFlushable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.iltorb.iltorbNumbers.`0`
    - typingsSlinky.iltorb.iltorbNumbers.`1`
    - typingsSlinky.iltorb.iltorbNumbers.`2`
  */
  trait BrotliMode extends StObject
  object BrotliMode {
    
    @scala.inline
    def `0`: typingsSlinky.iltorb.iltorbNumbers.`0` = 0.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.iltorb.iltorbNumbers.`1` = 1.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.iltorb.iltorbNumbers.`2` = 2.asInstanceOf[typingsSlinky.iltorb.iltorbNumbers.`2`]
  }
  
  type IltorbCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* output */ Buffer, Unit]
}
