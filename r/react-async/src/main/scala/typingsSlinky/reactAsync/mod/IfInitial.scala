package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.Persist
import typingsSlinky.reactAsync.anon.State
import org.scalablytyped.runtime.StObject
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
object IfInitial {
  
  @JSImport("react-async", "IfInitial")
  @js.native
  def apply[T /* <: js.Object */](hasChildrenPersistState: State[T]): ReactElement = js.native
  @JSImport("react-async", "IfInitial")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfInitial.propTypes")
  @js.native
  def propTypes: Persist = js.native
  @scala.inline
  def propTypes_=(x: Persist): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
