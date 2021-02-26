package typingsSlinky.nodeMysqlWrapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def EQUAL_TO_PROPERTY_SYMBOL: java.lang.String = typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("EQUAL_TO_PROPERTY_SYMBOL").asInstanceOf[java.lang.String]
  @scala.inline
  def EQUAL_TO_PROPERTY_SYMBOL_=(x: java.lang.String): scala.Unit = typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].updateDynamic("EQUAL_TO_PROPERTY_SYMBOL")(x.asInstanceOf[js.Any])
  
  type Map[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type PropertyChangedCallback = js.Function1[/* args */ typingsSlinky.nodeMysqlWrapper.mod.PropertyChangedArgs, js.Any]
  
  @scala.inline
  def TABLE_RULES_PROPERTY: java.lang.String = typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].selectDynamic("TABLE_RULES_PROPERTY").asInstanceOf[java.lang.String]
  @scala.inline
  def TABLE_RULES_PROPERTY_=(x: java.lang.String): scala.Unit = typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].updateDynamic("TABLE_RULES_PROPERTY")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): typingsSlinky.nodeMysqlWrapper.mod.Database = (typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMysqlWrapper.mod.Database]
  /** For meteor js only
    * Same as wrap but it's sync mode - autoconnect to the database without need to use database.ready(callback).
    */
  @scala.inline
  def connect(mysqlUrlOrObjectOrMysqlAlreadyConnection: typingsSlinky.mysql.mod.Connection, useTables: js.Any*): typingsSlinky.nodeMysqlWrapper.mod.Database = (typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMysqlWrapper.mod.Database]
  
  @scala.inline
  def observable[T](obj: T): T with typingsSlinky.nodeMysqlWrapper.mod.ObservableObject = typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("observable")(obj.asInstanceOf[js.Any]).asInstanceOf[T with typingsSlinky.nodeMysqlWrapper.mod.ObservableObject]
  
  @scala.inline
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: java.lang.String, useTables: js.Any*): typingsSlinky.nodeMysqlWrapper.mod.Database = (typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMysqlWrapper.mod.Database]
  @scala.inline
  def wrap(mysqlUrlOrObjectOrMysqlAlreadyConnection: typingsSlinky.mysql.mod.Connection, useTables: js.Any*): typingsSlinky.nodeMysqlWrapper.mod.Database = (typingsSlinky.nodeMysqlWrapper.mod.^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(mysqlUrlOrObjectOrMysqlAlreadyConnection.asInstanceOf[js.Any], useTables.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.nodeMysqlWrapper.mod.Database]
}
