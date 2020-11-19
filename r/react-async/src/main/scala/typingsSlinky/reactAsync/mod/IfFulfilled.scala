package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.Children
import typingsSlinky.reactAsync.anon.Persist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is resolved.
  *
  * @prop {Function|Node} children Function (passing data and state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data while pending (promise is loading)
  */
@JSImport("react-async", "IfFulfilled")
@js.native
object IfFulfilled extends js.Object {
  
  def apply[T /* <: js.Object */](hasChildrenPersistState: Children[T]): ReactElement = js.native
  
  var propTypes: Persist = js.native
}
