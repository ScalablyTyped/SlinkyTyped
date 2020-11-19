package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.ChildrenInitial
import typingsSlinky.reactAsync.anon.Initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only while pending (promise is loading).
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} initial Show only on initial load (data is undefined)
  */
@JSImport("react-async", "IfPending")
@js.native
object IfPending extends js.Object {
  
  def apply[T /* <: js.Object */](hasChildrenInitialState: Initial[T]): ReactElement = js.native
  
  var propTypes: ChildrenInitial = js.native
}
