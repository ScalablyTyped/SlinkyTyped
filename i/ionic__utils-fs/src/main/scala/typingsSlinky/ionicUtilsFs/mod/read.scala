package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.fsExtra.mod.ReadResult
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "read")
@js.native
object read extends js.Object {
  
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): js.Promise[ReadResult] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[ReadResult] = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
}
