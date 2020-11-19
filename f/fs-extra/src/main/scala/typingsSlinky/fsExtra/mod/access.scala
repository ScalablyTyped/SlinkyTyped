package typingsSlinky.fsExtra.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-extra", "access")
@js.native
object access extends js.Object {
  
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: String, mode: Double): js.Promise[Unit] = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer): js.Promise[Unit] = js.native
  def apply(path: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(path: Buffer, mode: Double): js.Promise[Unit] = js.native
  def apply(path: Buffer, mode: Double, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
