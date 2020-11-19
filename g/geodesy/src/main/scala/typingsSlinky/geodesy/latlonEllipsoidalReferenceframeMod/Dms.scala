package typingsSlinky.geodesy.latlonEllipsoidalReferenceframeMod

import typingsSlinky.geodesy.dmsMod.Precision
import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Dms")
@js.native
class Dms ()
  extends typingsSlinky.geodesy.latlonEllipsoidalMod.Dms
/* static members */
@JSImport("geodesy/latlon-ellipsoidal-referenceframe", "Dms")
@js.native
object Dms extends js.Object {
  
  def compassPoint(bearing: Double): String = js.native
  def compassPoint(bearing: Double, precision: Precision): String = js.native
  
  def fromLocale(str: String): String = js.native
  
  def parse(dms: String): Double = js.native
  def parse(dms: Double): Double = js.native
  
  def separator: String = js.native
  def separator_=(char: String): Unit = js.native
  
  def toBrng(deg: Double): String = js.native
  def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
  def toBrng(deg: Double, format: Format): String = js.native
  def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
  
  def toDms(deg: Double): String = js.native
  def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
  def toDms(deg: Double, format: Format): String = js.native
  def toDms(deg: Double, format: Format, dp: Dp): String = js.native
  
  def toLat(deg: Double): String = js.native
  def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
  def toLat(deg: Double, format: Format): String = js.native
  def toLat(deg: Double, format: Format, dp: Dp): String = js.native
  
  def toLocale(str: String): String = js.native
  
  def toLon(deg: Double): String = js.native
  def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
  def toLon(deg: Double, format: Format): String = js.native
  def toLon(deg: Double, format: Format, dp: Dp): String = js.native
  
  def wrap360(degrees: Double): String = js.native
  
  def wrap90(degrees: Double): String = js.native
}
