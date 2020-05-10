package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException, /* stats */ typingsSlinky.node.fsMod.Stats, _]
  ): Unit = js.native
}

