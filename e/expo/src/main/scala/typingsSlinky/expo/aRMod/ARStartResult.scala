package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARStartResult extends js.Object {
  var capturedImageTexture: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapturedImageTexture(value: Double): Self = this.set("capturedImageTexture", value.asInstanceOf[js.Any])
  }
  
}

