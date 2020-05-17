package typingsSlinky.reactAsync.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AsyncPending {
  @JSImport("react-async", "Async.Pending")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: typingsSlinky.reactAsync.anon.Initial[T]): SharedBuilder_Initial1771268107[T] = new SharedBuilder_Initial1771268107[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: AsyncPending.type): SharedBuilder_Initial1771268107[T] = new SharedBuilder_Initial1771268107[T](js.Array(this.component, js.Dictionary.empty))()
}

