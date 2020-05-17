package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlurSteps extends js.Object {
  var blurSteps: js.Array[PostProcess] = js.native
  var circleOfConfusion: PostProcess = js.native
}

object BlurSteps {
  @scala.inline
  def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): BlurSteps = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurSteps]
  }
  @scala.inline
  implicit class BlurStepsOps[Self <: BlurSteps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurSteps(value: js.Array[PostProcess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircleOfConfusion(value: PostProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleOfConfusion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

