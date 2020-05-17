package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a trigger for an (user inter-)action.
  *
  * Common examples for such triggers are menu entries or toolbar icons.
  */
@js.native
trait ActionTrigger extends js.Object {
  /** contains the command URL for the menu entry. */
  var CommandURL: String = js.native
  /** contains the a URL that points to a help text. */
  var HelpURL: String = js.native
  /** contains the menu item image. */
  var Image: XBitmap = js.native
  /** contains a sub menu. */
  var SubContainer: XIndexContainer = js.native
  /** contains the text of the menu entry. */
  var Text: String = js.native
}

object ActionTrigger {
  @scala.inline
  def apply(CommandURL: String, HelpURL: String, Image: XBitmap, SubContainer: XIndexContainer, Text: String): ActionTrigger = {
    val __obj = js.Dynamic.literal(CommandURL = CommandURL.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], SubContainer = SubContainer.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTrigger]
  }
  @scala.inline
  implicit class ActionTriggerOps[Self <: ActionTrigger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: XBitmap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubContainer(value: XIndexContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

