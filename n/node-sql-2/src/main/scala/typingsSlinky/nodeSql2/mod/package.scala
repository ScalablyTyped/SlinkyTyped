package typingsSlinky.nodeSql2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Columns[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Name in keyof T ]: node-sql-2.sql.Column<Name, T[Name]>}
    */ typingsSlinky.nodeSql2.nodeSql2Strings.Columns with T
  type Table[Name /* <: java.lang.String */, T] = typingsSlinky.nodeSql2.mod.TableNode with typingsSlinky.nodeSql2.mod.Queryable[T] with typingsSlinky.nodeSql2.mod.Named[Name] with typingsSlinky.nodeSql2.mod.Columns[T] with typingsSlinky.nodeSql2.AnonAlter[T]
}
