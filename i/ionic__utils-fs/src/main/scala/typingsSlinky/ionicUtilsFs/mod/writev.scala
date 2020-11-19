package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.fsExtra.mod.WritevResult
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "writev")
@js.native
object writev extends js.Object {
  
  def apply(fd: Double, buffers: js.Array[ArrayBufferView]): js.Promise[WritevResult] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WritevResult] = js.native
  def apply(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
}
