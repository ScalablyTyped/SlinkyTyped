package typingsSlinky.reactDom.testUtilsMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShallowRenderer extends js.Object {
  
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  def getRenderOutput[E /* <: ReactElement */](): E = js.native
  
  /**
    * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
    */
  def render(element: ReactElement): Unit = js.native
  def render(element: ReactElement, context: js.Any): Unit = js.native
  
  def unmount(): Unit = js.native
}
