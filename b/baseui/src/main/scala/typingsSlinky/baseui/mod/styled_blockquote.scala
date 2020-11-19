package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.blockquote
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
object styled_blockquote extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: blockquote, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
}
