package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAppBehavior extends js.Object {
  @JSName("MSHTML.HTMLAppBehavior_typekey")
  var MSHTMLDotHTMLAppBehavior_typekey: HTMLAppBehavior = js.native
  var applicationName: String = js.native
  var border: String = js.native
  var borderStyle: String = js.native
  var caption: String = js.native
  val commandLine: String = js.native
  var contextMenu: String = js.native
  var icon: String = js.native
  var innerBorder: String = js.native
  var maximizeButton: String = js.native
  var minimizeButton: String = js.native
  var scroll: String = js.native
  var scrollFlat: String = js.native
  var selection: String = js.native
  var showInTaskBar: String = js.native
  var singleInstance: String = js.native
  var sysMenu: String = js.native
  var version: String = js.native
  var windowState: String = js.native
}

object HTMLAppBehavior {
  @scala.inline
  def apply(
    MSHTMLDotHTMLAppBehavior_typekey: HTMLAppBehavior,
    applicationName: String,
    border: String,
    borderStyle: String,
    caption: String,
    commandLine: String,
    contextMenu: String,
    icon: String,
    innerBorder: String,
    maximizeButton: String,
    minimizeButton: String,
    scroll: String,
    scrollFlat: String,
    selection: String,
    showInTaskBar: String,
    singleInstance: String,
    sysMenu: String,
    version: String,
    windowState: String
  ): HTMLAppBehavior = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], borderStyle = borderStyle.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], commandLine = commandLine.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], innerBorder = innerBorder.asInstanceOf[js.Any], maximizeButton = maximizeButton.asInstanceOf[js.Any], minimizeButton = minimizeButton.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], scrollFlat = scrollFlat.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], showInTaskBar = showInTaskBar.asInstanceOf[js.Any], singleInstance = singleInstance.asInstanceOf[js.Any], sysMenu = sysMenu.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowState = windowState.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLAppBehavior_typekey")(MSHTMLDotHTMLAppBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAppBehavior]
  }
  @scala.inline
  implicit class HTMLAppBehaviorOps[Self <: HTMLAppBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLAppBehavior_typekey(value: HTMLAppBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLAppBehavior_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximizeButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximizeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimizeButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimizeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollFlat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollFlat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowInTaskBar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInTaskBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSysMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windowState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

