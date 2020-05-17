package typingsSlinky.pgPromise.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.pgPromise.mod.errors.ParameterizedQueryError
import typingsSlinky.pgPromise.mod.errors.PreparedStatementError
import typingsSlinky.pgPromise.mod.errors.QueryFileError
import typingsSlinky.pgPromise.mod.errors.QueryResultError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoferrors extends js.Object {
  // ParameterizedQueryError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.ParameterizedQueryError.html
  var ParameterizedQueryError: Instantiable0[typingsSlinky.pgPromise.mod.errors.ParameterizedQueryError] = js.native
  // PreparedStatementError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.PreparedStatementError.html
  var PreparedStatementError: Instantiable0[typingsSlinky.pgPromise.mod.errors.PreparedStatementError] = js.native
  // QueryFileError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryFileError.html
  var QueryFileError: Instantiable0[typingsSlinky.pgPromise.mod.errors.QueryFileError] = js.native
  // QueryResultError interface;
  // API: http://vitaly-t.github.io/pg-promise/errors.QueryResultError.html
  var QueryResultError: Instantiable0[typingsSlinky.pgPromise.mod.errors.QueryResultError] = js.native
}

object Typeoferrors {
  @scala.inline
  def apply(
    ParameterizedQueryError: Instantiable0[ParameterizedQueryError],
    PreparedStatementError: Instantiable0[PreparedStatementError],
    QueryFileError: Instantiable0[QueryFileError],
    QueryResultError: Instantiable0[QueryResultError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(ParameterizedQueryError = ParameterizedQueryError.asInstanceOf[js.Any], PreparedStatementError = PreparedStatementError.asInstanceOf[js.Any], QueryFileError = QueryFileError.asInstanceOf[js.Any], QueryResultError = QueryResultError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoferrors]
  }
  @scala.inline
  implicit class TypeoferrorsOps[Self <: Typeoferrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterizedQueryError(value: Instantiable0[ParameterizedQueryError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterizedQueryError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreparedStatementError(value: Instantiable0[PreparedStatementError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreparedStatementError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryFileError(value: Instantiable0[QueryFileError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryFileError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryResultError(value: Instantiable0[QueryResultError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryResultError")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

