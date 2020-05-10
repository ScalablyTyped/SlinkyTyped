package typingsSlinky.fsExtra.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "stat")
@js.native
object stat extends js.Object {
  def apply(path: String): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: String,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typingsSlinky.node.fsMod.Stats, _]
  ): Unit = js.native
  def apply(path: Buffer): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: Buffer,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typingsSlinky.node.fsMod.Stats, _]
  ): Unit = js.native
}

