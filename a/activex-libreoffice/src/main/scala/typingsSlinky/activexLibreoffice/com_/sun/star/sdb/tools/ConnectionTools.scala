package typingsSlinky.activexLibreoffice.com_.sun.star.sdb.tools

import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.sdb.XSingleSelectQueryComposer
import typingsSlinky.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait ConnectionTools extends XConnectionTools {
  def createWithConnection(Connection: XConnection): Unit
}

object ConnectionTools {
  @scala.inline
  def apply(
    DataSourceMetaData: XDataSourceMetaData,
    ObjectNames: XObjectNames,
    createTableName: () => XTableName,
    createWithConnection: XConnection => Unit,
    getComposer: (Double, String) => XSingleSelectQueryComposer,
    getDataSourceMetaData: () => XDataSourceMetaData,
    getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
    getObjectNames: () => XObjectNames
  ): ConnectionTools = {
    val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = js.Any.fromFunction0(createTableName), createWithConnection = js.Any.fromFunction1(createWithConnection), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = js.Any.fromFunction0(getDataSourceMetaData), getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = js.Any.fromFunction0(getObjectNames))
    __obj.asInstanceOf[ConnectionTools]
  }
}

