package typingsSlinky.recompose.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "componentFromStreamWithConfig")
@js.native
object componentFromStreamWithConfig extends js.Object {
  
  def apply(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[ReactElement]], 
    ReactComponentClass[_]
  ] = js.native
}
