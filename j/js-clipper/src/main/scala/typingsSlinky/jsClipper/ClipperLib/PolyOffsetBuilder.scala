package typingsSlinky.jsClipper.ClipperLib

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolyOffsetBuilder extends js.Object {
  var botPt: PolyOffsetBuilder = js.native
  var currentPoly: Polygon = js.native
  var delta: Double = js.native
  var m_R: Double = js.native
  var m_i: Double = js.native
  var m_j: Double = js.native
  var m_k: Double = js.native
  var normals: ArrayLike[IntPoint] = js.native
  var pts: Polygons = js.native
  def AddPoint(pt: IntPoint): Unit = js.native
  def DoMiter(): Unit = js.native
  def DoRound(): Unit = js.native
  def DoSquare(mul: Double): Unit = js.native
  def UpdateBotPt(pt: IntPoint): Boolean = js.native
}

object PolyOffsetBuilder {
  @scala.inline
  def apply(
    AddPoint: IntPoint => Unit,
    DoMiter: () => Unit,
    DoRound: () => Unit,
    DoSquare: Double => Unit,
    UpdateBotPt: IntPoint => Boolean,
    botPt: PolyOffsetBuilder,
    currentPoly: Polygon,
    delta: Double,
    m_R: Double,
    m_i: Double,
    m_j: Double,
    m_k: Double,
    normals: ArrayLike[IntPoint],
    pts: Polygons
  ): PolyOffsetBuilder = {
    val __obj = js.Dynamic.literal(AddPoint = js.Any.fromFunction1(AddPoint), DoMiter = js.Any.fromFunction0(DoMiter), DoRound = js.Any.fromFunction0(DoRound), DoSquare = js.Any.fromFunction1(DoSquare), UpdateBotPt = js.Any.fromFunction1(UpdateBotPt), botPt = botPt.asInstanceOf[js.Any], currentPoly = currentPoly.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], m_R = m_R.asInstanceOf[js.Any], m_i = m_i.asInstanceOf[js.Any], m_j = m_j.asInstanceOf[js.Any], m_k = m_k.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOffsetBuilder]
  }
  @scala.inline
  implicit class PolyOffsetBuilderOps[Self <: PolyOffsetBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPoint(value: IntPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDoMiter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoMiter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoRound(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoRound")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDoSquare(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DoSquare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateBotPt(value: IntPoint => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateBotPt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBotPt(value: PolyOffsetBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botPt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPoly(value: Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_R(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_i(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_j(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_j")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_k(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormals(value: ArrayLike[IntPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPts(value: Polygons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

