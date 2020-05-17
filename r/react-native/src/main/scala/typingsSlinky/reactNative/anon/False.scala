package typingsSlinky.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait False extends js.Object {
  var `false`: String = js.native
  var `true`: String = js.native
}

object False {
  @scala.inline
  def apply(`false`: String, `true`: String): False = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
  @scala.inline
  implicit class FalseOps[Self <: False] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFalse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("false")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("true")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

