package typingsSlinky.reactDashColor.reactDashColorMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.reactDashColor.libComponentsCommonColorWrapMod.ExportedColorProps
import typingsSlinky.reactDashColor.libComponentsCommonColorWrapMod.InjectedColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", "CustomPicker")
@js.native
object CustomPicker extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ReactComponentClass[A with ExportedColorProps] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ReactComponentClass[A with ExportedColorProps] = js.native
}

