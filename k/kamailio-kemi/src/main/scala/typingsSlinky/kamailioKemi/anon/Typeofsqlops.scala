package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsqlops extends js.Object {
  def sql_is_null(sres: String, i: Double, j: Double): Double = js.native
  def sql_num_columns(sres: String): Double = js.native
  def sql_num_rows(sres: String): Double = js.native
  def sql_query(scon: String, squery: String, sres: String): Double = js.native
  def sql_query_async(scon: String, squery: String): Double = js.native
  def sql_result_free(sres: String): Double = js.native
  def sql_xquery(scon: String, squery: String, xavp: String): Double = js.native
}

object Typeofsqlops {
  @scala.inline
  def apply(
    sql_is_null: (String, Double, Double) => Double,
    sql_num_columns: String => Double,
    sql_num_rows: String => Double,
    sql_query: (String, String, String) => Double,
    sql_query_async: (String, String) => Double,
    sql_result_free: String => Double,
    sql_xquery: (String, String, String) => Double
  ): Typeofsqlops = {
    val __obj = js.Dynamic.literal(sql_is_null = js.Any.fromFunction3(sql_is_null), sql_num_columns = js.Any.fromFunction1(sql_num_columns), sql_num_rows = js.Any.fromFunction1(sql_num_rows), sql_query = js.Any.fromFunction3(sql_query), sql_query_async = js.Any.fromFunction2(sql_query_async), sql_result_free = js.Any.fromFunction1(sql_result_free), sql_xquery = js.Any.fromFunction3(sql_xquery))
    __obj.asInstanceOf[Typeofsqlops]
  }
  @scala.inline
  implicit class TypeofsqlopsOps[Self <: Typeofsqlops] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSql_is_null(value: (String, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_is_null")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSql_num_columns(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_num_columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSql_num_rows(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_num_rows")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSql_query(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_query")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSql_query_async(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_query_async")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSql_result_free(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_result_free")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSql_xquery(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql_xquery")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

