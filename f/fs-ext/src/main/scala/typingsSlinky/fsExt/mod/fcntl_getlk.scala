package typingsSlinky.fsExt.mod

import typingsSlinky.fsExt.fsExtStrings.getlk
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "fcntl")
@js.native
object fcntl_getlk extends js.Object {
  def apply(
    fd: Double,
    cmd: getlk,
    arg: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    cmd: getlk,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = js.native
}

