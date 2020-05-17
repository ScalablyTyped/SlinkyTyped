package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.text
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
object styled_text extends js.Object {
  def apply[P /* <: js.Object */, T](component: text, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[text], 
      Exclude[/* keyof react.react.ComponentProps<'text'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: text, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[text], 
      Exclude[/* keyof react.react.ComponentProps<'text'> */ String, ClassName]
    ]) with P
  ] = js.native
}

