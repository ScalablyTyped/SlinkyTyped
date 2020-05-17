package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointsGroup extends js.Object {
  /**
    * density per facet for surface points
    * @hidden
    */
  var _groupDensity: js.Array[Double] = js.native
  /**
    * image data for group (internal use)
    * @hidden
    */
  var _groupImageData: Nullable[js.typedarray.ArrayBufferView] = js.native
  /**
    * Image Height (internal use)
    * @hidden
    */
  var _groupImgHeight: Double = js.native
  /**
    * Image Width (internal use)
    * @hidden
    */
  var _groupImgWidth: Double = js.native
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[
    js.Function3[
      /* particle */ CloudPoint, 
      /* i */ js.UndefOr[Double], 
      /* s */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Only when points are colored by texture carries pointer to texture list array
    * @hidden
    */
  var _textureNb: Double = js.native
  /**
    * The group id
    * @hidden
    */
  var groupID: Double = js.native
}

object PointsGroup {
  @scala.inline
  def apply(
    _groupDensity: js.Array[Double],
    _groupImgHeight: Double,
    _groupImgWidth: Double,
    _textureNb: Double,
    groupID: Double
  ): PointsGroup = {
    val __obj = js.Dynamic.literal(_groupDensity = _groupDensity.asInstanceOf[js.Any], _groupImgHeight = _groupImgHeight.asInstanceOf[js.Any], _groupImgWidth = _groupImgWidth.asInstanceOf[js.Any], _textureNb = _textureNb.asInstanceOf[js.Any], groupID = groupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsGroup]
  }
  @scala.inline
  implicit class PointsGroupOps[Self <: PointsGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_groupDensity(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupDensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groupImgHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupImgHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groupImgWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupImgWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_textureNb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_textureNb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groupImageData(value: Nullable[js.typedarray.ArrayBufferView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupImageData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_groupImageDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_groupImageData")(null)
        ret
    }
    @scala.inline
    def with_positionFunction(value: (/* particle */ CloudPoint, /* i */ js.UndefOr[Double], /* s */ js.UndefOr[Double]) => Unit): Self = {
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
  }
  
}

