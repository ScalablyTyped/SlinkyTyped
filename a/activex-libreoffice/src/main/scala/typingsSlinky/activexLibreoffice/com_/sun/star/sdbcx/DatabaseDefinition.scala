package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * could be used as an extension for performing data definition tasks on databases, and to control the access rights on database objects.
  *
  * It may be implemented by a database driver provider, to encapsulate the complexity of data definition, and to give a common way for data definition as
  * the DDL of most DBMS differs.
  *
  * At least, the access to the tables of a database should be implemented. The implementation of other known database objects like views is optional.
  *
  * To control the access rights of users, there is the possibility to implement objects like users and groups.
  */
@js.native
trait DatabaseDefinition
  extends XTablesSupplier
     with XViewsSupplier
     with XUsersSupplier
     with XGroupsSupplier
object DatabaseDefinition {
  
  @scala.inline
  def apply(
    Groups: XNameAccess,
    Tables: XNameAccess,
    Users: XNameAccess,
    Views: XNameAccess,
    acquire: () => Unit,
    getGroups: () => XNameAccess,
    getTables: () => XNameAccess,
    getUsers: () => XNameAccess,
    getViews: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DatabaseDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], Tables = Tables.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any], Views = Views.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), getTables = js.Any.fromFunction0(getTables), getUsers = js.Any.fromFunction0(getUsers), getViews = js.Any.fromFunction0(getViews), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DatabaseDefinition]
  }
}
