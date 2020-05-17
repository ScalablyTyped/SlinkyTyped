package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to Deck
  * @since LibreOffice 5.1
  */
@js.native
trait XDeck extends js.Object {
  /** The deck identifier */
  val Id: String = js.native
  /** Get the ordering index of the deck button in sidebar */
  var OrderIndex: Double = js.native
  /** Panels collection attached to the deck */
  val Panels: XPanels = js.native
  /** Get the deck title string */
  var Title: String = js.native
  /**
    * Activate the deck and display its content
    * @param bActivate The requested state for the deck TRUE sets the deck as the active oneFALSE hide the deck and defaults to the first deck of the sidebar
    */
  def activate(bActivate: Boolean): Unit = js.native
  /** The deck identifier */
  def getId(): String = js.native
  /** Get the ordering index of the deck button in sidebar */
  def getOrderIndex(): Double = js.native
  /** Panels collection attached to the deck */
  def getPanels(): XPanels = js.native
  /** Get the deck title string */
  def getTitle(): String = js.native
  /** Is the deck the active one */
  def isActive(): Boolean = js.native
  /** Move deck one step down in the sidebar */
  def moveDown(): Unit = js.native
  /** Move deck button at first position in sidebar */
  def moveFirst(): Unit = js.native
  /** Move deck button at last position in sidebar */
  def moveLast(): Unit = js.native
  /** Move deck one step up in the sidebar */
  def moveUp(): Unit = js.native
  /**
    * Set the ordering index of the deck button in sidebar
    * @param newOrderIndex The new position
    */
  def setOrderIndex(newOrderIndex: Double): Unit = js.native
  /**
    * Set the deck title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit = js.native
}

object XDeck {
  @scala.inline
  def apply(
    Id: String,
    OrderIndex: Double,
    Panels: XPanels,
    Title: String,
    activate: Boolean => Unit,
    getId: () => String,
    getOrderIndex: () => Double,
    getPanels: () => XPanels,
    getTitle: () => String,
    isActive: () => Boolean,
    moveDown: () => Unit,
    moveFirst: () => Unit,
    moveLast: () => Unit,
    moveUp: () => Unit,
    setOrderIndex: Double => Unit,
    setTitle: String => Unit
  ): XDeck = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Panels = Panels.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], activate = js.Any.fromFunction1(activate), getId = js.Any.fromFunction0(getId), getOrderIndex = js.Any.fromFunction0(getOrderIndex), getPanels = js.Any.fromFunction0(getPanels), getTitle = js.Any.fromFunction0(getTitle), isActive = js.Any.fromFunction0(isActive), moveDown = js.Any.fromFunction0(moveDown), moveFirst = js.Any.fromFunction0(moveFirst), moveLast = js.Any.fromFunction0(moveLast), moveUp = js.Any.fromFunction0(moveUp), setOrderIndex = js.Any.fromFunction1(setOrderIndex), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XDeck]
  }
  @scala.inline
  implicit class XDeckOps[Self <: XDeck] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrderIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanels(value: XPanels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Panels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivate(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOrderIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOrderIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPanels(value: () => XPanels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPanels")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveDown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveLast(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMoveUp(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetOrderIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOrderIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

