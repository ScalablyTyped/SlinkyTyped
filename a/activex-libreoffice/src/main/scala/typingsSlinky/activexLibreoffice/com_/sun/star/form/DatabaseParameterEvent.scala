package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is fired if values for parameters are needed. */
@js.native
trait DatabaseParameterEvent extends EventObject {
  
  /**
    * specifies the list of parameters which are required for opening a result set.
    *
    * Usually, a {@link com.sun.star.form.component.DataForm} fires this event when loading the form requires parameters to be filled in.
    *
    * Every parameter object supports the {@link com.sun.star.beans.XPropertySet} interface, and at least the properties **Name** and **Value**
    * @see com.sun.star.sdb.RowSet
    * @see com.sun.star.form.component.DataForm
    */
  var Parameters: XIndexAccess = js.native
}
object DatabaseParameterEvent {
  
  @scala.inline
  def apply(Parameters: XIndexAccess, Source: XInterface): DatabaseParameterEvent = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseParameterEvent]
  }
  
  @scala.inline
  implicit class DatabaseParameterEventOps[Self <: DatabaseParameterEvent] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: XIndexAccess): Self = this.set("Parameters", value.asInstanceOf[js.Any])
  }
}
