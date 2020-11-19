package typingsSlinky.node.fsMod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "stat")
@js.native
object stat extends js.Object {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
}
