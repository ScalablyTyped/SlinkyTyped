package typingsSlinky.firefoxWebextBrowser.browser.devtools.panels

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.panels types */
/** Represents the Elements panel. */
@js.native
trait ElementsPanel extends js.Object {
  /** Fired when an object is selected in the panel. */
  var onSelectionChanged: WebExtEvent[js.Function0[Unit]] = js.native
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    */
  def createSidebarPane(title: String): js.Promise[ExtensionSidebarPane] = js.native
}

object ElementsPanel {
  @scala.inline
  def apply(
    createSidebarPane: String => js.Promise[ExtensionSidebarPane],
    onSelectionChanged: WebExtEvent[js.Function0[Unit]]
  ): ElementsPanel = {
    val __obj = js.Dynamic.literal(createSidebarPane = js.Any.fromFunction1(createSidebarPane), onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsPanel]
  }
  @scala.inline
  implicit class ElementsPanelOps[Self <: ElementsPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSidebarPane(value: String => js.Promise[ExtensionSidebarPane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSidebarPane")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSelectionChanged(value: WebExtEvent[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

