package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the collection of members of a data pilot source level.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  */
@js.native
trait XMembersSupplier extends XInterface {
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  val Members: XMembersAccess = js.native
  /**
    * returns the collection of members.
    * @see com.sun.star.sheet.DataPilotSourceMembers
    */
  def getMembers(): XMembersAccess = js.native
}

object XMembersSupplier {
  @scala.inline
  def apply(
    Members: XMembersAccess,
    acquire: () => Unit,
    getMembers: () => XMembersAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMembersSupplier = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMembers = js.Any.fromFunction0(getMembers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMembersSupplier]
  }
  @scala.inline
  implicit class XMembersSupplierOps[Self <: XMembersSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMembers(value: XMembersAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMembers(value: () => XMembersAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMembers")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

