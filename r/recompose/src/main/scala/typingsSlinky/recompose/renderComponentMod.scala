package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import typingsSlinky.recompose.mod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#rendercomponent
@JSImport("recompose/renderComponent", JSImport.Namespace)
@js.native
object renderComponentMod extends js.Object {
  def default[TProps](component: String): ComponentEnhancer[_, _] = js.native
  def default[TProps](component: ReactComponentClass[TProps]): ComponentEnhancer[_, _] = js.native
}

