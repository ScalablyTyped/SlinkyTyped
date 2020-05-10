package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.mod.AsyncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Async {
  @JSImport("react-async", "Async")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AsyncProps[T]): SharedBuilder_AsyncProps2057177666[typingsSlinky.reactAsync.mod.Async[js.Any], T] = new SharedBuilder_AsyncProps2057177666[typingsSlinky.reactAsync.mod.Async[js.Any], T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Async.type): SharedBuilder_AsyncProps2057177666[typingsSlinky.reactAsync.mod.Async[js.Any], T] = new SharedBuilder_AsyncProps2057177666[typingsSlinky.reactAsync.mod.Async[js.Any], T](js.Array(this.component, js.Dictionary.empty))()
}

