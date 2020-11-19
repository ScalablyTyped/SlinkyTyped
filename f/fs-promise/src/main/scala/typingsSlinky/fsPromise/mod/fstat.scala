package typingsSlinky.fsPromise.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-promise", "fstat")
@js.native
object fstat extends js.Object {
  
  def apply(fd: Double): js.Promise[typingsSlinky.node.fsMod.Stats] = js.native
  def apply(
    fd: Double,
    callback: js.Function2[
      (/* err */ ErrnoException) | Null, 
      /* stats */ typingsSlinky.node.fsMod.Stats, 
      _ | Unit
    ]
  ): Unit = js.native
}
