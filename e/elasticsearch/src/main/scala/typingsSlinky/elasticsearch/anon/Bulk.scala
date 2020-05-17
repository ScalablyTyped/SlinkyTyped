package typingsSlinky.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bulk extends js.Object {
  var bulk: Double = js.native
  var search: Double = js.native
}

object Bulk {
  @scala.inline
  def apply(bulk: Double, search: Double): Bulk = {
    val __obj = js.Dynamic.literal(bulk = bulk.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bulk]
  }
  @scala.inline
  implicit class BulkOps[Self <: Bulk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulk(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

