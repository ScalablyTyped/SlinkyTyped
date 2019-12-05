package typingsSlinky.recompose.recomposeMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStreamWithConfig")
@js.native
object componentFromStreamWithConfig extends js.Object {
  def apply(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[TagMod[Any]]], 
    ReactComponentClass[_]
  ] = js.native
}

