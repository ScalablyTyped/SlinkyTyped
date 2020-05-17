package typingsSlinky.activexLibreoffice.com_.sun.star.sdb.tools

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.XSingleSelectQueryComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates various useful functionality around a {@link com.sun.star.sdb.Connection}
  *
  * Most of the functionality provided here is meaningful only relative to a given database connection. For instance, for quoting table names, you need
  * the meta data instance of the connection. Thus, the entry point for obtaining a {@link XConnectionTools} instance is the {@link
  * com.sun.star.sdb.Connection} service.
  *
  * Note that nearly all functionality provided by this interface is also available by other means, it's only provided here for convenience purposes.
  * @since OOo 2.0.4
  */
@js.native
trait XConnectionTools extends js.Object {
  /** provides access to the application-level data source meta data */
  val DataSourceMetaData: XDataSourceMetaData = js.native
  /**
    * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  val ObjectNames: XObjectNames = js.native
  /**
    * creates an instance supporting the {@link XTableName} interface, which can be used to manipulate table names for various purposes.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  def createTableName(): XTableName = js.native
  /**
    * get the composer initialized with a command and command type.
    * @param commandType the type of the object
    * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
    * @returns the composer filled with command and command type.
    */
  def getComposer(commandType: Double, command: String): XSingleSelectQueryComposer = js.native
  /** provides access to the application-level data source meta data */
  def getDataSourceMetaData(): XDataSourceMetaData = js.native
  /**
    * get fields for a result set given by a "command descriptor"
    *
    * A command descriptor here means: a SDB-level connection ( {@link com.sun.star.sdb.Connection}a string specifying the name of an object relative to the
    * connectiona {@link com.sun.star.sdb.CommandType} value specifying the type of the object
    * @param commandType the type of the object
    * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
    * @param keepFieldsAlive If (and only if) {@link CommandType} is {@link CommandType.COMMAND} , the fields collection which is returned by this function
    * @returns the container of the columns (aka fields) of the object
    */
  def getFieldsByCommandDescriptor(commandType: Double, command: String, keepFieldsAlive: js.Array[XComponent]): XNameAccess = js.native
  /**
    * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
    *
    * The returned object is guaranteed to not be `NULL` .
    */
  def getObjectNames(): XObjectNames = js.native
}

object XConnectionTools {
  @scala.inline
  def apply(
    DataSourceMetaData: XDataSourceMetaData,
    ObjectNames: XObjectNames,
    createTableName: () => XTableName,
    getComposer: (Double, String) => XSingleSelectQueryComposer,
    getDataSourceMetaData: () => XDataSourceMetaData,
    getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
    getObjectNames: () => XObjectNames
  ): XConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = js.Any.fromFunction0(createTableName), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
    __obj.asInstanceOf[XConnectionTools]
  }
  @scala.inline
  implicit class XConnectionToolsOps[Self <: XConnectionTools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceMetaData(value: XDataSourceMetaData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSourceMetaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectNames(value: XObjectNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateTableName(value: () => XTableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTableName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetComposer(value: (Double, String) => XSingleSelectQueryComposer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComposer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDataSourceMetaData(value: () => XDataSourceMetaData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataSourceMetaData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFieldsByCommandDescriptor(value: (Double, String, js.Array[XComponent]) => XNameAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFieldsByCommandDescriptor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetObjectNames(value: () => XObjectNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getObjectNames")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

