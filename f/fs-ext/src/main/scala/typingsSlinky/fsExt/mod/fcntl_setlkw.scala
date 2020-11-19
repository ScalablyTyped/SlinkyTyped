package typingsSlinky.fsExt.mod

import typingsSlinky.fsExt.fsExtStrings.setlkw
import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-ext", "fcntl")
@js.native
object fcntl_setlkw extends js.Object {
  
  def apply(
    fd: Double,
    cmd: setlkw,
    arg: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    cmd: setlkw,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ Double, Unit]
  ): Unit = js.native
}
