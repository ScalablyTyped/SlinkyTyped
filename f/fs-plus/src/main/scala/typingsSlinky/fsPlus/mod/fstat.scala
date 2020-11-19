package typingsSlinky.fsPlus.mod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-plus", "fstat")
@js.native
object fstat extends js.Object {
  
  def apply(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typingsSlinky.node.fsMod.Stats, Unit]
  ): Unit = js.native
}
