package typingsSlinky.recompose

import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.recompose.recomposeMod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
@JSImport("recompose/renderComponent", JSImport.Namespace)
@js.native
object renderComponentMod extends js.Object {
  def default[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def default[TProps](component: ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
}

