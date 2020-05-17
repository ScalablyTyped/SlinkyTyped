package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an item in a status bar
  * @see com.sun.star.frame.XStatusbarController
  * @since LibreOffice 4.1
  */
@js.native
trait XStatusbarItem extends js.Object {
  /** the accessible name of the status bar item */
  var AccessibleName: String = js.native
  /** the command of the status bar item */
  var Command: String = js.native
  /** the help text of the status bar item when extended help tips are on */
  var HelpText: String = js.native
  /** the unique ID of the control within the status bar */
  var ItemId: Double = js.native
  /**
    * the rectangle on the status bar device onto which the item is drawn
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  var ItemRect: Rectangle = js.native
  /** the offset between this status bar item and the following */
  var Offset: Double = js.native
  /** the help text of the status bar item when help tips are on */
  var QuickHelpText: String = js.native
  /**
    * the style of the status bar item
    *
    * The following values apply for a status bar item:
    *
    * Alignment {@link com.sun.star.ui.ItemStyle.ALIGN_LEFT}{@link com.sun.star.ui.ItemStyle.ALIGN_CENTER}{@link
    * com.sun.star.ui.ItemStyle.ALIGN_RIGHT}Drawing {@link com.sun.star.ui.ItemStyle.DRAW_OUT3D}{@link com.sun.star.ui.ItemStyle.DRAW_IN3D}{@link
    * com.sun.star.ui.ItemStyle.DRAW_FLAT}{@link com.sun.star.ui.ItemStyle.AUTO_SIZE}{@link com.sun.star.ui.ItemStyle.OWNER_DRAW}
    * @see com.sun.star.ui.ItemStyle
    */
  var Style: Double = js.native
  /** the text of status bar item */
  var Text: String = js.native
  /** whether the item is visible or not */
  var Visible: Boolean = js.native
  /** the width of the status bar item */
  var Width: Double = js.native
  /**
    * forces repainting the item onto the status bar device
    * @see com.sun.star.frame.XStatusbarController.paint()
    */
  def repaint(): Unit = js.native
}

object XStatusbarItem {
  @scala.inline
  def apply(
    AccessibleName: String,
    Command: String,
    HelpText: String,
    ItemId: Double,
    ItemRect: Rectangle,
    Offset: Double,
    QuickHelpText: String,
    Style: Double,
    Text: String,
    Visible: Boolean,
    Width: Double,
    repaint: () => Unit
  ): XStatusbarItem = {
    val __obj = js.Dynamic.literal(AccessibleName = AccessibleName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], ItemId = ItemId.asInstanceOf[js.Any], ItemRect = ItemRect.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], QuickHelpText = QuickHelpText.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint))
    __obj.asInstanceOf[XStatusbarItem]
  }
  @scala.inline
  implicit class XStatusbarItemOps[Self <: XStatusbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessibleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemRect(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemRect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuickHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuickHelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepaint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

