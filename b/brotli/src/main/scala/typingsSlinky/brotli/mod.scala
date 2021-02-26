package typingsSlinky.brotli

import typingsSlinky.brotli.compressMod.CompressOptions
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object compress {
    
    @JSImport("brotli", "compress")
    @js.native
    def apply(buffer: Buffer): js.typedarray.Uint8Array = js.native
    @JSImport("brotli", "compress")
    @js.native
    def apply(buffer: Buffer, options: CompressOptions): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("brotli", "decompress")
  @js.native
  def decompress(buffer: Buffer): js.typedarray.Uint8Array = js.native
  @JSImport("brotli", "decompress")
  @js.native
  def decompress(buffer: Buffer, outputSize: Double): js.typedarray.Uint8Array = js.native
}
