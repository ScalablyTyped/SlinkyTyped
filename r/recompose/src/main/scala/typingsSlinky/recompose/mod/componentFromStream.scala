package typingsSlinky.recompose.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recompose", "componentFromStream")
@js.native
object componentFromStream extends js.Object {
  
  def apply[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[ReactElement]]): ReactComponentClass[TProps] = js.native
}
