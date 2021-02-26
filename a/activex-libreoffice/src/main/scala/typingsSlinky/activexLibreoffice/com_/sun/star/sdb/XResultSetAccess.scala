package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the interface to create a {@link com.sun.star.sdbc.ResultSet} based on the object providing the interface. */
@js.native
trait XResultSetAccess extends XInterface {
  
  /**
    * returns a new {@link com.sun.star.sdbc.ResultSet} based on the object.
    * @returns the new created {@link ResultSet} object
    */
  def createResultSet(): XResultSet = js.native
}
object XResultSetAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createResultSet: () => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XResultSetAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createResultSet = js.Any.fromFunction0(createResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XResultSetAccess]
  }
  
  @scala.inline
  implicit class XResultSetAccessMutableBuilder[Self <: XResultSetAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateResultSet(value: () => XResultSet): Self = StObject.set(x, "createResultSet", js.Any.fromFunction0(value))
  }
}
