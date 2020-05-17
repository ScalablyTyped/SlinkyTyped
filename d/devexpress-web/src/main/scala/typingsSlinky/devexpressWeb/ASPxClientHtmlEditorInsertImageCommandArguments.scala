package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertImageCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target image.
    */
  var align: String = js.native
  /**
    * Creates an alternate text for the target image.
    */
  var alt: String = js.native
  /**
    * Specifies the source of the target image.
    */
  var src: String = js.native
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings = js.native
  /**
    * Determines if the target image is wrapped with text.
    */
  var useFloat: Boolean = js.native
}

object ASPxClientHtmlEditorInsertImageCommandArguments {
  @scala.inline
  def apply(
    align: String,
    alt: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    useFloat: Boolean
  ): ASPxClientHtmlEditorInsertImageCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], useFloat = useFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertImageCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertImageCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertImageCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleSettings(value: ASPxClientHtmlEditorCommandStyleSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFloat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

