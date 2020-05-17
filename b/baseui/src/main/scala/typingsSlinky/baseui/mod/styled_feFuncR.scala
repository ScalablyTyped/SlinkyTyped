package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.feFuncR
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
object styled_feFuncR extends js.Object {
  def apply[P /* <: js.Object */, T](component: feFuncR, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncR], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncR'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: feFuncR, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncR], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncR'> */ String, ClassName]
    ]) with P
  ] = js.native
}

