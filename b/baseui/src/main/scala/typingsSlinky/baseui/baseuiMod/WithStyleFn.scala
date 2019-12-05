package typingsSlinky.baseui.baseuiMod

import typingsSlinky.baseui.Anon_Theme
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.styletronDashReact.styletronDashReactMod.StyletronComponent
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithStyleFn extends js.Object {
  def apply[C /* <: StyletronComponent[_] */](component: C, style: StyleObject): StyletronComponent[ComponentProps[C]] = js.native
  def apply[C /* <: StyletronComponent[_] */, P /* <: js.Object */, T](component: C, style: js.Function1[/* props */ P with Anon_Theme[T], StyleObject]): StyletronComponent[ComponentProps[C] with P] = js.native
}

