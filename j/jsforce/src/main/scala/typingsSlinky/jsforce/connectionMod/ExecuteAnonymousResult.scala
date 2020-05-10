package typingsSlinky.jsforce.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteAnonymousResult extends js.Object {
  var column: Double = js.native
  var compileProblem: String = js.native
  var compiled: Boolean = js.native
  var exceptionMessage: String = js.native
  var exceptionStackTrace: String = js.native
  var line: Double = js.native
  var success: Boolean = js.native
}

object ExecuteAnonymousResult {
  @scala.inline
  def apply(
    column: Double,
    compileProblem: String,
    compiled: Boolean,
    exceptionMessage: String,
    exceptionStackTrace: String,
    line: Double,
    success: Boolean
  ): ExecuteAnonymousResult = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compileProblem = compileProblem.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], exceptionMessage = exceptionMessage.asInstanceOf[js.Any], exceptionStackTrace = exceptionStackTrace.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteAnonymousResult]
  }
  @scala.inline
  implicit class ExecuteAnonymousResultOps[Self <: ExecuteAnonymousResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompileProblem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compileProblem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompiled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compiled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptionMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptionStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionStackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

