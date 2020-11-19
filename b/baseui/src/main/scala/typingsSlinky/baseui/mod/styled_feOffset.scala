package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.feOffset
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.styletronReact.mod.StyletronComponent
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui", "styled")
@js.native
object styled_feOffset extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: feOffset, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feOffset], 
      Exclude[/* keyof react.react.ComponentProps<'feOffset'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: feOffset, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feOffset], 
      Exclude[/* keyof react.react.ComponentProps<'feOffset'> */ String, ClassName]
    ]) with P
  ] = js.native
}
