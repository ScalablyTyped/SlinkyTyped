package typingsSlinky.officeUiFabricReact.positioningMod

import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.positioningTypesMod.IPoint
import typingsSlinky.std.Element
import typingsSlinky.std.MouseEvent
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning", "getMaxHeight")
@js.native
object getMaxHeight extends js.Object {
  def apply(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
}

