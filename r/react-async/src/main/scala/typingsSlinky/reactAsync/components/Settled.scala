package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.ChildrenSettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Settled {
  @JSImport("react-async", "default.Settled")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: ChildrenSettledChildren[T]): SharedBuilder_ChildrenSettledChildren1671893832[T] = new SharedBuilder_ChildrenSettledChildren1671893832[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Settled.type): SharedBuilder_ChildrenSettledChildren1671893832[T] = new SharedBuilder_ChildrenSettledChildren1671893832[T](js.Array(this.component, js.Dictionary.empty))()
}

