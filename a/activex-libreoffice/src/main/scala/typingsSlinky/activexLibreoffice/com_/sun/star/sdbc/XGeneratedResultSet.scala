package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a result set which gives access to automatically generated values after a new row was inserted.
  *
  * The relative order of columns in the result set returned by {@link getGeneratedValues()} must be the same as the relative order of the same columns as
  * returned when executing a "SELECT * FROM table". This ensures that clients of this interface can reliably fetch the column values.
  * @see com.sun.star.sdbc.Statement
  * @see com.sun.star.sdbc.PreparedStatement
  * @since OOo 1.1.2
  */
@js.native
trait XGeneratedResultSet extends XInterface {
  
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  val GeneratedValues: XResultSet = js.native
  
  /**
    * gives access to automatically generated values after a new row was inserted.
    * @returns a result set that contains the data produced by the query
    * @throws SQLException if a database access error occurs.
    */
  def getGeneratedValues(): XResultSet = js.native
}
object XGeneratedResultSet {
  
  @scala.inline
  def apply(
    GeneratedValues: XResultSet,
    acquire: () => Unit,
    getGeneratedValues: () => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGeneratedResultSet = {
    val __obj = js.Dynamic.literal(GeneratedValues = GeneratedValues.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGeneratedValues = js.Any.fromFunction0(getGeneratedValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGeneratedResultSet]
  }
  
  @scala.inline
  implicit class XGeneratedResultSetOps[Self <: XGeneratedResultSet] (val x: Self) extends AnyVal {
    
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
    def setGeneratedValues(value: XResultSet): Self = this.set("GeneratedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGeneratedValues(value: () => XResultSet): Self = this.set("getGeneratedValues", js.Any.fromFunction0(value))
  }
}
