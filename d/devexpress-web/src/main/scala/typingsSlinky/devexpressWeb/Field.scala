package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a field in the document.
  */
@js.native
trait Field extends js.Object {
  /**
    * Gets the text buffer interval occupied by the field code element.
    */
  val codeInterval: Interval = js.native
  /**
    * Gets or sets the name of a bookmark (or a hyperlink) in the current document which shall be the target of the hyperlink field.
    */
  val hyperlinkAnchor: String = js.native
  /**
    * Gets or sets the text for the tooltip displayed when the mouse hovers over a hyperlink field.
    */
  val hyperlinkTip: String = js.native
  /**
    * Gets or sets a URI to navigate to when the hyperlink (represented by the current field) is activated.
    */
  val hyperlinkUri: String = js.native
  /**
    * Gets the index of the field
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current field element.
    */
  val interval: Interval = js.native
  /**
    * Returns a value specifying whether the field is a hyperlink.
    */
  val isHyperlink: Boolean = js.native
  /**
    * Gets the field length in a document.
    */
  val length: Double = js.native
  /**
    * Gets the text buffer interval occupied by the field result element.
    */
  val resultInterval: Interval = js.native
  /**
    * Gets a value specifying whether a field's code or result is dispalyed.
    */
  val showCode: Boolean = js.native
  /**
    * Gets the field's start position in a document.
    */
  val start: Double = js.native
}

object Field {
  @scala.inline
  def apply(
    codeInterval: Interval,
    hyperlinkAnchor: String,
    hyperlinkTip: String,
    hyperlinkUri: String,
    index: Double,
    interval: Interval,
    isHyperlink: Boolean,
    length: Double,
    resultInterval: Interval,
    showCode: Boolean,
    start: Double
  ): Field = {
    val __obj = js.Dynamic.literal(codeInterval = codeInterval.asInstanceOf[js.Any], hyperlinkAnchor = hyperlinkAnchor.asInstanceOf[js.Any], hyperlinkTip = hyperlinkTip.asInstanceOf[js.Any], hyperlinkUri = hyperlinkUri.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], isHyperlink = isHyperlink.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], resultInterval = resultInterval.asInstanceOf[js.Any], showCode = showCode.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkAnchor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkTip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultInterval(value: Interval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

