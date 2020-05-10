package typingsSlinky.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonKeystrokeSequence extends js.Object {
  var keystrokeSequence: String = js.native
  var windows: String = js.native
}

object AnonKeystrokeSequence {
  @scala.inline
  def apply(keystrokeSequence: String, windows: String): AnonKeystrokeSequence = {
    val __obj = js.Dynamic.literal(keystrokeSequence = keystrokeSequence.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeystrokeSequence]
  }
  @scala.inline
  implicit class AnonKeystrokeSequenceOps[Self <: AnonKeystrokeSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeystrokeSequence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokeSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindows(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

