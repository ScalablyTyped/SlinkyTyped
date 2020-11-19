package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the application-wide registered databases.
  *
  * This interface provides a mere wrapper around the respective configuration data, this way hiding the concrete configuration structure from its
  * clients. You should, if possible at all, use this interface, instead of modifying or querying the configuration data directly.
  * @since OOo 3.3
  */
@js.native
trait XDatabaseRegistrations extends js.Object {
  
  /** returns the names of all registered databases */
  val RegistrationNames: SafeArray[String] = js.native
  
  /** registers a listener which is notified of changes in the registered databases */
  def addDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): Unit = js.native
  
  /**
    * changes the location of a given database registration
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def changeDatabaseLocation(Name: String, NewLocation: String): Unit = js.native
  
  /**
    * returns the location of the database registered under the given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def getDatabaseLocation(Name: String): String = js.native
  
  /** returns the names of all registered databases */
  def getRegistrationNames(): SafeArray[String] = js.native
  
  /**
    * determines whether a database is registered under the given name.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    */
  def hasRegisteredDatabase(Name: String): Boolean = js.native
  
  /**
    * determines whether the registration data for a database given by name is read-only.
    *
    * In this case, attempts to revoke this registration will fail.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def isDatabaseRegistrationReadOnly(Name: String): Boolean = js.native
  
  /**
    * registers a database, given by location, under a given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::ElementExistException if there already is a databases registered under the given name.
    */
  def registerDatabaseLocation(Name: String, Location: String): Unit = js.native
  
  /** revokes a previously registered listener */
  def removeDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): Unit = js.native
  
  /**
    * revokes the registration of a database, given by name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def revokeDatabaseLocation(Name: String): Unit = js.native
}
object XDatabaseRegistrations {
  
  @scala.inline
  def apply(
    RegistrationNames: SafeArray[String],
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    changeDatabaseLocation: (String, String) => Unit,
    getDatabaseLocation: String => String,
    getRegistrationNames: () => SafeArray[String],
    hasRegisteredDatabase: String => Boolean,
    isDatabaseRegistrationReadOnly: String => Boolean,
    registerDatabaseLocation: (String, String) => Unit,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    revokeDatabaseLocation: String => Unit
  ): XDatabaseRegistrations = {
    val __obj = js.Dynamic.literal(RegistrationNames = RegistrationNames.asInstanceOf[js.Any], addDatabaseRegistrationsListener = js.Any.fromFunction1(addDatabaseRegistrationsListener), changeDatabaseLocation = js.Any.fromFunction2(changeDatabaseLocation), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getRegistrationNames = js.Any.fromFunction0(getRegistrationNames), hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), registerDatabaseLocation = js.Any.fromFunction2(registerDatabaseLocation), removeDatabaseRegistrationsListener = js.Any.fromFunction1(removeDatabaseRegistrationsListener), revokeDatabaseLocation = js.Any.fromFunction1(revokeDatabaseLocation))
    __obj.asInstanceOf[XDatabaseRegistrations]
  }
  
  @scala.inline
  implicit class XDatabaseRegistrationsOps[Self <: XDatabaseRegistrations] (val x: Self) extends AnyVal {
    
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
    def setRegistrationNames(value: SafeArray[String]): Self = this.set("RegistrationNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddDatabaseRegistrationsListener(value: XDatabaseRegistrationsListener => Unit): Self = this.set("addDatabaseRegistrationsListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeDatabaseLocation(value: (String, String) => Unit): Self = this.set("changeDatabaseLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDatabaseLocation(value: String => String): Self = this.set("getDatabaseLocation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRegistrationNames(value: () => SafeArray[String]): Self = this.set("getRegistrationNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasRegisteredDatabase(value: String => Boolean): Self = this.set("hasRegisteredDatabase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDatabaseRegistrationReadOnly(value: String => Boolean): Self = this.set("isDatabaseRegistrationReadOnly", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterDatabaseLocation(value: (String, String) => Unit): Self = this.set("registerDatabaseLocation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveDatabaseRegistrationsListener(value: XDatabaseRegistrationsListener => Unit): Self = this.set("removeDatabaseRegistrationsListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevokeDatabaseLocation(value: String => Unit): Self = this.set("revokeDatabaseLocation", js.Any.fromFunction1(value))
  }
}
