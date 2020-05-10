package typingsSlinky.dojo.dojox.highlight.languages.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/html.HTML_VALUE.html
  *
  *
  */
@js.native
trait HTML_VALUE extends js.Object {
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
  var end: String = js.native
}

object HTML_VALUE {
  @scala.inline
  def apply(begin: String, className: String, end: String): HTML_VALUE = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML_VALUE]
  }
  @scala.inline
  implicit class HTML_VALUEOps[Self <: HTML_VALUE] (val x: Self) extends AnyVal {
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
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

