package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactAsync.anon.ChildrenInitial
import typingsSlinky.reactAsync.anon.Initial
import org.scalablytyped.runtime.StObject
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
object IfPending {
  
  @JSImport("react-async", "IfPending")
  @js.native
  def apply[T /* <: js.Object */](hasChildrenInitialState: Initial[T]): ReactElement = js.native
  @JSImport("react-async", "IfPending")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-async", "IfPending.propTypes")
  @js.native
  def propTypes: ChildrenInitial = js.native
  @scala.inline
  def propTypes_=(x: ChildrenInitial): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
