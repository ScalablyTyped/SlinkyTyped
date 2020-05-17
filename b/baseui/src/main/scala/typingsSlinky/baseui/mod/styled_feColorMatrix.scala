package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.feColorMatrix
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
object styled_feColorMatrix extends js.Object {
  def apply[P /* <: js.Object */, T](component: feColorMatrix, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feColorMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feColorMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: feColorMatrix, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feColorMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feColorMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
}

