package typingsSlinky.itPbRpc

import typingsSlinky.bl.mod.^
import typingsSlinky.buffer.mod.Buffer
import typingsSlinky.itPbRpc.anon.Decode
import typingsSlinky.itPbRpc.anon.DecodeEncode
import typingsSlinky.itPbRpc.anon.Encode
import typingsSlinky.itPbRpc.anon.PartialOpts
import typingsSlinky.itPbRpc.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("it-pb-rpc", JSImport.Namespace)
  @js.native
  def apply(duplex: js.Any): WrappedDuplex = js.native
  @JSImport("it-pb-rpc", JSImport.Namespace)
  @js.native
  def apply(duplex: js.Any, opts: PartialOpts): WrappedDuplex = js.native
  
  @js.native
  trait LengthDecoderFunction extends StObject {
    
    def apply(data: ^): Double = js.native
    def apply(data: Buffer): Double = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait LengthEncoderFunction extends StObject {
    
    def apply(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    
    var bytes: Double = js.native
  }
  
  @js.native
  trait Opts extends StObject {
    
    def lengthDecoder(data: ^): Double = js.native
    //decoding opts
    def lengthDecoder(data: Buffer): Double = js.native
    //decoding opts
    @JSName("lengthDecoder")
    var lengthDecoder_Original: LengthDecoderFunction = js.native
    
    def lengthEncoder(value: Double, target: Buffer, offset: Double): Double | Buffer = js.native
    @JSName("lengthEncoder")
    var lengthEncoder_Original: LengthEncoderFunction = js.native
    
    var maxDataLength: Double = js.native
    
    var maxLengthLength: Double = js.native
    
    var minPoolSize: Double = js.native
    
    //encoding opts
    var poolSize: Double = js.native
  }
  
  @js.native
  trait WrappedDuplex extends StObject {
    
    def pb[Return](proto: DecodeEncode[Return]): Read[Return] = js.native
    
    def read(): js.Promise[^] = js.native
    def read(bytes: Double): js.Promise[^] = js.native
    
    def readLP(): js.Promise[^] = js.native
    
    def readPB[T](proto: Decode[T]): js.Promise[T] = js.native
    
    //return vanilla duplex
    def unwrap(): js.Any = js.native
    
    def write(input: ^): Unit = js.native
    
    def writeLP(input: ^): Unit = js.native
    def writeLP(input: Buffer): Unit = js.native
    
    def writePB(data: ^, proto: Encode): Unit = js.native
    def writePB(data: Buffer, proto: Encode): Unit = js.native
  }
}
