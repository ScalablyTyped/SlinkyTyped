package typingsSlinky.angularMaterial.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FADE extends js.Object {
  var FADE: String = js.native
  var SCALE: String = js.native
  var SLIDE: String = js.native
}

object FADE {
  @scala.inline
  def apply(FADE: String, SCALE: String, SLIDE: String): FADE = {
    val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any], SLIDE = SLIDE.asInstanceOf[js.Any])
    __obj.asInstanceOf[FADE]
  }
  @scala.inline
  implicit class FADEOps[Self <: FADE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFADE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FADE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCALE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCALE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSLIDE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SLIDE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

