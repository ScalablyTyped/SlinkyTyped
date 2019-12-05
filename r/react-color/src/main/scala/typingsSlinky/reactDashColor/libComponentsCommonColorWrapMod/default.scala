package typingsSlinky.reactDashColor.libComponentsCommonColorWrapMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/ColorWrap", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ReactComponentClass[A with ExportedColorProps] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ReactComponentClass[A with ExportedColorProps] = js.native
}

