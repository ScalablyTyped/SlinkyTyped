package typingsSlinky.babylonjs.renderingManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderingManagerAutoClearSetup extends js.Object {
  /**
    * Defines whether or not autoclear is enable.
    */
  var autoClear: Boolean = js.native
  /**
    * Defines whether or not to autoclear the depth buffer.
    */
  var depth: Boolean = js.native
  /**
    * Defines whether or not to autoclear the stencil buffer.
    */
  var stencil: Boolean = js.native
}

object IRenderingManagerAutoClearSetup {
  @scala.inline
  def apply(autoClear: Boolean, depth: Boolean, stencil: Boolean): IRenderingManagerAutoClearSetup = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderingManagerAutoClearSetup]
  }
  @scala.inline
  implicit class IRenderingManagerAutoClearSetupOps[Self <: IRenderingManagerAutoClearSetup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStencil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

