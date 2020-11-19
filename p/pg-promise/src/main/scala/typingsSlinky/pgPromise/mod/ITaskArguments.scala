package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.anon.CndMode
import typingsSlinky.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskArguments[T] extends IArguments {
  
  def cb(): js.Any = js.native
  
  var options: CndMode with T = js.native
}
