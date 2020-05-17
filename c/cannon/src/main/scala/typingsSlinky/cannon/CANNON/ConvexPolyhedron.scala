package typingsSlinky.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvexPolyhedron extends Shape {
  var faceNormals: js.Array[Vec3] = js.native
  var faces: js.Array[js.Array[Double]] = js.native
  var uniqueEdges: js.Array[Vec3] = js.native
  var vertices: js.Array[Vec3] = js.native
  var worldVertices: js.Array[Vec3] = js.native
  var worldVerticesNeedsUpdate: Boolean = js.native
  def calculateWorldAABB(pos: Vec3, quat: Quaternion, min: Vec3, max: Vec3): Unit = js.native
  def clipAgainstHull(
    posA: Vec3,
    quatA: Quaternion,
    hullB: Vec3,
    quatB: Quaternion,
    separatingNormal: Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  def clipFaceAgainstHull(
    separatingNormal: Vec3,
    posA: Vec3,
    quatA: Quaternion,
    worldVertsB1: js.Array[Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  def clipFaceAgainstPlane(inVertices: js.Array[Vec3], outVertices: js.Array[Vec3], planeNormal: Vec3, planeConstant: Double): Vec3 = js.native
  def computeEdges(): Unit = js.native
  def computeLocalAABB(aabbmin: Vec3, aabbmax: Vec3): Unit = js.native
  def computeNormals(): Unit = js.native
  def computeWorldFaceNormals(quat: Quaternion): Unit = js.native
  def computeWorldVertices(position: Vec3, quat: Quaternion): Unit = js.native
  def findSaparatingAxis(
    hullB: ConvexPolyhedron,
    posA: Vec3,
    quatA: Quaternion,
    posB: Vec3,
    quatB: Quaternion,
    target: Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
  ): Boolean = js.native
  def getAveragePointLocal(target: Vec3): Vec3 = js.native
  def getFaceNormal(i: Double, target: Vec3): Vec3 = js.native
  def getPlaneConstantOfFace(face_i: Double): Double = js.native
  def pointIsInside(p: Vec3): Boolean = js.native
  def testSepAxis(axis: Vec3, hullB: ConvexPolyhedron, posA: Vec3, quatA: Quaternion, posB: Vec3, quatB: Quaternion): Double = js.native
  def transformAllPoints(offset: Vec3, quat: Quaternion): Unit = js.native
}

object ConvexPolyhedron {
  @scala.inline
  def apply(
    boundingSphereRadius: Double,
    calculateLocalInertia: (Double, Vec3) => Vec3,
    calculateWorldAABB: (Vec3, Quaternion, Vec3, Vec3) => Unit,
    clipAgainstHull: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[_]) => Unit,
    clipFaceAgainstHull: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[_]) => Unit,
    clipFaceAgainstPlane: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3,
    collisionResponse: Boolean,
    computeEdges: () => Unit,
    computeLocalAABB: (Vec3, Vec3) => Unit,
    computeNormals: () => Unit,
    computeWorldFaceNormals: Quaternion => Unit,
    computeWorldVertices: (Vec3, Quaternion) => Unit,
    faceNormals: js.Array[Vec3],
    faces: js.Array[js.Array[Double]],
    findSaparatingAxis: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[_], js.Array[_]) => Boolean,
    getAveragePointLocal: Vec3 => Vec3,
    getFaceNormal: (Double, Vec3) => Vec3,
    getPlaneConstantOfFace: Double => Double,
    pointIsInside: Vec3 => Boolean,
    testSepAxis: (Vec3, ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion) => Double,
    transformAllPoints: (Vec3, Quaternion) => Unit,
    `type`: Double,
    uniqueEdges: js.Array[Vec3],
    updateBoundingSphereRadius: () => Double,
    vertices: js.Array[Vec3],
    volume: () => Double,
    worldVertices: js.Array[Vec3],
    worldVerticesNeedsUpdate: Boolean
  ): ConvexPolyhedron = {
    val __obj = js.Dynamic.literal(boundingSphereRadius = boundingSphereRadius.asInstanceOf[js.Any], calculateLocalInertia = js.Any.fromFunction2(calculateLocalInertia), calculateWorldAABB = js.Any.fromFunction4(calculateWorldAABB), clipAgainstHull = js.Any.fromFunction8(clipAgainstHull), clipFaceAgainstHull = js.Any.fromFunction7(clipFaceAgainstHull), clipFaceAgainstPlane = js.Any.fromFunction4(clipFaceAgainstPlane), collisionResponse = collisionResponse.asInstanceOf[js.Any], computeEdges = js.Any.fromFunction0(computeEdges), computeLocalAABB = js.Any.fromFunction2(computeLocalAABB), computeNormals = js.Any.fromFunction0(computeNormals), computeWorldFaceNormals = js.Any.fromFunction1(computeWorldFaceNormals), computeWorldVertices = js.Any.fromFunction2(computeWorldVertices), faceNormals = faceNormals.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], findSaparatingAxis = js.Any.fromFunction8(findSaparatingAxis), getAveragePointLocal = js.Any.fromFunction1(getAveragePointLocal), getFaceNormal = js.Any.fromFunction2(getFaceNormal), getPlaneConstantOfFace = js.Any.fromFunction1(getPlaneConstantOfFace), pointIsInside = js.Any.fromFunction1(pointIsInside), testSepAxis = js.Any.fromFunction6(testSepAxis), transformAllPoints = js.Any.fromFunction2(transformAllPoints), uniqueEdges = uniqueEdges.asInstanceOf[js.Any], updateBoundingSphereRadius = js.Any.fromFunction0(updateBoundingSphereRadius), vertices = vertices.asInstanceOf[js.Any], volume = js.Any.fromFunction0(volume), worldVertices = worldVertices.asInstanceOf[js.Any], worldVerticesNeedsUpdate = worldVerticesNeedsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvexPolyhedron]
  }
  @scala.inline
  implicit class ConvexPolyhedronOps[Self <: ConvexPolyhedron] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateWorldAABB(value: (Vec3, Quaternion, Vec3, Vec3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateWorldAABB")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withClipAgainstHull(value: (Vec3, Quaternion, Vec3, Quaternion, Vec3, Double, Double, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipAgainstHull")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withClipFaceAgainstHull(value: (Vec3, Vec3, Quaternion, js.Array[Vec3], Double, Double, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipFaceAgainstHull")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withClipFaceAgainstPlane(value: (js.Array[Vec3], js.Array[Vec3], Vec3, Double) => Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipFaceAgainstPlane")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withComputeEdges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEdges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeLocalAABB(value: (Vec3, Vec3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeLocalAABB")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComputeNormals(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComputeWorldFaceNormals(value: Quaternion => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldFaceNormals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComputeWorldVertices(value: (Vec3, Quaternion) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeWorldVertices")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFaceNormals(value: js.Array[Vec3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faceNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaces(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindSaparatingAxis(
      value: (ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion, Vec3, js.Array[_], js.Array[_]) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findSaparatingAxis")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withGetAveragePointLocal(value: Vec3 => Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAveragePointLocal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFaceNormal(value: (Double, Vec3) => Vec3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFaceNormal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetPlaneConstantOfFace(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaneConstantOfFace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPointIsInside(value: Vec3 => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIsInside")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTestSepAxis(value: (Vec3, ConvexPolyhedron, Vec3, Quaternion, Vec3, Quaternion) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSepAxis")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withTransformAllPoints(value: (Vec3, Quaternion) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformAllPoints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUniqueEdges(value: js.Array[Vec3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[Vec3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldVertices(value: js.Array[Vec3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldVertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldVerticesNeedsUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldVerticesNeedsUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

