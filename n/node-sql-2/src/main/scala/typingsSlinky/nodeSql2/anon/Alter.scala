package typingsSlinky.nodeSql2.anon

import typingsSlinky.nodeSql2.mod.AlterQuery
import typingsSlinky.nodeSql2.mod.CreateQuery
import typingsSlinky.nodeSql2.mod.DropQuery
import typingsSlinky.nodeSql2.mod.IndexQuery
import typingsSlinky.nodeSql2.mod.ModifyingQuery
import typingsSlinky.nodeSql2.mod.Query
import typingsSlinky.nodeSql2.mod.SQL
import typingsSlinky.nodeSql2.mod.SubQuery
import typingsSlinky.nodeSql2.mod.TableNode
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alter[T] extends js.Object {
  
  def alter(): AlterQuery[T] = js.native
  
  def as[OtherName /* <: String */](name: OtherName): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias node-sql-2.sql.Table<OtherName, T> */ js.Object = js.native
  
  var columns: js.Array[typingsSlinky.nodeSql2.mod.Column[Unit, Unit]] = js.native
  
  def create(): CreateQuery = js.native
  
  def drop(): DropQuery = js.native
  
  def from[U](statement: String): Query[U] = js.native
  def from[U](table: TableNode): Query[U] = js.native
  
  def getName(): String = js.native
  
  def getSchema(): String = js.native
  
  def indexes(): IndexQuery = js.native
  
  def insert(row: T): ModifyingQuery = js.native
  def insert(rows: js.Array[T]): ModifyingQuery = js.native
  
  def literal(statement: String): js.Any = js.native
  
  def select(): Query[T] = js.native
  def select[U](nodes: js.Any*): Query[U] = js.native
  
  var sql: SQL = js.native
  
  def star(): typingsSlinky.nodeSql2.mod.Column[Unit, Unit] = js.native
  
  def subQuery[U](): SubQuery[U] = js.native
  
  def update(o: Partial[T]): ModifyingQuery = js.native
}
