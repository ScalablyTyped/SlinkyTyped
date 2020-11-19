package typingsSlinky.officeUiFabricReact.positioningPositioningMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.officeUiFabricReact.positioningTypesMod.Point
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "getBoundsFromTargetWindow")
@js.native
object getBoundsFromTargetWindow extends js.Object {
  
  def apply(target: Null, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Point, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Element, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = js.native
}
