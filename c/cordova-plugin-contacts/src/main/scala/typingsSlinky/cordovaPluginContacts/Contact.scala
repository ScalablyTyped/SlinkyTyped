package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Contact object represents a user's contact. Contacts can be created, stored, or removed
  * from the device contacts database. Contacts can also be retrieved (individually or in bulk)
  * from the database by invoking the navigator.contacts.find method.
  */
@js.native
trait Contact extends ContactProperties {
  
  /**
    * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
    * @param onSuccess Success callback function invoked on success operation.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  
  /**
    * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
    * @param onSuccess Success callback function invoked on success operation with che Contact object.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def save(
    onSuccess: js.Function1[/* contact */ this.type, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}
object Contact {
  
  @scala.inline
  def apply(
    remove: (js.Function0[Unit], js.Function1[/* error */ js.Error, Unit]) => Unit,
    save: (js.Function1[Contact, Unit], js.Function1[/* error */ js.Error, Unit]) => Unit
  ): Contact = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), save = js.Any.fromFunction2(save))
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    
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
    def setRemove(value: (js.Function0[Unit], js.Function1[/* error */ js.Error, Unit]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSave(value: (js.Function1[Contact, Unit], js.Function1[/* error */ js.Error, Unit]) => Unit): Self = this.set("save", js.Any.fromFunction2(value))
  }
}
