package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "lstat")
@js.native
object lstat extends js.Object {
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

