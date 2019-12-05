package typingsSlinky.recompose.recomposeMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "componentFromStream")
@js.native
object componentFromStream extends js.Object {
  def apply[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[TagMod[Any]]]): ReactComponentClass[TProps] = js.native
}

