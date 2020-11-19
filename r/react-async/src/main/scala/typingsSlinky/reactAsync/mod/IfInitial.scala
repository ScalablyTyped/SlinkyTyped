package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.Persist
import typingsSlinky.reactAsync.anon.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when no promise has started or completed yet.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show until we have data, even while pending (loading) or when an error occurred
  */
@JSImport("react-async", "IfInitial")
@js.native
object IfInitial extends js.Object {
  
  def apply[T /* <: js.Object */](hasChildrenPersistState: State[T]): ReactElement = js.native
  
  var propTypes: Persist = js.native
}
