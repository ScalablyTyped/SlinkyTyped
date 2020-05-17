package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTLINK_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertLinkCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Contains the style settings defining the appearance of the target link element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines where to open the target link.
    */
  var target: String = js.native
  /**
    * Specifiies the text of the target link.
    */
  var text: String = js.native
  /**
    * Defines the title of the target link.
    */
  var title: String = js.native
  /**
    * Specifies the url of the page the target link goes to.
    */
  var url: String = js.native
}

object ASPxClientHtmlEditorInsertLinkCommandArguments {
  @scala.inline
  def apply(
    selectedElement: js.Any,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    target: String,
    text: String,
    title: String,
    url: String
  ): ASPxClientHtmlEditorInsertLinkCommandArguments = {
    val __obj = js.Dynamic.literal(selectedElement = selectedElement.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertLinkCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertLinkCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertLinkCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

