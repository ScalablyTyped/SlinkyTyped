package typingsSlinky.fsExtra.mod

import typingsSlinky.fsExtra.anon.Encoding
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "appendFile")
@js.native
object appendFile extends js.Object {
  
  def apply(file: String, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: String, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: String,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Double, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Double, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: Double,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(file: Buffer, data: js.Any): js.Promise[Unit] = js.native
  def apply(file: Buffer, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(file: Buffer, data: js.Any, options: Encoding): js.Promise[Unit] = js.native
  def apply(
    file: Buffer,
    data: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}
