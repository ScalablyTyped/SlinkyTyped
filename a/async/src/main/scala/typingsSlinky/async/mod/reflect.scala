package typingsSlinky.async.mod

import typingsSlinky.async.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "reflect")
@js.native
object reflect extends js.Object {
  
  def apply[T, E](fn: AsyncFunction[T, E]): js.Function1[/* callback */ js.Function2[/* err */ Null, /* result */ Error[E, T], Unit], Unit] = js.native
}
