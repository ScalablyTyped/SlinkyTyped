package typingsSlinky.flowdoc.Flow

import typingsSlinky.flowdoc.flowdocStrings.DIAMOND
import typingsSlinky.flowdoc.flowdocStrings.DOCUMENT
import typingsSlinky.flowdoc.flowdocStrings.ELLIPSE
import typingsSlinky.flowdoc.flowdocStrings.HOTSPOT
import typingsSlinky.flowdoc.flowdocStrings.IMAGE
import typingsSlinky.flowdoc.flowdocStrings.LAYER
import typingsSlinky.flowdoc.flowdocStrings.PAGE
import typingsSlinky.flowdoc.flowdocStrings.RECT
import typingsSlinky.flowdoc.flowdocStrings.SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var DIAMOND: typingsSlinky.flowdoc.flowdocStrings.DIAMOND = js.native
  var DOCUMENT: typingsSlinky.flowdoc.flowdocStrings.DOCUMENT = js.native
  var ELLIPSE: typingsSlinky.flowdoc.flowdocStrings.ELLIPSE = js.native
  var HOTSPOT: typingsSlinky.flowdoc.flowdocStrings.HOTSPOT = js.native
  var IMAGE: typingsSlinky.flowdoc.flowdocStrings.IMAGE = js.native
  var LAYER: typingsSlinky.flowdoc.flowdocStrings.LAYER = js.native
  var PAGE: typingsSlinky.flowdoc.flowdocStrings.PAGE = js.native
  var RECTANGLE: RECT = js.native
  var SCREEN: typingsSlinky.flowdoc.flowdocStrings.SCREEN = js.native
}

object Types {
  @scala.inline
  def apply(
    DIAMOND: DIAMOND,
    DOCUMENT: DOCUMENT,
    ELLIPSE: ELLIPSE,
    HOTSPOT: HOTSPOT,
    IMAGE: IMAGE,
    LAYER: LAYER,
    PAGE: PAGE,
    RECTANGLE: RECT,
    SCREEN: SCREEN
  ): Types = {
    val __obj = js.Dynamic.literal(DIAMOND = DIAMOND.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], ELLIPSE = ELLIPSE.asInstanceOf[js.Any], HOTSPOT = HOTSPOT.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LAYER = LAYER.asInstanceOf[js.Any], PAGE = PAGE.asInstanceOf[js.Any], RECTANGLE = RECTANGLE.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDIAMOND(value: DIAMOND): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIAMOND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT(value: DOCUMENT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withELLIPSE(value: ELLIPSE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELLIPSE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOTSPOT(value: HOTSPOT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOTSPOT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMAGE(value: IMAGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLAYER(value: LAYER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAYER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPAGE(value: PAGE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRECTANGLE(value: RECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RECTANGLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCREEN(value: SCREEN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCREEN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

