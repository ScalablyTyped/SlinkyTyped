package typingsSlinky.baseui.baseuiMod

import typingsSlinky.baseui.Anon_ClassName
import typingsSlinky.baseui.Anon_Theme
import typingsSlinky.baseui.baseuiStrings.rt
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
object styled_rt extends js.Object {
  def apply[P /* <: js.Object */, T](component: rt, styledFn: js.Function1[/* props */ Anon_Theme[T] with P, StyleObject]): StyletronComponent[(Pick[ComponentProps[rt], Exclude[String, Anon_ClassName]]) with P] = js.native
  def apply[P /* <: js.Object */, T](component: rt, styledFn: StyleObject): StyletronComponent[(Pick[ComponentProps[rt], Exclude[String, Anon_ClassName]]) with P] = js.native
}

