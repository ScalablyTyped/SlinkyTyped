package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "link")
@js.native
object link extends js.Object {
  
  def apply(srcpath: String, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: String, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: String, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: Buffer, dstpath: String): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(srcpath: Buffer, dstpath: Buffer): js.Promise[Unit] = js.native
  def apply(srcpath: Buffer, dstpath: Buffer, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
}
