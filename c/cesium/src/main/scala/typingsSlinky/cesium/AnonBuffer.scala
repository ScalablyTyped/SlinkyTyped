package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuffer extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  var structureheightScale: js.UndefOr[Double] = js.undefined
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  var structurestride: js.UndefOr[Double] = js.undefined
  var width: Double
}

object AnonBuffer {
  @scala.inline
  def apply(
    buffer: scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array,
    height: Double,
    width: Double,
    childTileMask: Int | Double = null,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    structure: js.Any = null,
    structureelementMultiplier: Int | Double = null,
    structureelementsPerHeight: Int | Double = null,
    structureheightOffset: Int | Double = null,
    structureheightScale: Int | Double = null,
    structureisBigEndian: js.UndefOr[Boolean] = js.undefined,
    structurestride: Int | Double = null
  ): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (structureelementMultiplier != null) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.asInstanceOf[js.Any])
    if (structureelementsPerHeight != null) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.asInstanceOf[js.Any])
    if (structureheightOffset != null) __obj.updateDynamic("structureheightOffset")(structureheightOffset.asInstanceOf[js.Any])
    if (structureheightScale != null) __obj.updateDynamic("structureheightScale")(structureheightScale.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian.asInstanceOf[js.Any])
    if (structurestride != null) __obj.updateDynamic("structurestride")(structurestride.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
}

