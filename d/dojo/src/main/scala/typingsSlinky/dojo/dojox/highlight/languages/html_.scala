package typingsSlinky.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/html.html
  *
  *
  */
@js.native
trait html_ extends js.Object {
  /**
    *
    */
  var HTML_ATTR: js.Object = js.native
  /**
    *
    */
  var HTML_DOCTYPE: js.Object = js.native
  /**
    *
    */
  var HTML_TAGS: js.Object = js.native
  /**
    *
    */
  var HTML_VALUE: js.Object = js.native
  /**
    *
    */
  var case_insensitive: Boolean = js.native
  /**
    *
    */
  var defaultMode: js.Object = js.native
  /**
    *
    */
  var modes: js.Array[_] = js.native
}

object html_ {
  @scala.inline
  def apply(
    HTML_ATTR: js.Object,
    HTML_DOCTYPE: js.Object,
    HTML_TAGS: js.Object,
    HTML_VALUE: js.Object,
    case_insensitive: Boolean,
    defaultMode: js.Object,
    modes: js.Array[_]
  ): html_ = {
    val __obj = js.Dynamic.literal(HTML_ATTR = HTML_ATTR.asInstanceOf[js.Any], HTML_DOCTYPE = HTML_DOCTYPE.asInstanceOf[js.Any], HTML_TAGS = HTML_TAGS.asInstanceOf[js.Any], HTML_VALUE = HTML_VALUE.asInstanceOf[js.Any], case_insensitive = case_insensitive.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[html_]
  }
  @scala.inline
  implicit class html_Ops[Self <: html_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTML_ATTR(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_DOCTYPE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_DOCTYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_TAGS(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_TAGS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHTML_VALUE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTML_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCase_insensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_insensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

