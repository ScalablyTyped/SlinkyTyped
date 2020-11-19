package typingsSlinky.ol.viewMod

import typingsSlinky.ol.centerconstraintMod.Type
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constraints extends js.Object {
  
  def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): Coordinate = js.native
  def center(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): Coordinate = js.native
  def center(p0: Coordinate, p1: Double, p2: Size): Coordinate = js.native
  def center(p0: Coordinate, p1: Double, p2: Size, p3: Boolean): Coordinate = js.native
  @JSName("center")
  var center_Original: Type = js.native
  
  def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size): Double = js.native
  def resolution(p0: js.UndefOr[scala.Nothing], p1: Double, p2: Size, p3: Boolean): Double = js.native
  def resolution(p0: Double, p1: Double, p2: Size): Double = js.native
  def resolution(p0: Double, p1: Double, p2: Size, p3: Boolean): Double = js.native
  @JSName("resolution")
  var resolution_Original: typingsSlinky.ol.resolutionconstraintMod.Type = js.native
  
  def rotation(): Double = js.native
  def rotation(p0: js.UndefOr[scala.Nothing], p1: Boolean): Double = js.native
  def rotation(p0: Double): Double = js.native
  def rotation(p0: Double, p1: Boolean): Double = js.native
  @JSName("rotation")
  var rotation_Original: typingsSlinky.ol.rotationconstraintMod.Type = js.native
}
