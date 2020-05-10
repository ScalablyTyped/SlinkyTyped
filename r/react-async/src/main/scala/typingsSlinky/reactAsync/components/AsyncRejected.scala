package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonChildrenPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AsyncRejected {
  @JSImport("react-async", "Async.Rejected")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonChildrenPersist[T]): SharedBuilder_AnonChildrenPersist_425814917[T] = new SharedBuilder_AnonChildrenPersist_425814917[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: AsyncRejected.type): SharedBuilder_AnonChildrenPersist_425814917[T] = new SharedBuilder_AnonChildrenPersist_425814917[T](js.Array(this.component, js.Dictionary.empty))()
}

