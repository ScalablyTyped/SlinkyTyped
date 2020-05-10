package typingsSlinky.dojo.dojox.highlight.languages.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.XML_ATTR.html
  *
  *
  */
@js.native
trait XML_ATTR extends js.Object {
  /**
    *
    */
  var begin: String = js.native
  /**
    *
    */
  var className: String = js.native
  /**
    *
    */
  var contains: js.Array[_] = js.native
  /**
    *
    */
  var end: String = js.native
}

object XML_ATTR {
  @scala.inline
  def apply(begin: String, className: String, contains: js.Array[_], end: String): XML_ATTR = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[XML_ATTR]
  }
  @scala.inline
  implicit class XML_ATTROps[Self <: XML_ATTR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBegin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

