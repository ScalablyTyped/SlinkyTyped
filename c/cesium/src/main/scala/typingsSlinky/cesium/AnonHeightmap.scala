package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Ellipsoid
import typingsSlinky.cesium.mod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightmap extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var height: Double
  var heightmap: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  var isGeographic: js.UndefOr[Boolean] = js.undefined
  var nativeRectangle: Rectangle
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var relativetoCenter: js.UndefOr[Cartesian3] = js.undefined
  var skirtHeight: Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  var structureheightScale: js.UndefOr[Double] = js.undefined
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  var structurestride: js.UndefOr[Double] = js.undefined
  var vertices: js.Array[_] | scala.scalajs.js.typedarray.Float32Array
  var width: Double
}

object AnonHeightmap {
  @scala.inline
  def apply(
    height: Double,
    heightmap: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array,
    nativeRectangle: Rectangle,
    skirtHeight: Double,
    vertices: js.Array[_] | scala.scalajs.js.typedarray.Float32Array,
    width: Double,
    ellipsoid: Ellipsoid = null,
    isGeographic: js.UndefOr[Boolean] = js.undefined,
    rectangle: Rectangle = null,
    relativetoCenter: Cartesian3 = null,
    structure: js.Any = null,
    structureelementMultiplier: Int | Double = null,
    structureelementsPerHeight: Int | Double = null,
    structureheightOffset: Int | Double = null,
    structureheightScale: Int | Double = null,
    structureisBigEndian: js.UndefOr[Boolean] = js.undefined,
    structurestride: Int | Double = null
  ): AnonHeightmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle.asInstanceOf[js.Any], skirtHeight = skirtHeight.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(isGeographic)) __obj.updateDynamic("isGeographic")(isGeographic.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (relativetoCenter != null) __obj.updateDynamic("relativetoCenter")(relativetoCenter.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (structureelementMultiplier != null) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.asInstanceOf[js.Any])
    if (structureelementsPerHeight != null) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.asInstanceOf[js.Any])
    if (structureheightOffset != null) __obj.updateDynamic("structureheightOffset")(structureheightOffset.asInstanceOf[js.Any])
    if (structureheightScale != null) __obj.updateDynamic("structureheightScale")(structureheightScale.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian.asInstanceOf[js.Any])
    if (structurestride != null) __obj.updateDynamic("structurestride")(structurestride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightmap]
  }
}

