package typingsSlinky.dojo.dojox.gfx.svgAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.xmlns.html
  *
  *
  */
@js.native
trait xmlns extends js.Object {
  /**
    *
    */
  var svg: String = js.native
  /**
    *
    */
  var xlink: String = js.native
}

object xmlns {
  @scala.inline
  def apply(svg: String, xlink: String): xmlns = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any], xlink = xlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[xmlns]
  }
  @scala.inline
  implicit class xmlnsOps[Self <: xmlns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSvg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXlink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlink")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

