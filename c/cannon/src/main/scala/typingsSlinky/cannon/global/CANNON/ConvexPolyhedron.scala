package typingsSlinky.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typingsSlinky.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typingsSlinky.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typingsSlinky.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var faceNormals: js.Array[typingsSlinky.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var faces: js.Array[js.Array[Double]] = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override var uniqueEdges: js.Array[typingsSlinky.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var vertices: js.Array[typingsSlinky.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var worldVertices: js.Array[typingsSlinky.cannon.CANNON.Vec3] = js.native
  /* CompleteClass */
  override var worldVerticesNeedsUpdate: Boolean = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def calculateWorldAABB(
    pos: typingsSlinky.cannon.CANNON.Vec3,
    quat: typingsSlinky.cannon.CANNON.Quaternion,
    min: typingsSlinky.cannon.CANNON.Vec3,
    max: typingsSlinky.cannon.CANNON.Vec3
  ): Unit = js.native
  /* CompleteClass */
  override def clipAgainstHull(
    posA: typingsSlinky.cannon.CANNON.Vec3,
    quatA: typingsSlinky.cannon.CANNON.Quaternion,
    hullB: typingsSlinky.cannon.CANNON.Vec3,
    quatB: typingsSlinky.cannon.CANNON.Quaternion,
    separatingNormal: typingsSlinky.cannon.CANNON.Vec3,
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  /* CompleteClass */
  override def clipFaceAgainstHull(
    separatingNormal: typingsSlinky.cannon.CANNON.Vec3,
    posA: typingsSlinky.cannon.CANNON.Vec3,
    quatA: typingsSlinky.cannon.CANNON.Quaternion,
    worldVertsB1: js.Array[typingsSlinky.cannon.CANNON.Vec3],
    minDist: Double,
    maxDist: Double,
    result: js.Array[_]
  ): Unit = js.native
  /* CompleteClass */
  override def clipFaceAgainstPlane(
    inVertices: js.Array[typingsSlinky.cannon.CANNON.Vec3],
    outVertices: js.Array[typingsSlinky.cannon.CANNON.Vec3],
    planeNormal: typingsSlinky.cannon.CANNON.Vec3,
    planeConstant: Double
  ): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def computeEdges(): Unit = js.native
  /* CompleteClass */
  override def computeLocalAABB(aabbmin: typingsSlinky.cannon.CANNON.Vec3, aabbmax: typingsSlinky.cannon.CANNON.Vec3): Unit = js.native
  /* CompleteClass */
  override def computeNormals(): Unit = js.native
  /* CompleteClass */
  override def computeWorldFaceNormals(quat: typingsSlinky.cannon.CANNON.Quaternion): Unit = js.native
  /* CompleteClass */
  override def computeWorldVertices(position: typingsSlinky.cannon.CANNON.Vec3, quat: typingsSlinky.cannon.CANNON.Quaternion): Unit = js.native
  /* CompleteClass */
  override def findSaparatingAxis(
    hullB: typingsSlinky.cannon.CANNON.ConvexPolyhedron,
    posA: typingsSlinky.cannon.CANNON.Vec3,
    quatA: typingsSlinky.cannon.CANNON.Quaternion,
    posB: typingsSlinky.cannon.CANNON.Vec3,
    quatB: typingsSlinky.cannon.CANNON.Quaternion,
    target: typingsSlinky.cannon.CANNON.Vec3,
    faceListA: js.Array[_],
    faceListB: js.Array[_]
  ): Boolean = js.native
  /* CompleteClass */
  override def getAveragePointLocal(target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def getFaceNormal(i: Double, target: typingsSlinky.cannon.CANNON.Vec3): typingsSlinky.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def getPlaneConstantOfFace(face_i: Double): Double = js.native
  /* CompleteClass */
  override def pointIsInside(p: typingsSlinky.cannon.CANNON.Vec3): Boolean = js.native
  /* CompleteClass */
  override def testSepAxis(
    axis: typingsSlinky.cannon.CANNON.Vec3,
    hullB: typingsSlinky.cannon.CANNON.ConvexPolyhedron,
    posA: typingsSlinky.cannon.CANNON.Vec3,
    quatA: typingsSlinky.cannon.CANNON.Quaternion,
    posB: typingsSlinky.cannon.CANNON.Vec3,
    quatB: typingsSlinky.cannon.CANNON.Quaternion
  ): Double = js.native
  /* CompleteClass */
  override def transformAllPoints(offset: typingsSlinky.cannon.CANNON.Vec3, quat: typingsSlinky.cannon.CANNON.Quaternion): Unit = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

/* static members */
@JSGlobal("CANNON.ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: typingsSlinky.cannon.CANNON.Vec3,
    vb: typingsSlinky.cannon.CANNON.Vec3,
    vc: typingsSlinky.cannon.CANNON.Vec3,
    target: typingsSlinky.cannon.CANNON.Vec3
  ): Unit = js.native
  def project(
    hull: typingsSlinky.cannon.CANNON.ConvexPolyhedron,
    axis: typingsSlinky.cannon.CANNON.Vec3,
    pos: typingsSlinky.cannon.CANNON.Vec3,
    quat: typingsSlinky.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}

