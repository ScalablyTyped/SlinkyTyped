package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLUniformLocation extends js.Object {
  var _currentState: js.Any = js.native
}

object WebGLUniformLocation {
  @scala.inline
  def apply(_currentState: js.Any): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(_currentState = _currentState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  @scala.inline
  implicit class WebGLUniformLocationOps[Self <: WebGLUniformLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

