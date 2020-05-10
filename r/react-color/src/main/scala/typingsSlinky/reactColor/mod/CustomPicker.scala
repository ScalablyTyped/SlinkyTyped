package typingsSlinky.reactColor.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactColor.colorWrapMod.ExportedColorProps
import typingsSlinky.reactColor.colorWrapMod.InjectedColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", "CustomPicker")
@js.native
object CustomPicker extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, js.Object]): ReactComponentClass[A with ExportedColorProps] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ReactComponentClass[A with ExportedColorProps] = js.native
}

