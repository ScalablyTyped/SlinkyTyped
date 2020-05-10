package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofsidebarAction extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[Unit] = js.native
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: AnonTabIdWindowId): js.Promise[String] = js.native
  /** Gets the title of the sidebar action. */
  def getTitle(details: AnonTabIdWindowId): js.Promise[String] = js.native
  /** Checks whether the sidebar action is open. */
  def isOpen(details: AnonWindowIdNumber): js.Promise[Boolean] = js.native
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: AnonImageDataPath): js.Promise[Unit] = js.native
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: AnonPanel): js.Promise[Unit] = js.native
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: AnonWindowId): js.Promise[Unit] = js.native
}

object TypeofsidebarAction {
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    getPanel: AnonTabIdWindowId => js.Promise[String],
    getTitle: AnonTabIdWindowId => js.Promise[String],
    isOpen: AnonWindowIdNumber => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    setIcon: AnonImageDataPath => js.Promise[Unit],
    setPanel: AnonPanel => js.Promise[Unit],
    setTitle: AnonWindowId => js.Promise[Unit]
  ): TypeofsidebarAction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPanel = js.Any.fromFunction1(getPanel), getTitle = js.Any.fromFunction1(getTitle), isOpen = js.Any.fromFunction1(isOpen), open = js.Any.fromFunction0(open), setIcon = js.Any.fromFunction1(setIcon), setPanel = js.Any.fromFunction1(setPanel), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[TypeofsidebarAction]
  }
  @scala.inline
  implicit class TypeofsidebarActionOps[Self <: TypeofsidebarAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanel(value: AnonTabIdWindowId => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: AnonTabIdWindowId => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsOpen(value: AnonWindowIdNumber => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: AnonImageDataPath => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPanel(value: AnonPanel => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPanel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: AnonWindowId => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

