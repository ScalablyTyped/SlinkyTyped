package typingsSlinky.dojo.dojox.mobile.dh.PatternFileTypeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/PatternFileTypeMap.map.html
  *
  *
  */
@js.native
trait map extends js.Object {
  /**
    *
    */
  @JSName(".*.html")
  var DotAsteriskDothtml: String = js.native
  /**
    *
    */
  @JSName(".*.json")
  var DotAsteriskDotjson: String = js.native
}

object map {
  @scala.inline
  def apply(DotAsteriskDothtml: String, DotAsteriskDotjson: String): map = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".*.html")(DotAsteriskDothtml.asInstanceOf[js.Any])
    __obj.updateDynamic(".*.json")(DotAsteriskDotjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[map]
  }
  @scala.inline
  implicit class mapOps[Self <: map] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDotAsteriskDothtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".*.html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotAsteriskDotjson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(".*.json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

