package typingsSlinky.jsClipper.global.ClipperLib

import typingsSlinky.jsClipper.anon.Value
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.PolyOffsetBuilder")
@js.native
class PolyOffsetBuilder protected ()
  extends typingsSlinky.jsClipper.ClipperLib.PolyOffsetBuilder {
  def this(
    pts: typingsSlinky.jsClipper.ClipperLib.Polygons,
    solution: Value,
    delta: Double,
    jointype: typingsSlinky.jsClipper.ClipperLib.JoinType,
    MiterLimit: Double,
    AutoFix: Boolean
  ) = this()
  /* CompleteClass */
  override var botPt: typingsSlinky.jsClipper.ClipperLib.PolyOffsetBuilder = js.native
  /* CompleteClass */
  override var currentPoly: typingsSlinky.jsClipper.ClipperLib.Polygon = js.native
  /* CompleteClass */
  override var delta: Double = js.native
  /* CompleteClass */
  override var m_R: Double = js.native
  /* CompleteClass */
  override var m_i: Double = js.native
  /* CompleteClass */
  override var m_j: Double = js.native
  /* CompleteClass */
  override var m_k: Double = js.native
  /* CompleteClass */
  override var normals: ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] = js.native
  /* CompleteClass */
  override var pts: typingsSlinky.jsClipper.ClipperLib.Polygons = js.native
  /* CompleteClass */
  override def AddPoint(pt: typingsSlinky.jsClipper.ClipperLib.IntPoint): Unit = js.native
  /* CompleteClass */
  override def DoMiter(): Unit = js.native
  /* CompleteClass */
  override def DoRound(): Unit = js.native
  /* CompleteClass */
  override def DoSquare(mul: Double): Unit = js.native
  /* CompleteClass */
  override def UpdateBotPt(pt: typingsSlinky.jsClipper.ClipperLib.IntPoint): Boolean = js.native
}

