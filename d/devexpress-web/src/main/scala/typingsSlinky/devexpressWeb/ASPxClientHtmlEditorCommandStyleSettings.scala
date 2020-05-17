package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains style settings related to media elements in ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorCommandStyleSettings extends js.Object {
  /**
    * Gets or sets a media element's background color.
    */
  var backgroundColor: String = js.native
  /**
    * Gets or sets a media element's border color.
    */
  var borderColor: String = js.native
  /**
    * Gets or sets a media element's border style.
    */
  var borderStyle: String = js.native
  /**
    * Gets or sets a media element's border width.
    */
  var borderWidth: String = js.native
  /**
    * Gets or sets a media element's CSS class name.
    */
  var className: String = js.native
  /**
    * Gets or sets an element's height.
    */
  var height: String = js.native
  /**
    * Gets or sets an element's bottom margin.
    */
  var marginBottom: String = js.native
  /**
    * Gets or sets an element's left margin.
    */
  var marginLeft: String = js.native
  /**
    * Gets or sets an element's right margin.
    */
  var marginRight: String = js.native
  /**
    * Gets or sets an element's top margin.
    */
  var marginTop: String = js.native
  /**
    * Gets or sets the element's text alignment.
    */
  var textAlign: String = js.native
  /**
    * Gets or sets the element's vertical alignment.
    */
  var verticalAlign: String = js.native
  /**
    * Gets or sets an element's width.
    */
  var width: String = js.native
}

object ASPxClientHtmlEditorCommandStyleSettings {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    borderStyle: String,
    borderWidth: String,
    className: String,
    height: String,
    marginBottom: String,
    marginLeft: String,
    marginRight: String,
    marginTop: String,
    textAlign: String,
    verticalAlign: String,
    width: String
  ): ASPxClientHtmlEditorCommandStyleSettings = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandStyleSettings]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorCommandStyleSettingsOps[Self <: ASPxClientHtmlEditorCommandStyleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

