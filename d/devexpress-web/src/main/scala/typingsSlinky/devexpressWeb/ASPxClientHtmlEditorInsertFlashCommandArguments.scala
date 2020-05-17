package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTFLASH_COMMAND command parameter.
  */
@js.native
trait ASPxClientHtmlEditorInsertFlashCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if the target flash element can be displayed in the fullscreen mode.
    */
  var allowFullscreen: Boolean = js.native
  /**
    * Determines if the target flash element will start playing automatically.
    */
  var autoPlay: Boolean = js.native
  /**
    * Determines if the flash related items are displayed in the context menu of the target flash element.
    */
  var enableFlashMenu: Boolean = js.native
  /**
    * Defines if the target flash element repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean = js.native
  /**
    * Defines the rendering quality level used for the target flash element.
    */
  var quality: String = js.native
}

object ASPxClientHtmlEditorInsertFlashCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    allowFullscreen: Boolean,
    autoPlay: Boolean,
    enableFlashMenu: Boolean,
    id: String,
    loop: Boolean,
    quality: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertFlashCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], allowFullscreen = allowFullscreen.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], enableFlashMenu = enableFlashMenu.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertFlashCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorInsertFlashCommandArgumentsOps[Self <: ASPxClientHtmlEditorInsertFlashCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableFlashMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableFlashMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

