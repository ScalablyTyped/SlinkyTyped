package typingsSlinky.dojo.dojo.dnd.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/common._defaultCreatorNodes.html
  *
  *
  */
@js.native
trait defaultCreatorNodes extends js.Object {
  /**
    *
    */
  var div: String = js.native
  /**
    *
    */
  var ol: String = js.native
  /**
    *
    */
  var p: String = js.native
  /**
    *
    */
  var ul: String = js.native
}

object defaultCreatorNodes {
  @scala.inline
  def apply(div: String, ol: String, p: String, ul: String): defaultCreatorNodes = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultCreatorNodes]
  }
  @scala.inline
  implicit class defaultCreatorNodesOps[Self <: defaultCreatorNodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ul")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

