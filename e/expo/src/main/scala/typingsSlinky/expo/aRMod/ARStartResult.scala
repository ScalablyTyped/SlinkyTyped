package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARStartResult extends js.Object {
  var capturedImageTexture: Double = js.native
}

object ARStartResult {
  @scala.inline
  def apply(capturedImageTexture: Double): ARStartResult = {
    val __obj = js.Dynamic.literal(capturedImageTexture = capturedImageTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARStartResult]
  }
  @scala.inline
  implicit class ARStartResultOps[Self <: ARStartResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapturedImageTexture(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capturedImageTexture")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

