package typingsSlinky.baseui.mod

import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.baseuiStrings.keygen
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
object styled_keygen extends js.Object {
  
  def apply[P /* <: js.Object */, T](component: keygen, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[keygen], 
      Exclude[/* keyof react.react.ComponentProps<'keygen'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: keygen, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[keygen], 
      Exclude[/* keyof react.react.ComponentProps<'keygen'> */ String, ClassName]
    ]) with P
  ] = js.native
}
