package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for the standard mapping for a SQL structured type.
  *
  * A `Struct` object contains a value for each attribute of the SQL structured type that it represents. By default, an instance of `Struct` is valid as
  * long as the application has a reference to it.
  */
@js.native
trait XStruct extends XInterface {
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  val SQLTypeName: String = js.native
  /**
    * produces the ordered values of the attributes of the SQL structured type that this `Struct` object represents.
    *
    * This method uses the given type map for customizations of the type mappings. If there is no entry in the given type map that matches or the given type
    * map is `NULL` , the structured type that this `Struct` object represents, the driver uses the connection type mapping.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing the ordered attribute values.
    * @throws SQLException if a database access error occurs.
    */
  def getAttributes(typeMap: XNameAccess): SafeArray[_] = js.native
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  def getSQLTypeName(): String = js.native
}

object XStruct {
  @scala.inline
  def apply(
    SQLTypeName: String,
    acquire: () => Unit,
    getAttributes: XNameAccess => SafeArray[_],
    getSQLTypeName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStruct = {
    val __obj = js.Dynamic.literal(SQLTypeName = SQLTypeName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAttributes = js.Any.fromFunction1(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStruct]
  }
  @scala.inline
  implicit class XStructOps[Self <: XStruct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSQLTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQLTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAttributes(value: XNameAccess => SafeArray[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSQLTypeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSQLTypeName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

