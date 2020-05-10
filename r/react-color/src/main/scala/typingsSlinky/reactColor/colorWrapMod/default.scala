package typingsSlinky.reactColor.colorWrapMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/ColorWrap", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, js.Object]): ReactComponentClass[A with ExportedColorProps] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ReactComponentClass[A with ExportedColorProps] = js.native
}

