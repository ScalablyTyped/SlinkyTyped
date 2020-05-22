package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.anon.ChildrenPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rejected {
  @JSImport("react-async", "default.Rejected")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: ChildrenPersist[T]): SharedBuilder_ChildrenPersist_12507261[T] = new SharedBuilder_ChildrenPersist_12507261[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](): SharedBuilder_ChildrenPersist_12507261[T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_ChildrenPersist_12507261[T](js.Array(this.component, __props.asInstanceOf[ChildrenPersist[T]]))
  }
  implicit def make[T](companion: Rejected.type): SharedBuilder_ChildrenPersist_12507261[T] = new SharedBuilder_ChildrenPersist_12507261[T](js.Array(this.component, js.Dictionary.empty))()
}

