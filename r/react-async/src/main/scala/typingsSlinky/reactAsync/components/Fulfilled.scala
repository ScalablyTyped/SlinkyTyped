package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fulfilled {
  @JSImport("react-async", "default.Fulfilled")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: Persist[T]): SharedBuilder_Persist_1362630938[T] = new SharedBuilder_Persist_1362630938[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_Persist_1362630938[T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Persist_1362630938[T](js.Array(this.component, __props.asInstanceOf[Persist[T]]))
  }
  implicit def make[T](companion: Fulfilled.type): SharedBuilder_Persist_1362630938[T] = new SharedBuilder_Persist_1362630938[T](js.Array(this.component, js.Dictionary.empty))()
}

