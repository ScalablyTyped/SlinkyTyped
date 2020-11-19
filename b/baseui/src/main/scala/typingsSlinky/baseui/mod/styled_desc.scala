package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.desc_
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
object styled_desc extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: desc_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[desc_], 
      Exclude[/* keyof react.react.ComponentProps<'desc'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: desc_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[desc_], 
      Exclude[/* keyof react.react.ComponentProps<'desc'> */ String, ClassName]
    ]) with P
  ] = js.native
}
