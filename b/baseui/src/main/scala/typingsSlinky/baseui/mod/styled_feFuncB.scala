package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.feFuncB
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
object styled_feFuncB extends js.Object {
  def apply[P /* <: js.Object */, T](component: feFuncB, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncB], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncB'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: feFuncB, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncB], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncB'> */ String, ClassName]
    ]) with P
  ] = js.native
}

