package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.postProcessMod.PostProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blurred extends js.Object {
  var blurred: PostProcess = js.native
  var weight: Double = js.native
}

object Blurred {
  @scala.inline
  def apply(blurred: PostProcess, weight: Double): Blurred = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blurred]
  }
  @scala.inline
  implicit class BlurredOps[Self <: Blurred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlurred(value: PostProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

