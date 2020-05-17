package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelShape extends js.Object {
  /**
    * indices array of the model
    * @hidden
    */
  var _indices: js.Array[Double] = js.native
  /**
    * length of the shape in the model indices array (internal use)
    * @hidden
    */
  var _indicesLength: Double = js.native
  /**
    * Model material (internal use)
    * @hidden
    */
  var _material: Nullable[Material] = js.native
  /**
    * normals array of the model
    * @hidden
    */
  var _normals: js.Array[Double] = js.native
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]] = js.native
  /**
    * flat array of model positions (internal use)
    * @hidden
    */
  var _shape: js.Array[Vector3] = js.native
  /**
    * color array of the model
    * @hidden
    */
  var _shapeColors: js.Array[Double] = js.native
  /**
    * flat array of model UVs (internal use)
    * @hidden
    */
  var _shapeUV: js.Array[Double] = js.native
  /**
    * Custom vertex function (internal use)
    * @hidden
    */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
  ] = js.native
  /**
    * The shape id
    * @hidden
    */
  var shapeID: Double = js.native
}

object ModelShape {
  @scala.inline
  def apply(
    _indices: js.Array[Double],
    _indicesLength: Double,
    _normals: js.Array[Double],
    _shape: js.Array[Vector3],
    _shapeColors: js.Array[Double],
    _shapeUV: js.Array[Double],
    shapeID: Double
  ): ModelShape = {
    val __obj = js.Dynamic.literal(_indices = _indices.asInstanceOf[js.Any], _indicesLength = _indicesLength.asInstanceOf[js.Any], _normals = _normals.asInstanceOf[js.Any], _shape = _shape.asInstanceOf[js.Any], _shapeColors = _shapeColors.asInstanceOf[js.Any], _shapeUV = _shapeUV.asInstanceOf[js.Any], shapeID = shapeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelShape]
  }
  @scala.inline
  implicit class ModelShapeOps[Self <: ModelShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_indices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indicesLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indicesLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_normals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_normals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shape(value: js.Array[Vector3]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shapeColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shapeColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_shapeUV(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_shapeUV")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShapeID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_material(value: Nullable[Material]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_material")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_materialNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_material")(null)
        ret
    }
    @scala.inline
    def with_positionFunction(value: (/* particle */ SolidParticle, /* i */ Double, /* s */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_positionFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def with_positionFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_positionFunction")(null)
        ret
    }
    @scala.inline
    def with_vertexFunction(value: (/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def with_vertexFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexFunction")(null)
        ret
    }
  }
  
}

