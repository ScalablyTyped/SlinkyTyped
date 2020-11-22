package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "lstat")
@js.native
object lstat extends js.Object {
  
  def apply(path: PathLike): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    path: PathLike,
    callback: js.Function2[
      (/* err */ ErrnoException) | Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      _ | Unit
    ]
  ): Unit = js.native
}
