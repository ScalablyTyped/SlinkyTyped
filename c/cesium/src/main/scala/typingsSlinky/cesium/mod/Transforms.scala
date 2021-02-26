package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transforms {
  
  @JSImport("cesium", "Transforms.computeFixedToIcrfMatrix")
  @js.native
  def computeFixedToIcrfMatrix(date: JulianDate): Matrix3 = js.native
  @JSImport("cesium", "Transforms.computeFixedToIcrfMatrix")
  @js.native
  def computeFixedToIcrfMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  
  @JSImport("cesium", "Transforms.computeIcrfToFixedMatrix")
  @js.native
  def computeIcrfToFixedMatrix(date: JulianDate): Matrix3 = js.native
  @JSImport("cesium", "Transforms.computeIcrfToFixedMatrix")
  @js.native
  def computeIcrfToFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  
  @JSImport("cesium", "Transforms.computeTemeToPseudoFixedMatrix")
  @js.native
  def computeTemeToPseudoFixedMatrix(date: JulianDate): Matrix3 = js.native
  @JSImport("cesium", "Transforms.computeTemeToPseudoFixedMatrix")
  @js.native
  def computeTemeToPseudoFixedMatrix(date: JulianDate, result: Matrix3): Matrix3 = js.native
  
  @JSImport("cesium", "Transforms.eastNorthUpToFixedFrame")
  @js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  @JSImport("cesium", "Transforms.eastNorthUpToFixedFrame")
  @js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  @JSImport("cesium", "Transforms.eastNorthUpToFixedFrame")
  @js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  @JSImport("cesium", "Transforms.eastNorthUpToFixedFrame")
  @js.native
  def eastNorthUpToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(transform: Matrix4): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: HeadingPitchRoll
  ): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame
  ): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: HeadingPitchRoll
  ): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Ellipsoid): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: HeadingPitchRoll
  ): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(transform: Matrix4, ellipsoid: Ellipsoid, fixedFrameTransform: LocalFrameToFixedFrame): HeadingPitchRoll = js.native
  @JSImport("cesium", "Transforms.fixedFrameToHeadingPitchRoll")
  @js.native
  def fixedFrameToHeadingPitchRoll(
    transform: Matrix4,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: HeadingPitchRoll
  ): HeadingPitchRoll = js.native
  
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: Quaternion
  ): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Quaternion
  ): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: Quaternion
  ): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Quaternion = js.native
  @JSImport("cesium", "Transforms.headingPitchRollQuaternion")
  @js.native
  def headingPitchRollQuaternion(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Quaternion
  ): Quaternion = js.native
  
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: Matrix4
  ): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: js.UndefOr[scala.Nothing],
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Matrix4
  ): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(origin: Cartesian3, headingPitchRoll: HeadingPitchRoll, ellipsoid: Ellipsoid): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: js.UndefOr[scala.Nothing],
    result: Matrix4
  ): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame
  ): Matrix4 = js.native
  @JSImport("cesium", "Transforms.headingPitchRollToFixedFrame")
  @js.native
  def headingPitchRollToFixedFrame(
    origin: Cartesian3,
    headingPitchRoll: HeadingPitchRoll,
    ellipsoid: Ellipsoid,
    fixedFrameTransform: LocalFrameToFixedFrame,
    result: Matrix4
  ): Matrix4 = js.native
  
  @JSImport("cesium", "Transforms.northEastDownToFixedFrame")
  @js.native
  def northEastDownToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northEastDownToFixedFrame")
  @js.native
  def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northEastDownToFixedFrame")
  @js.native
  def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northEastDownToFixedFrame")
  @js.native
  def northEastDownToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  
  @JSImport("cesium", "Transforms.northUpEastToFixedFrame")
  @js.native
  def northUpEastToFixedFrame(origin: Cartesian3): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northUpEastToFixedFrame")
  @js.native
  def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: js.UndefOr[scala.Nothing], result: Matrix4): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northUpEastToFixedFrame")
  @js.native
  def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid): Matrix4 = js.native
  @JSImport("cesium", "Transforms.northUpEastToFixedFrame")
  @js.native
  def northUpEastToFixedFrame(origin: Cartesian3, ellipsoid: Ellipsoid, result: Matrix4): Matrix4 = js.native
  
  @JSImport("cesium", "Transforms.pointToWindowCoordinates")
  @js.native
  def pointToWindowCoordinates(modelViewProjectionMatrix: Matrix4, viewportTransformation: Matrix4, point: Cartesian3): Cartesian2 = js.native
  @JSImport("cesium", "Transforms.pointToWindowCoordinates")
  @js.native
  def pointToWindowCoordinates(
    modelViewProjectionMatrix: Matrix4,
    viewportTransformation: Matrix4,
    point: Cartesian3,
    result: Cartesian2
  ): Cartesian2 = js.native
  
  @JSImport("cesium", "Transforms.preloadIcrfFixed")
  @js.native
  def preloadIcrfFixed(timeInterval: TimeInterval): js.Promise[Unit] = js.native
  
  type LocalFrameToFixedFrame = js.Function3[
    /* origin */ Cartesian3, 
    /* ellipsoid */ js.UndefOr[Ellipsoid], 
    /* result */ js.UndefOr[Matrix4], 
    Matrix4
  ]
}
