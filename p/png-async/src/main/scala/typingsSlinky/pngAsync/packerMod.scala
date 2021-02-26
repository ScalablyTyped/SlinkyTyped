package typingsSlinky.pngAsync

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("png-async/lib/packer", JSImport.Namespace)
  @js.native
  class ^ protected () extends Packer {
    def this(option: IImageOptions) = this()
  }
  
  @js.native
  trait Packer extends Readable {
    
    var _option: js.Any = js.native
    
    var _packChunk: js.Any = js.native
    
    var _packIDAT: js.Any = js.native
    
    var _packIEND: js.Any = js.native
    
    var _packIHDR: js.Any = js.native
    
    def _read(): Unit = js.native
    
    def pack(data: Buffer, width: Double, height: Double): Unit = js.native
  }
}
