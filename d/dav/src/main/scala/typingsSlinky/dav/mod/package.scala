package typingsSlinky.dav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.dav.davStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  @scala.inline
  def createAccount(options: typingsSlinky.dav.mod.CreateAccountOptions): js.Promise[typingsSlinky.dav.mod.Account] = typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.dav.mod.Account]]
  
  @scala.inline
  def createCalendarObject(
    calendar: typingsSlinky.dav.mod.Calendar,
    options: typingsSlinky.dav.mod.CreateCalendarObjectOptions
  ): js.Promise[typingsSlinky.dav.mod.CalendarObject] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCalendarObject")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.CalendarObject]]
  
  @scala.inline
  def createCard(addressBook: typingsSlinky.dav.mod.AddressBook, options: typingsSlinky.dav.mod.CreateCardOptions): js.Promise[typingsSlinky.dav.mod.AddressBook] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCard")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.AddressBook]]
  
  @scala.inline
  def createSandbox(): typingsSlinky.dav.mod.Sandbox = typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSandbox")().asInstanceOf[typingsSlinky.dav.mod.Sandbox]
  
  @scala.inline
  def deleteCalendarObject(
    calendarObject: typingsSlinky.dav.mod.CalendarObject,
    options: typingsSlinky.dav.mod.DeleteCalendarObjectOptions
  ): js.Promise[typingsSlinky.dav.mod.CalendarObject] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.CalendarObject]]
  
  @scala.inline
  def deleteCard(card: typingsSlinky.dav.mod.VCard, options: typingsSlinky.dav.mod.DeleteCardOptions): js.Promise[typingsSlinky.dav.mod.VCard] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.VCard]]
  
  @scala.inline
  def syncAddressBook(
    addressBook: typingsSlinky.dav.mod.AddressBook,
    options: typingsSlinky.dav.mod.SyncAddressBookOptions
  ): js.Promise[typingsSlinky.dav.mod.AddressBook] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncAddressBook")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.AddressBook]]
  
  @scala.inline
  def syncCaldavAccount(account: typingsSlinky.dav.mod.Account, options: typingsSlinky.dav.mod.SyncCaldavAccountOptions): js.Promise[typingsSlinky.dav.mod.Account] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCaldavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.Account]]
  
  @scala.inline
  def syncCalendar(calendar: typingsSlinky.dav.mod.Calendar, options: typingsSlinky.dav.mod.SyncCalendarOptions): js.Promise[typingsSlinky.dav.mod.Calendar] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCalendar")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.Calendar]]
  
  @scala.inline
  def syncCarddavAccount(account: typingsSlinky.dav.mod.Account, options: typingsSlinky.dav.mod.SyncCarddavAccountOptions): js.Promise[typingsSlinky.dav.mod.Account] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCarddavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.Account]]
  
  @scala.inline
  def updateCalendarObject(
    calendarObject: typingsSlinky.dav.mod.CalendarObject,
    options: typingsSlinky.dav.mod.UpdateCalendarObjectOptions
  ): js.Promise[typingsSlinky.dav.mod.CalendarObject] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.CalendarObject]]
  
  @scala.inline
  def updateCard(card: typingsSlinky.dav.mod.VCard, options: typingsSlinky.dav.mod.UpdateCardOptions): js.Promise[typingsSlinky.dav.mod.VCard] = (typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.dav.mod.VCard]]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typingsSlinky.dav.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
