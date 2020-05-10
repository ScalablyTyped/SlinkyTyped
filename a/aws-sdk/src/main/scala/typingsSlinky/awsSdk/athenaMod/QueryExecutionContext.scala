package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionContext extends js.Object {
  /**
    * The name of the database.
    */
  var Database: js.UndefOr[DatabaseString] = js.native
}

object QueryExecutionContext {
  @scala.inline
  def apply(): QueryExecutionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionContext]
  }
  @scala.inline
  implicit class QueryExecutionContextOps[Self <: QueryExecutionContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: DatabaseString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(js.undefined)
        ret
    }
  }
  
}

