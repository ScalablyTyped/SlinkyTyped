package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.vectorFontFitting.html
  *
  *
  */
@js.native
trait vectorFontFitting extends js.Object {
  /**
    *
    */
  var FIT: Double = js.native
  /**
    *
    */
  var FLOW: Double = js.native
  /**
    *
    */
  var NONE: Double = js.native
}

object vectorFontFitting {
  @scala.inline
  def apply(FIT: Double, FLOW: Double, NONE: Double): vectorFontFitting = {
    val __obj = js.Dynamic.literal(FIT = FIT.asInstanceOf[js.Any], FLOW = FLOW.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any])
    __obj.asInstanceOf[vectorFontFitting]
  }
  @scala.inline
  implicit class vectorFontFittingOps[Self <: vectorFontFitting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFIT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFLOW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FLOW")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

