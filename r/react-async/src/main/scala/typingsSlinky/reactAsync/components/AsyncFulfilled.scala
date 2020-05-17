package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AsyncFulfilled {
  @JSImport("react-async", "Async.Fulfilled")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: Persist[T]): SharedBuilder_Persist_1362630938[T] = new SharedBuilder_Persist_1362630938[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: AsyncFulfilled.type): SharedBuilder_Persist_1362630938[T] = new SharedBuilder_Persist_1362630938[T](js.Array(this.component, js.Dictionary.empty))()
}

