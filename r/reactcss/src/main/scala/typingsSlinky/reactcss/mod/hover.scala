package typingsSlinky.reactcss.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reactcss", "hover")
@js.native
object hover extends js.Object {
  def apply[A](component: ComponentClass[A, ComponentState]): ReactComponentClass[A] = js.native
  def apply[A](component: StatelessComponent[A]): ReactComponentClass[A] = js.native
}

