package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.ChildrenPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AsyncRejected {
  @JSImport("react-async", "Async.Rejected")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: ChildrenPersist[T]): SharedBuilder_ChildrenPersist_12507261[T] = new SharedBuilder_ChildrenPersist_12507261[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: AsyncRejected.type): SharedBuilder_ChildrenPersist_12507261[T] = new SharedBuilder_ChildrenPersist_12507261[T](js.Array(this.component, js.Dictionary.empty))()
}

