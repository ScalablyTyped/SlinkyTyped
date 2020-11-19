package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the text of a progress monitor.
  * @deprecated Deprecated
  */
@js.native
trait XProgressMonitor extends XProgressBar {
  
  /** adds a new text line to the control. */
  def addText(Topic: String, Text: String, beforeProgress: Boolean): Unit = js.native
  
  /** removes a text line from the control. */
  def removeText(Topic: String, beforeProgress: Boolean): Unit = js.native
  
  /** updates an existing text line at the control. */
  def updateText(Topic: String, Text: String, beforeProgress: Boolean): Unit = js.native
}
object XProgressMonitor {
  
  @scala.inline
  def apply(
    Value: Double,
    acquire: () => Unit,
    addText: (String, String, Boolean) => Unit,
    getValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeText: (String, Boolean) => Unit,
    setBackgroundColor: Color => Unit,
    setForegroundColor: Color => Unit,
    setRange: (Double, Double) => Unit,
    setValue: Double => Unit,
    updateText: (String, String, Boolean) => Unit
  ): XProgressMonitor = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addText = js.Any.fromFunction3(addText), getValue = js.Any.fromFunction0(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeText = js.Any.fromFunction2(removeText), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setForegroundColor = js.Any.fromFunction1(setForegroundColor), setRange = js.Any.fromFunction2(setRange), setValue = js.Any.fromFunction1(setValue), updateText = js.Any.fromFunction3(updateText))
    __obj.asInstanceOf[XProgressMonitor]
  }
  
  @scala.inline
  implicit class XProgressMonitorOps[Self <: XProgressMonitor] (val x: Self) extends AnyVal {
    
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
    def setAddText(value: (String, String, Boolean) => Unit): Self = this.set("addText", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveText(value: (String, Boolean) => Unit): Self = this.set("removeText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateText(value: (String, String, Boolean) => Unit): Self = this.set("updateText", js.Any.fromFunction3(value))
  }
}
