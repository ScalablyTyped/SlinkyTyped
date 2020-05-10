package typingsSlinky.naverWhale.whale.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionPanel extends js.Object {
  /** Fired when the user switches away from the panel. */
  var onHidden: typingsSlinky.chrome.chrome.devtools.panels.PanelHiddenEvent = js.native
  /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
  var onSearch: typingsSlinky.chrome.chrome.devtools.panels.PanelSearchEvent = js.native
  /** Fired when the user switches to the panel. */
  var onShown: typingsSlinky.chrome.chrome.devtools.panels.PanelShownEvent = js.native
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def createStatusBarButton(iconPath: String, tooltipText: String, disabled: Boolean): typingsSlinky.chrome.chrome.devtools.panels.Button = js.native
}

object ExtensionPanel {
  @scala.inline
  def apply(
    createStatusBarButton: (String, String, Boolean) => typingsSlinky.chrome.chrome.devtools.panels.Button,
    onHidden: typingsSlinky.chrome.chrome.devtools.panels.PanelHiddenEvent,
    onSearch: typingsSlinky.chrome.chrome.devtools.panels.PanelSearchEvent,
    onShown: typingsSlinky.chrome.chrome.devtools.panels.PanelShownEvent
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(createStatusBarButton = js.Any.fromFunction3(createStatusBarButton), onHidden = onHidden.asInstanceOf[js.Any], onSearch = onSearch.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPanel]
  }
  @scala.inline
  implicit class ExtensionPanelOps[Self <: ExtensionPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateStatusBarButton(value: (String, String, Boolean) => typingsSlinky.chrome.chrome.devtools.panels.Button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createStatusBarButton")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnHidden(value: typingsSlinky.chrome.chrome.devtools.panels.PanelHiddenEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSearch(value: typingsSlinky.chrome.chrome.devtools.panels.PanelSearchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnShown(value: typingsSlinky.chrome.chrome.devtools.panels.PanelShownEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

