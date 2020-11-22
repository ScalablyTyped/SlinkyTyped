package typingsSlinky.brotli

import typingsSlinky.brotli.compressMod.CompressOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("brotli", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object compress extends js.Object {
    
    def apply(buffer: Buffer): js.typedarray.Uint8Array = js.native
    def apply(buffer: Buffer, options: CompressOptions): js.typedarray.Uint8Array = js.native
  }
  
  @js.native
  object decompress extends js.Object {
    
    def apply(buffer: Buffer): js.typedarray.Uint8Array = js.native
    def apply(buffer: Buffer, outputSize: Double): js.typedarray.Uint8Array = js.native
  }
}
