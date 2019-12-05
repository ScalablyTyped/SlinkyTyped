package typingsSlinky.recompose

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.recompose.recomposeMod.ObservableConfig
import typingsSlinky.recompose.recomposeMod.Subscribable
import typingsSlinky.recompose.recomposeMod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
@JSImport("recompose/componentFromStream", JSImport.Namespace)
@js.native
object componentFromStreamMod extends js.Object {
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[TagMod[Any]]], 
    ReactComponentClass[_]
  ] = js.native
  def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[TagMod[Any]]]): ReactComponentClass[TProps] = js.native
}

