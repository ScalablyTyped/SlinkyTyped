package typingsSlinky.reactNativeCustomTabs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animations extends js.Object {
  var endEnter: String = js.native
  var endExit: String = js.native
  var startEnter: String = js.native
  var startExit: String = js.native
}

object Animations {
  @scala.inline
  def apply(endEnter: String, endExit: String, startEnter: String, startExit: String): Animations = {
    val __obj = js.Dynamic.literal(endEnter = endEnter.asInstanceOf[js.Any], endExit = endExit.asInstanceOf[js.Any], startEnter = startEnter.asInstanceOf[js.Any], startExit = startExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  @scala.inline
  implicit class AnimationsOps[Self <: Animations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndExit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartExit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startExit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

