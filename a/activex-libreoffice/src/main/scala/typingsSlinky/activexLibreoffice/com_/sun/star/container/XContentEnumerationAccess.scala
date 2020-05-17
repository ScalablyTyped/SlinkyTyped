package typingsSlinky.activexLibreoffice.com_.sun.star.container

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows access to the collections of all content types within the object.
  *
  * This example prints the names of all tables:
  *
  * {{program example here, see documentation}}
  */
@js.native
trait XContentEnumerationAccess extends XInterface {
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  val AvailableServiceNames: SafeArray[String] = js.native
  /** @returns a new enumeration object for the contents of the specified service type. */
  def createContentEnumeration(aServiceName: String): XEnumeration = js.native
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  def getAvailableServiceNames(): SafeArray[String] = js.native
}

object XContentEnumerationAccess {
  @scala.inline
  def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentEnumerationAccess = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentEnumerationAccess]
  }
  @scala.inline
  implicit class XContentEnumerationAccessOps[Self <: XContentEnumerationAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailableServiceNames(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableServiceNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateContentEnumeration(value: String => XEnumeration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContentEnumeration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAvailableServiceNames(value: () => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAvailableServiceNames")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

