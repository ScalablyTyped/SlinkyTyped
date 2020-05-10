package typingsSlinky.dojo.dojox.highlight.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/languages/xml.html
  *
  *
  */
@js.native
trait xml_ extends js.Object {
  /**
    *
    */
  var XML_ATTR: js.Object = js.native
  /**
    *
    */
  var XML_COMMENT: js.Object = js.native
  /**
    *
    */
  var XML_VALUE: js.Object = js.native
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

object xml_ {
  @scala.inline
  def apply(
    XML_ATTR: js.Object,
    XML_COMMENT: js.Object,
    XML_VALUE: js.Object,
    case_insensitive: Boolean,
    defaultMode: js.Object,
    modes: js.Array[_]
  ): xml_ = {
    val __obj = js.Dynamic.literal(XML_ATTR = XML_ATTR.asInstanceOf[js.Any], XML_COMMENT = XML_COMMENT.asInstanceOf[js.Any], XML_VALUE = XML_VALUE.asInstanceOf[js.Any], case_insensitive = case_insensitive.asInstanceOf[js.Any], defaultMode = defaultMode.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any])
    __obj.asInstanceOf[xml_]
  }
  @scala.inline
  implicit class xml_Ops[Self <: xml_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXML_ATTR(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XML_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXML_COMMENT(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XML_COMMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXML_VALUE(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("XML_VALUE")(value.asInstanceOf[js.Any])
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

