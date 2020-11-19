package typingsSlinky.makerJs.global.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IFindChainsOptions
import typingsSlinky.makerJs.MakerJs.IPathBezierSeed
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.models.BezierCurve")
@js.native
class BezierCurve protected ()
  extends typingsSlinky.makerJs.MakerJs.models.BezierCurve {
  def this(points: js.Array[IPoint]) = this()
  def this(seed: IPathBezierSeed) = this()
  def this(points: js.Array[IPoint], accuracy: Double) = this()
  def this(seed: IPathBezierSeed, accuracy: Double) = this()
  def this(seed: IPathBezierSeed, isChild: Boolean) = this()
  def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint) = this()
  def this(origin: IPoint, control: IPoint, end: IPoint) = this()
  def this(seed: IPathBezierSeed, isChild: Boolean, accuracy: Double) = this()
  def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint) = this()
  def this(origin: IPoint, controls: js.Array[IPoint], end: IPoint, accuracy: Double) = this()
  def this(origin: IPoint, control: IPoint, end: IPoint, accuracy: Double) = this()
  def this(origin: IPoint, control1: IPoint, control2: IPoint, end: IPoint, accuracy: Double) = this()
}
/* static members */
@JSGlobal("MakerJs.models.BezierCurve")
@js.native
object BezierCurve extends js.Object {
  
  def computeLength(seed: IPathBezierSeed): Double = js.native
  
  def computePoint(seed: IPathBezierSeed, t: Double): IPoint = js.native
  
  def getBezierSeeds(curve: typingsSlinky.makerJs.MakerJs.models.BezierCurve): js.Array[IPathBezierSeed] = js.native
  def getBezierSeeds(curve: typingsSlinky.makerJs.MakerJs.models.BezierCurve, options: IFindChainsOptions): js.Array[IPathBezierSeed] = js.native
  
  var typeName: String = js.native
}
