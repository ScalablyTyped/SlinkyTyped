package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancingAttributeInfo extends js.Object {
  /**
    * Name of the GLSL attribute
    * if attribute index is not specified, this is used to retrieve the index from the effect
    */
  var attributeName: String = js.native
  /**
    * size of the attribute, 1, 2, 3 or 4
    */
  var attributeSize: Double = js.native
  /**
    * type of the attribute, gl.BYTE, gl.UNSIGNED_BYTE, gl.SHORT, gl.UNSIGNED_SHORT, gl.FIXED, gl.FLOAT.
    * default is FLOAT
    */
  var attributeType: js.UndefOr[Double] = js.native
  /**
    * Modifies the rate at which generic vertex attributes advance when rendering multiple instances
    * default to 1
    */
  var divisor: js.UndefOr[Double] = js.native
  /**
    * Index/offset of the attribute in the vertex shader
    * if not specified, this will be computes from the name.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * normalization of fixed-point data. behavior unclear, use FALSE, default is FALSE
    */
  var normalized: js.UndefOr[Boolean] = js.native
  /**
    * Offset of the data in the Vertex Buffer acting as the instancing buffer
    */
  var offset: Double = js.native
}

object InstancingAttributeInfo {
  @scala.inline
  def apply(attributeName: String, attributeSize: Double, offset: Double): InstancingAttributeInfo = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], attributeSize = attributeSize.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancingAttributeInfo]
  }
  @scala.inline
  implicit class InstancingAttributeInfoOps[Self <: InstancingAttributeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDivisor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivisor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divisor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalized")(js.undefined)
        ret
    }
  }
  
}

