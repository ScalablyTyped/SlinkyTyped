package typingsSlinky.baseui.baseuiMod

import typingsSlinky.baseui.Anon_ClassName
import typingsSlinky.baseui.Anon_Theme
import typingsSlinky.baseui.baseuiStrings.template
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.styletronDashReact.styletronDashReactMod.StyletronComponent
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_template extends js.Object {
  def apply[P /* <: js.Object */, T](component: template, styledFn: js.Function1[/* props */ Anon_Theme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[template], Exclude[String, Anon_ClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: template, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[template], Exclude[String, Anon_ClassName]]) with P] = js.native
}

