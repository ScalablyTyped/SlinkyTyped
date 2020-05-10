package typingsSlinky.reactAsync.components

import typingsSlinky.reactAsync.AnonPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Resolved {
  @JSImport("react-async", "default.Resolved")
  @js.native
  object component extends js.Object
  
  def withProps[T](p: AnonPersist[T]): SharedBuilder_AnonPersist_214611622[T] = new SharedBuilder_AnonPersist_214611622[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: Resolved.type): SharedBuilder_AnonPersist_214611622[T] = new SharedBuilder_AnonPersist_214611622[T](js.Array(this.component, js.Dictionary.empty))()
}

