package typingsSlinky.ionicUtilsFs.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "opendir")
@js.native
object opendir extends js.Object {
  
  def apply(path: String): js.Promise[typingsSlinky.node.fsMod.Dir] = js.native
  def apply(
    path: String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsSlinky.node.fsMod.Dir, Unit]
  ): Unit = js.native
  def apply(path: String, options: OpenDirOptions): js.Promise[typingsSlinky.node.fsMod.Dir] = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsSlinky.node.fsMod.Dir, Unit]
  ): Unit = js.native
}
