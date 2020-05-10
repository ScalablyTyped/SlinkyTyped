package typingsSlinky.babylonjs

import org.scalajs.dom.raw.WebGLBuffer
import typingsSlinky.babylonjs.dataBufferMod.DataBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/WebGL/webGLDataBuffer", JSImport.Namespace)
@js.native
object webGLDataBufferMod extends js.Object {
  @js.native
  class WebGLDataBuffer protected () extends DataBuffer {
    def this(resource: WebGLBuffer) = this()
    var _buffer: js.Any = js.native
  }
  
}

