package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pending {
  @JSImport("react-async", "default.Pending")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonInitial[T]): SharedBuilder_AnonInitial2048159340[T] = new SharedBuilder_AnonInitial2048159340[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Pending.type): SharedBuilder_AnonInitial2048159340[T] = new SharedBuilder_AnonInitial2048159340[T](js.Array(this.component, js.Dictionary.empty))()
}

