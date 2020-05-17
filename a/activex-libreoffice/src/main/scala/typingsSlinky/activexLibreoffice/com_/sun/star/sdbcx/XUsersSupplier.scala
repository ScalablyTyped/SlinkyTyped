package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of users, typically used for a database definition object. */
@js.native
trait XUsersSupplier extends XInterface {
  /**
    * returns the container of users.
    * @returns the users
    */
  val Users: XNameAccess = js.native
  /**
    * returns the container of users.
    * @returns the users
    */
  def getUsers(): XNameAccess = js.native
}

object XUsersSupplier {
  @scala.inline
  def apply(
    Users: XNameAccess,
    acquire: () => Unit,
    getUsers: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUsersSupplier = {
    val __obj = js.Dynamic.literal(Users = Users.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUsers = js.Any.fromFunction0(getUsers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUsersSupplier]
  }
  @scala.inline
  implicit class XUsersSupplierOps[Self <: XUsersSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsers(value: XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUsers(value: () => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUsers")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

