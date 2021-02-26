package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.Persist
import typingsSlinky.reactAsync.anon.PersistState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders only when promise is fulfilled or rejected.
  *
  * @prop {Function|Node} children Function (passing state) or React node
  * @prop {Object} state React Async state object
  * @prop {boolean} persist Show old data or error while pending (promise is loading)
  */
object IfSettled {
  
  @JSImport("react-async", "IfSettled")
  @js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: PersistState[T]): ReactElement = js.native
  @JSImport("react-async", "IfSettled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfSettled.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
