package typingsSlinky.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <p> An abstract instance of boxologic. </p>
  *
  * <p> {@link st_Instance} represents a physical, tangible instance of 3-dimension. </p>
  *
  * @author Jeongho Nam <http://samchon.org>
  */
@js.native
trait Instance extends js.Object {
  /**
    * Height of the tangible instance, length on the Y-axis in 3D.
    */
  var height: Double = js.native
  /**
    * Height considering layout placement.
    */
  var layout_height: Double = js.native
  /**
    * Length considering layout placement.
    */
  var layout_length: Double = js.native
  /**
    * Width considering layout placement.
    */
  var layout_width: Double = js.native
  /**
    * Length of the tangible instance, length on the Z-axis in 3D.
    */
  var length: Double = js.native
  /**
    * Volume, Width x Height x Length.
    */
  var volume: Double = js.native
  /**
    * Width of the tangible instance, length on the X-axis in 3D.
    */
  var width: Double = js.native
}

object Instance {
  @scala.inline
  def apply(
    height: Double,
    layout_height: Double,
    layout_length: Double,
    layout_width: Double,
    length: Double,
    volume: Double,
    width: Double
  ): Instance = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayout_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

