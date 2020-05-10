package typingsSlinky.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEdge extends js.Object {
  var edge: Boolean = js.native
  var mozilla: Boolean = js.native
  var msie: Boolean = js.native
  var opera: Boolean = js.native
  var safari: Boolean = js.native
  var version: String = js.native
  var webkit: Boolean = js.native
}

object AnonEdge {
  @scala.inline
  def apply(
    edge: Boolean,
    mozilla: Boolean,
    msie: Boolean,
    opera: Boolean,
    safari: Boolean,
    version: String,
    webkit: Boolean
  ): AnonEdge = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any], mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], opera = opera.asInstanceOf[js.Any], safari = safari.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdge]
  }
  @scala.inline
  implicit class AnonEdgeOps[Self <: AnonEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMozilla(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mozilla")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpera(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafari(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safari")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webkit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

