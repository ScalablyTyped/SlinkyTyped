package typingsSlinky.libp2pNoise

import typingsSlinky.bl.mod.^
import typingsSlinky.buffer.mod.Buffer
import typingsSlinky.libp2pNoise.anon.PartialDecoderOptions
import typingsSlinky.libp2pNoise.anon.PartiallengthEncoderLengt
import typingsSlinky.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-length-prefixed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val decode: Decoder = js.native
  
  val encode: Encoder = js.native
  
  @js.native
  trait Decoder extends js.Object {
    
    def apply(): AsyncGenerator[^, ^, _] = js.native
    def apply(options: PartialDecoderOptions): AsyncGenerator[^, ^, _] = js.native
    
    var MAX_DATA_LENGTH: Double = js.native
    
    var MAX_LENGTH_LENGTH: Double = js.native
    
    def fromReader(reader: js.Any): ^ = js.native
    def fromReader(reader: js.Any, options: PartialDecoderOptions): ^ = js.native
  }
  
  @js.native
  trait DecoderOptions extends js.Object {
    
    def lengthDecoder(data: ^): Double = js.native
    def lengthDecoder(data: Buffer): Double = js.native
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction = js.native
    
    var maxDataLength: Double = js.native
    
    var maxLengthLength: Double = js.native
  }
  
  @js.native
  trait Encoder extends js.Object {
    
    def apply(): AsyncGenerator[^, Buffer, _] = js.native
    def apply(options: PartiallengthEncoderLengt): AsyncGenerator[^, Buffer, _] = js.native
    
    var DEFAULT_POOL_SIZE: Double = js.native
    
    var MIN_POOL_SIZE: Double = js.native
    
    def single(chunk: Buffer): ^ = js.native
    def single(chunk: Buffer, options: PartiallengthEncoderLengt): ^ = js.native
  }
  
  @js.native
  trait LengthDecoderFunction extends js.Object {
    
    def apply(data: ^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends js.Object {
    
    def apply(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    
    var bytes: Double = js.native
  }
}
