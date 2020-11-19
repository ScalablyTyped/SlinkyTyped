package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.reactDom.testUtilsMod.SyntheticEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/common/testUtilities", JSImport.Namespace)
@js.native
object testUtilitiesMod extends js.Object {
  
  def delay(millisecond: Double): js.Promise[Unit] = js.native
  
  def expectMissing(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): Unit = js.native
  
  def expectNodes(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String, n: Double): Unit = js.native
  
  def expectOne(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): Unit = js.native
  
  def findNodes(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): ReactWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  
  def flushPromises(): js.Promise[Unit] = js.native
  
  def mockEvent(): SyntheticEventData = js.native
  def mockEvent(targetValue: String): SyntheticEventData = js.native
  
  def mountAttached[C /* <: ReactComponentClass[js.Object] */, P, S](element: ReactElement): ReactWrapper[P, S, C] = js.native
  
  def renderIntoDocument(element: ReactElement): HTMLElement = js.native
}
