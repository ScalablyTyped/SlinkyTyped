package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AsyncInitial {
  @JSImport("react-async", "Async.Initial")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: Children[T]): SharedBuilder_Children_1347119625[T] = new SharedBuilder_Children_1347119625[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_Children_1347119625[T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_Children_1347119625[T](js.Array(this.component, __props.asInstanceOf[Children[T]]))
  }
  implicit def make[T](companion: AsyncInitial.type): SharedBuilder_Children_1347119625[T] = new SharedBuilder_Children_1347119625[T](js.Array(this.component, js.Dictionary.empty))()
}

