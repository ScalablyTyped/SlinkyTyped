package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomHeaderProps[Data] extends js.Object {
  
  def children(): ReactElement = js.native
  def children(props: CustomHeaderPropsChildrenFnProps[Data]): ReactElement = js.native
  
  var headerData: js.UndefOr[Data] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var unit: js.UndefOr[Unit] = js.native
}
