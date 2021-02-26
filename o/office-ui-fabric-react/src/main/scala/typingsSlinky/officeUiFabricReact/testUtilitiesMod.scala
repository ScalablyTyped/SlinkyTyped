package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.reactDom.testUtilsMod.SyntheticEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testUtilitiesMod {
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "delay")
  @js.native
  def delay(millisecond: Double): js.Promise[Unit] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectMissing")
  @js.native
  def expectMissing(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectNodes")
  @js.native
  def expectNodes(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String, n: Double): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "expectOne")
  @js.native
  def expectOne(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "findNodes")
  @js.native
  def findNodes(wrapper: ReactWrapper[_, _, ReactComponentClass[js.Object]], className: String): ReactWrapper[_, _, ReactComponentClass[js.Object]] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "flushPromises")
  @js.native
  def flushPromises(): js.Promise[Unit] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mockEvent")
  @js.native
  def mockEvent(): SyntheticEventData = js.native
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mockEvent")
  @js.native
  def mockEvent(targetValue: String): SyntheticEventData = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "mountAttached")
  @js.native
  def mountAttached[C /* <: ReactComponentClass[js.Object] */, P, S](element: ReactElement): ReactWrapper[P, S, C] = js.native
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", "renderIntoDocument")
  @js.native
  def renderIntoDocument(element: ReactElement): HTMLElement = js.native
}
