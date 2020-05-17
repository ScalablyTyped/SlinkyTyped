package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.feTile
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
object styled_feTile extends js.Object {
  def apply[P /* <: js.Object */, T](component: feTile, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feTile], 
      Exclude[/* keyof react.react.ComponentProps<'feTile'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: feTile, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feTile], 
      Exclude[/* keyof react.react.ComponentProps<'feTile'> */ String, ClassName]
    ]) with P
  ] = js.native
}

