package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to register for action events of an image button and sets the action command. */
@js.native
trait XImageButton extends XInterface {
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit = js.native
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit = js.native
  
  /** sets the action command string. */
  def setActionCommand(Command: String): Unit = js.native
}
object XImageButton {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActionListener: XActionListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionListener: XActionListener => Unit,
    setActionCommand: String => Unit
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), setActionCommand = js.Any.fromFunction1(setActionCommand))
    __obj.asInstanceOf[XImageButton]
  }
  
  @scala.inline
  implicit class XImageButtonOps[Self <: XImageButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddActionListener(value: XActionListener => Unit): Self = this.set("addActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActionListener(value: XActionListener => Unit): Self = this.set("removeActionListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActionCommand(value: String => Unit): Self = this.set("setActionCommand", js.Any.fromFunction1(value))
  }
}
