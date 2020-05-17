package typingsSlinky.makerJs.MakerJs.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for an XML tag.
  * @private
  */
@js.native
trait XmlTag extends js.Object {
  var attrs: IXmlTagAttrs = js.native
  /**
    * Text between the opening and closing tags.
    */
  var innerText: String = js.native
  /**
    * Boolean to indicate that the innerText has been escaped.
    */
  var innerTextEscaped: Boolean = js.native
  var name: String = js.native
  /**
    * Get the closing tag.
    */
  def getClosingTag(): String = js.native
  /**
    * Get the inner text.
    */
  def getInnerText(): String = js.native
  /**
    * Get the opening tag.
    *
    * @param selfClose Flag to determine if opening tag should be self closing.
    */
  def getOpeningTag(selfClose: Boolean): String = js.native
}

object XmlTag {
  @scala.inline
  def apply(
    attrs: IXmlTagAttrs,
    getClosingTag: () => String,
    getInnerText: () => String,
    getOpeningTag: Boolean => String,
    innerText: String,
    innerTextEscaped: Boolean,
    name: String
  ): XmlTag = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], getClosingTag = js.Any.fromFunction0(getClosingTag), getInnerText = js.Any.fromFunction0(getInnerText), getOpeningTag = js.Any.fromFunction1(getOpeningTag), innerText = innerText.asInstanceOf[js.Any], innerTextEscaped = innerTextEscaped.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlTag]
  }
  @scala.inline
  implicit class XmlTagOps[Self <: XmlTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrs(value: IXmlTagAttrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetClosingTag(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClosingTag")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInnerText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInnerText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOpeningTag(value: Boolean => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpeningTag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerTextEscaped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerTextEscaped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

