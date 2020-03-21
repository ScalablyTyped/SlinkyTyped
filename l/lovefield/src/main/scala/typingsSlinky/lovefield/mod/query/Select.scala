package typingsSlinky.lovefield.mod.query

import typingsSlinky.lovefield.mod.Binder
import typingsSlinky.lovefield.mod.Order
import typingsSlinky.lovefield.mod.Predicate
import typingsSlinky.lovefield.mod.schema.Column
import typingsSlinky.lovefield.mod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Builder {
  def from(tables: Table*): Select = js.native
  def groupBy(columns: Column*): Select = js.native
  def innerJoin(table: Table, predicate: Predicate): Select = js.native
  def leftOuterJoin(table: Table, predicate: Predicate): Select = js.native
  def limit(numberOfRows: Double): Select = js.native
  def limit(numberOfRows: Binder): Select = js.native
  def orderBy(column: Column): Select = js.native
  def orderBy(column: Column, order: Order): Select = js.native
  def skip(numberOfRows: Double): Select = js.native
  def skip(numberOfRows: Binder): Select = js.native
  def where(predicate: Predicate): Select = js.native
}

