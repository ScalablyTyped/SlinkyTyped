package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.head
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
object styled_head extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: head, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[head], 
      Exclude[/* keyof react.react.ComponentProps<'head'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: head, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[head], 
      Exclude[/* keyof react.react.ComponentProps<'head'> */ String, ClassName]
    ]) with P
  ] = js.native
}
