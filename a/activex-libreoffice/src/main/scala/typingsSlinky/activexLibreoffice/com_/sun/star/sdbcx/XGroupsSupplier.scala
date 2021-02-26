package typingsSlinky.activexLibreoffice.com_.sun.star.sdbcx

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of groups, typically used for a database definition object. */
@js.native
trait XGroupsSupplier extends XInterface {
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  val Groups: XNameAccess = js.native
  
  /**
    * returns the container of groups.
    * @returns the groups
    */
  def getGroups(): XNameAccess = js.native
}
object XGroupsSupplier {
  
  @scala.inline
  def apply(
    Groups: XNameAccess,
    acquire: () => Unit,
    getGroups: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGroupsSupplier = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGroups = js.Any.fromFunction0(getGroups), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGroupsSupplier]
  }
  
  @scala.inline
  implicit class XGroupsSupplierMutableBuilder[Self <: XGroupsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGroups(value: () => XNameAccess): Self = StObject.set(x, "getGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroups(value: XNameAccess): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
  }
}
