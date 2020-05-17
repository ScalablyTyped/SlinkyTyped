package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of the sidebar
  * @since LibreOffice 5.1
  */
@js.native
trait XSidebarProvider extends XInterface {
  val Decks: XDecks = js.native
  /** Get the XFrame owner */
  val Frame: XFrame = js.native
  /** Returns the sidebar object */
  val Sidebar: XSidebar = js.native
  def getDecks(): XDecks = js.native
  /** Get the XFrame owner */
  def getFrame(): XFrame = js.native
  /** Returns the sidebar object */
  def getSidebar(): XSidebar = js.native
  /** Is the sidebar visible */
  def isVisible(): Boolean = js.native
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: Boolean): Unit = js.native
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: Boolean): Unit = js.native
}

object XSidebarProvider {
  @scala.inline
  def apply(
    Decks: XDecks,
    Frame: XFrame,
    Sidebar: XSidebar,
    acquire: () => Unit,
    getDecks: () => XDecks,
    getFrame: () => XFrame,
    getSidebar: () => XSidebar,
    isVisible: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setVisible: Boolean => Unit,
    showDecks: Boolean => Unit
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal(Decks = Decks.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDecks = js.Any.fromFunction0(getDecks), getFrame = js.Any.fromFunction0(getFrame), getSidebar = js.Any.fromFunction0(getSidebar), isVisible = js.Any.fromFunction0(isVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVisible = js.Any.fromFunction1(setVisible), showDecks = js.Any.fromFunction1(showDecks))
    __obj.asInstanceOf[XSidebarProvider]
  }
  @scala.inline
  implicit class XSidebarProviderOps[Self <: XSidebarProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecks(value: XDecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: XFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebar(value: XSidebar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetDecks(value: () => XDecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFrame(value: () => XFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSidebar(value: () => XSidebar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSidebar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetVisible(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVisible")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowDecks(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDecks")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

