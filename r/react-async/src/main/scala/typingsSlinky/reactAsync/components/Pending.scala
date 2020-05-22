package typingsSlinky.reactAsync.components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pending {
  @JSImport("react-async", "default.Pending")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: typingsSlinky.reactAsync.anon.Initial[T]): SharedBuilder_Initial1771268107[T] = new SharedBuilder_Initial1771268107[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_Initial1771268107[T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Initial1771268107[T](js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactAsync.anon.Initial[T]]))
  }
  implicit def make[T](companion: Pending.type): SharedBuilder_Initial1771268107[T] = new SharedBuilder_Initial1771268107[T](js.Array(this.component, js.Dictionary.empty))()
}

