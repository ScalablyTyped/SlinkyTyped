package typingsSlinky.dojo.dojox.mobile.bidi.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/common.MARK.html
  *
  *
  */
@js.native
trait MARK extends js.Object {
  /**
    *
    */
  var LRE: String = js.native
  /**
    *
    */
  var PDF: String = js.native
  /**
    *
    */
  var RLE: String = js.native
}

object MARK {
  @scala.inline
  def apply(LRE: String, PDF: String, RLE: String): MARK = {
    val __obj = js.Dynamic.literal(LRE = LRE.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], RLE = RLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[MARK]
  }
  @scala.inline
  implicit class MARKOps[Self <: MARK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLRE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LRE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

