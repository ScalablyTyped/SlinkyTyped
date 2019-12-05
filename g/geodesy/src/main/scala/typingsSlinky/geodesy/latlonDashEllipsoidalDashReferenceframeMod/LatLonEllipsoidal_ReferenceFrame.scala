package typingsSlinky.geodesy.latlonDashEllipsoidalDashReferenceframeMod

import typingsSlinky.geodesy.geodesyMod.Dp
import typingsSlinky.geodesy.geodesyMod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLonEllipsoidal_ReferenceFrame
  extends typingsSlinky.geodesy.latlonDashEllipsoidalMod.default {
  def convertReferenceFrame(toReferenceFrame: ReferenceFrame): LatLonEllipsoidal_ReferenceFrame = js.native
  def epoch(): Double = js.native
  def referenceFrame(): ReferenceFrame = js.native
  def toString(format: Format): String = js.native
  def toString(format: Format, dp: Dp): String = js.native
  def toString(format: Format, dp: Dp, dpHeight: Double): String = js.native
  def toString(format: Format, dp: Dp, dpHeight: Double, referenceFrame: ReferenceFrame): String = js.native
}

