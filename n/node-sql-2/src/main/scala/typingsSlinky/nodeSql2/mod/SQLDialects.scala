package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeSql2.nodeSql2Strings.mssql
  - typingsSlinky.nodeSql2.nodeSql2Strings.mysql
  - typingsSlinky.nodeSql2.nodeSql2Strings.oracle
  - typingsSlinky.nodeSql2.nodeSql2Strings.postgres
  - typingsSlinky.nodeSql2.nodeSql2Strings.sqlite
*/
trait SQLDialects extends js.Object

object SQLDialects {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mssql: typingsSlinky.nodeSql2.nodeSql2Strings.mssql = this.cast("mssql")
  @scala.inline
  def mysql: typingsSlinky.nodeSql2.nodeSql2Strings.mysql = this.cast("mysql")
  @scala.inline
  def oracle: typingsSlinky.nodeSql2.nodeSql2Strings.oracle = this.cast("oracle")
  @scala.inline
  def postgres: typingsSlinky.nodeSql2.nodeSql2Strings.postgres = this.cast("postgres")
  @scala.inline
  def sqlite: typingsSlinky.nodeSql2.nodeSql2Strings.sqlite = this.cast("sqlite")
}

