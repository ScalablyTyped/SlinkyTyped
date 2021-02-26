package typingsSlinky.nodeSql2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typingsSlinky.nodeSql2.nodeSql2Strings.Columns with org.scalablytyped.runtime.TopLevel[T]
  
  type Table[Name /* <: java.lang.String */, T] = typingsSlinky.nodeSql2.mod.TableNode with typingsSlinky.nodeSql2.mod.Queryable[T] with typingsSlinky.nodeSql2.mod.Named[Name] with typingsSlinky.nodeSql2.mod.Columns[T] with typingsSlinky.nodeSql2.anon.Alter[T]
  
  @scala.inline
  def define[Name /* <: java.lang.String */, T](map: typingsSlinky.nodeSql2.mod.TableDefinition[Name, T]): typingsSlinky.nodeSql2.mod.Table[Name, T] = typingsSlinky.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("define")(map.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.nodeSql2.mod.Table[Name, T]]
  
  @scala.inline
  def setDialect(dialect: typingsSlinky.nodeSql2.mod.SQLDialects): scala.Unit = typingsSlinky.nodeSql2.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setDialect")(dialect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
