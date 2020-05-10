package typingsSlinky.googleCloudDatastore.queryMod

import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.eventual
import typingsSlinky.googleCloudDatastore.googleCloudDatastoreStrings.strong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var consistency: js.UndefOr[strong | eventual] = js.native
  var maxApiCalls: js.UndefOr[Double] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsistency(value: strong | eventual): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsistency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consistency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxApiCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApiCalls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxApiCalls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxApiCalls")(js.undefined)
        ret
    }
  }
  
}

