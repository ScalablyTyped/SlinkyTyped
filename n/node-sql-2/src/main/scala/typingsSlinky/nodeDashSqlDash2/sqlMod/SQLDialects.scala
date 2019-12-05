package typingsSlinky.nodeDashSqlDash2.sqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.mssql
  - typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.mysql
  - typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.oracle
  - typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.postgres
  - typings.nodeDashSqlDash2.nodeDashSqlDash2Strings.sqlite
*/
trait SQLDialects extends js.Object

object SQLDialects {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mssql: typingsSlinky.nodeDashSqlDash2.nodeDashSqlDash2Strings.mssql = this.cast("mssql")
  @scala.inline
  def mysql: typingsSlinky.nodeDashSqlDash2.nodeDashSqlDash2Strings.mysql = this.cast("mysql")
  @scala.inline
  def oracle: typingsSlinky.nodeDashSqlDash2.nodeDashSqlDash2Strings.oracle = this.cast("oracle")
  @scala.inline
  def postgres: typingsSlinky.nodeDashSqlDash2.nodeDashSqlDash2Strings.postgres = this.cast("postgres")
  @scala.inline
  def sqlite: typingsSlinky.nodeDashSqlDash2.nodeDashSqlDash2Strings.sqlite = this.cast("sqlite")
}

