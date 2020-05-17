package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpageAction extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: TabIdNumber): js.Promise[String] = js.native
  /** Gets the title of the page action. */
  def getTitle(details: TabIdNumber): js.Promise[String] = js.native
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: Double): js.Promise[Unit] = js.native
  /** Checks whether the page action is shown. */
  def isShown(details: TabIdNumber): js.Promise[Boolean] = js.native
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: Path): js.Promise[Unit] = js.native
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: PopupTabId): Unit = js.native
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: TabIdTitle): Unit = js.native
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: Double): js.Promise[Unit] = js.native
}

object TypeofpageAction {
  @scala.inline
  def apply(
    getPopup: TabIdNumber => js.Promise[String],
    getTitle: TabIdNumber => js.Promise[String],
    hide: Double => js.Promise[Unit],
    isShown: TabIdNumber => js.Promise[Boolean],
    onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]],
    openPopup: () => js.Promise[Unit],
    setIcon: Path => js.Promise[Unit],
    setPopup: PopupTabId => Unit,
    setTitle: TabIdTitle => Unit,
    show: Double => js.Promise[Unit]
  ): TypeofpageAction = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction1(getPopup), getTitle = js.Any.fromFunction1(getTitle), hide = js.Any.fromFunction1(hide), isShown = js.Any.fromFunction1(isShown), onClicked = onClicked.asInstanceOf[js.Any], openPopup = js.Any.fromFunction0(openPopup), setIcon = js.Any.fromFunction1(setIcon), setPopup = js.Any.fromFunction1(setPopup), setTitle = js.Any.fromFunction1(setTitle), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[TypeofpageAction]
  }
  @scala.inline
  implicit class TypeofpageActionOps[Self <: TypeofpageAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPopup(value: TabIdNumber => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: TabIdNumber => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHide(value: Double => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsShown(value: TabIdNumber => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnClicked(value: WebExtEvent[js.Function1[/* tab */ Tab, Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenPopup(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPopup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: Path => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPopup(value: PopupTabId => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPopup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: TabIdTitle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: Double => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

