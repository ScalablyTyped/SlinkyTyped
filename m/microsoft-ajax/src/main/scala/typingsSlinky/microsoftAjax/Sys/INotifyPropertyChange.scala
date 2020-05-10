package typingsSlinky.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the propertyChanged event.
  */
@js.native
trait INotifyPropertyChange extends js.Object {
  //#region Events
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def add_propertyChanged(handler: js.Function): Unit = js.native
  /**
    * Occurs when a component property is set to a new value.
    * @param handler
    *       The name of the event handler for the propertyChanged event.
    */
  def remove_propertyChanged(handler: js.Function): Unit = js.native
}

object INotifyPropertyChange {
  @scala.inline
  def apply(add_propertyChanged: js.Function => Unit, remove_propertyChanged: js.Function => Unit): INotifyPropertyChange = {
    val __obj = js.Dynamic.literal(add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged))
    __obj.asInstanceOf[INotifyPropertyChange]
  }
  @scala.inline
  implicit class INotifyPropertyChangeOps[Self <: INotifyPropertyChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_propertyChanged(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_propertyChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove_propertyChanged(value: js.Function => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove_propertyChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

