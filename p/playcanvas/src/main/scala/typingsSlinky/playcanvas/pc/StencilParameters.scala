package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.StencilParameters
  * @classdesc Holds stencil test settings.
  * @description Create a new StencilParameters instance.
  * @param {object} options - Options object to configure the stencil parameters.
  * @property {number} func Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} ref Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} fail Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} zfail Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} zpass Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
  * @property {number} readMask Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
  * @property {number} writeMask Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
  */
@js.native
trait StencilParameters extends js.Object {
  /**
    * Sets operation to perform if stencil test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var fail: Double = js.native
  /**
    * Sets stencil test function. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var func: Double = js.native
  /**
    * Sets stencil test reading mask. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var readMask: Double = js.native
  /**
    * Sets stencil test reference value. See {@link pc.GraphicsDevice#setStencilFunc}.
    */
  var ref: Double = js.native
  /**
    * Sets stencil test writing mask. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var writeMask: Double = js.native
  /**
    * Sets operation to perform if depth test is failed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zfail: Double = js.native
  /**
    * Sets operation to perform if both stencil and depth test are passed. See {@link pc.GraphicsDevice#setStencilOperation}.
    */
  var zpass: Double = js.native
}

object StencilParameters {
  @scala.inline
  def apply(
    fail: Double,
    func: Double,
    readMask: Double,
    ref: Double,
    writeMask: Double,
    zfail: Double,
    zpass: Double
  ): StencilParameters = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], readMask = readMask.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], writeMask = writeMask.asInstanceOf[js.Any], zfail = zfail.asInstanceOf[js.Any], zpass = zpass.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilParameters]
  }
  @scala.inline
  implicit class StencilParametersOps[Self <: StencilParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("func")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRef(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZfail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zfail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZpass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zpass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

