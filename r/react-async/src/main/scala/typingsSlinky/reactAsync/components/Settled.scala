package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonChildrenSettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Settled {
  @JSImport("react-async", "default.Settled")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonChildrenSettledChildren[T]): SharedBuilder_AnonChildrenSettledChildren877315453[T] = new SharedBuilder_AnonChildrenSettledChildren877315453[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Settled.type): SharedBuilder_AnonChildrenSettledChildren877315453[T] = new SharedBuilder_AnonChildrenSettledChildren877315453[T](js.Array(this.component, js.Dictionary.empty))()
}

