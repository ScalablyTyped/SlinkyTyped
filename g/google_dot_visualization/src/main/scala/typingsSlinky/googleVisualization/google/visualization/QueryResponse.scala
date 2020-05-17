package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResponse extends js.Object {
  def getDataTable(): DataTable = js.native
  def getDetailedMessage(): String = js.native
  def getMessage(): String = js.native
  def getReasons(): js.Array[String] = js.native
  def hasWarning(): Boolean = js.native
  def isError(): Boolean = js.native
}

object QueryResponse {
  @scala.inline
  def apply(
    getDataTable: () => DataTable,
    getDetailedMessage: () => String,
    getMessage: () => String,
    getReasons: () => js.Array[String],
    hasWarning: () => Boolean,
    isError: () => Boolean
  ): QueryResponse = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable), getDetailedMessage = js.Any.fromFunction0(getDetailedMessage), getMessage = js.Any.fromFunction0(getMessage), getReasons = js.Any.fromFunction0(getReasons), hasWarning = js.Any.fromFunction0(hasWarning), isError = js.Any.fromFunction0(isError))
    __obj.asInstanceOf[QueryResponse]
  }
  @scala.inline
  implicit class QueryResponseOps[Self <: QueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataTable(value: () => DataTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDetailedMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDetailedMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReasons(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReasons")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasWarning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasWarning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isError")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

