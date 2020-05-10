package typingsSlinky.dojo.dojo.dnd.autoscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll._validNodes.html
  *
  *
  */
@js.native
trait validNodes extends js.Object {
  /**
    *
    */
  var div: Double = js.native
  /**
    *
    */
  var p: Double = js.native
  /**
    *
    */
  var td: Double = js.native
}

object validNodes {
  @scala.inline
  def apply(div: Double, p: Double, td: Double): validNodes = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any])
    __obj.asInstanceOf[validNodes]
  }
  @scala.inline
  implicit class validNodesOps[Self <: validNodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("td")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

