package typingsSlinky.dojo.dojox.mobile.dh.ContentTypeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/ContentTypeMap.map.html
  *
  *
  */
@js.native
trait map extends js.Object {
  /**
    *
    */
  var html: String = js.native
  /**
    *
    */
  var json: String = js.native
}

object map {
  @scala.inline
  def apply(html: String, json: String): map = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[map]
  }
  @scala.inline
  implicit class mapOps[Self <: map] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

