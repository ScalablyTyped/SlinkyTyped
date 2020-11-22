package typingsSlinky.ol.viewMod

import typingsSlinky.ol.centerconstraintMod.Type
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraints extends js.Object {
  
  def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): js.UndefOr[Coordinate] = js.native
  def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): js.UndefOr[Coordinate] = js.native
  def center(p0: Coordinate, p1: Double, p2: Size): js.UndefOr[Coordinate] = js.native
  def center(p0: Coordinate, p1: Double, p2: Size, p3: Boolean): js.UndefOr[Coordinate] = js.native
  @JSName("center")
  var center_Original: Type = js.native
  
  def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): js.UndefOr[Double] = js.native
  def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): js.UndefOr[Double] = js.native
  def resolution(p0: Double, p1: Double, p2: Size): js.UndefOr[Double] = js.native
  def resolution(p0: Double, p1: Double, p2: Size, p3: Boolean): js.UndefOr[Double] = js.native
  @JSName("resolution")
  var resolution_Original: typingsSlinky.ol.resolutionconstraintMod.Type = js.native
  
  def rotation(): js.UndefOr[Double] = js.native
  def rotation(p0: js.UndefOr[scala.Nothing], p1: Boolean): js.UndefOr[Double] = js.native
  def rotation(p0: Double): js.UndefOr[Double] = js.native
  def rotation(p0: Double, p1: Boolean): js.UndefOr[Double] = js.native
  @JSName("rotation")
  var rotation_Original: typingsSlinky.ol.rotationconstraintMod.Type = js.native
}
