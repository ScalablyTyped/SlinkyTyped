package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an event from range selection.
  * @see com.sun.star.sheet.XRangeSelectionListener
  * @see com.sun.star.sheet.XRangeSelectionChangeListener
  */
@js.native
trait RangeSelectionEvent extends EventObject {
  
  /** contains a textual representation of the selected range. */
  var RangeDescriptor: String = js.native
}
object RangeSelectionEvent {
  
  @scala.inline
  def apply(RangeDescriptor: String, Source: XInterface): RangeSelectionEvent = {
    val __obj = js.Dynamic.literal(RangeDescriptor = RangeDescriptor.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectionEvent]
  }
  
  @scala.inline
  implicit class RangeSelectionEventOps[Self <: RangeSelectionEvent] (val x: Self) extends AnyVal {
    
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
    def setRangeDescriptor(value: String): Self = this.set("RangeDescriptor", value.asInstanceOf[js.Any])
  }
}
