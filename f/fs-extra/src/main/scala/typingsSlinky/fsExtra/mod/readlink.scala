package typingsSlinky.fsExtra.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "readlink")
@js.native
object readlink extends js.Object {
  def apply(path: String): js.Promise[String] = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def apply(path: Buffer): js.Promise[String] = js.native
  def apply(path: Buffer, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
}

