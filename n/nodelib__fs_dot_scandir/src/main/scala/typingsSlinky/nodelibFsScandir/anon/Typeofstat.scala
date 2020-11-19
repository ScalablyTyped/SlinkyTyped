package typingsSlinky.nodelibFsScandir.anon

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstat extends js.Object {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
}
