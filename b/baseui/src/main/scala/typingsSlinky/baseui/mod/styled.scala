package typingsSlinky.baseui.mod

import slinky.core.ReactComponentClass
import typingsSlinky.baseui.AnonClassName
import typingsSlinky.baseui.AnonTheme
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.styletronReact.mod.StyletronComponent
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled extends js.Object {
  def apply[P /* <: js.Object */, C /* <: ReactComponentClass[_] | ReactComponentClass[_] */, T](component: C, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, C /* <: ReactComponentClass[_] | ReactComponentClass[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[C], Exclude[String, AnonClassName]]) with P] = js.native
}

