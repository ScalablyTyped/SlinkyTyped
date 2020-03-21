package typingsSlinky.baseui.mod

import typingsSlinky.baseui.AnonClassName
import typingsSlinky.baseui.AnonTheme
import typingsSlinky.baseui.baseuiStrings.iframe
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
object styled_iframe extends js.Object {
  def apply[P /* <: js.Object */, T](component: iframe, styledFn: js.Function1[/* props */ AnonTheme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[iframe], Exclude[String, AnonClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: iframe, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[iframe], Exclude[String, AnonClassName]]) with P] = js.native
}

