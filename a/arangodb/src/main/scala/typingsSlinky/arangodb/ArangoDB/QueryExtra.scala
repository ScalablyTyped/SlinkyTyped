package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.anon.ExecutionTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExtra extends js.Object {
  var stats: ExecutionTime = js.native
  var warnings: js.Array[String] = js.native
}

object QueryExtra {
  @scala.inline
  def apply(stats: ExecutionTime, warnings: js.Array[String]): QueryExtra = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExtra]
  }
  @scala.inline
  implicit class QueryExtraOps[Self <: QueryExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStats(value: ExecutionTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

