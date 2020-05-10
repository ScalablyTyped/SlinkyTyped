package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Initial {
  @JSImport("react-async", "default.Initial")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonChildren[T]): SharedBuilder_AnonChildren1879072467[T] = new SharedBuilder_AnonChildren1879072467[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Initial.type): SharedBuilder_AnonChildren1879072467[T] = new SharedBuilder_AnonChildren1879072467[T](js.Array(this.component, js.Dictionary.empty))()
}

