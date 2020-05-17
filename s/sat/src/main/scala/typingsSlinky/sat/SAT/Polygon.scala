package typingsSlinky.sat.SAT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon extends js.Object {
  var angle: Double = js.native
  var calcPoints: js.Array[Vector] = js.native
  var edges: js.Array[Vector] = js.native
  var normals: js.Array[Vector] = js.native
  var offset: Vector = js.native
  var points: js.Array[Vector] = js.native
  var pos: Vector = js.native
  def getAABB(): Polygon = js.native
  def getCentroid(): Vector = js.native
  def rotate(angle: Double): Polygon = js.native
  def setAngle(angle: Double): Polygon = js.native
  def setOffset(offset: Vector): Polygon = js.native
  def setPoints(points: js.Array[Vector]): Polygon = js.native
  def translate(x: Double, y: Double): Polygon = js.native
}

object Polygon {
  @scala.inline
  def apply(
    angle: Double,
    calcPoints: js.Array[Vector],
    edges: js.Array[Vector],
    getAABB: () => Polygon,
    getCentroid: () => Vector,
    normals: js.Array[Vector],
    offset: Vector,
    points: js.Array[Vector],
    pos: Vector,
    rotate: Double => Polygon,
    setAngle: Double => Polygon,
    setOffset: Vector => Polygon,
    setPoints: js.Array[Vector] => Polygon,
    translate: (Double, Double) => Polygon
  ): Polygon = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], calcPoints = calcPoints.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getAABB = js.Any.fromFunction0(getAABB), getCentroid = js.Any.fromFunction0(getCentroid), normals = normals.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rotate = js.Any.fromFunction1(rotate), setAngle = js.Any.fromFunction1(setAngle), setOffset = js.Any.fromFunction1(setOffset), setPoints = js.Any.fromFunction1(setPoints), translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[Polygon]
  }
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalcPoints(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAABB(value: () => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAABB")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCentroid(value: () => Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCentroid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNormals(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Vector]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotate(value: Double => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetAngle(value: Double => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAngle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOffset(value: Vector => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOffset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPoints(value: js.Array[Vector] => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslate(value: (Double, Double) => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

