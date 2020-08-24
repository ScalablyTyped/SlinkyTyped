package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.recompose.mod.ObservableConfig
import typingsSlinky.recompose.mod.Subscribable
import typingsSlinky.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
@JSImport("recompose/componentFromStream", JSImport.Namespace)
@js.native
object componentFromStreamMod extends js.Object {
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactElement]], 
    ReactComponentClass[_]
  ] = js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactElement]]): ReactComponentClass[TProps] = js.native
}

