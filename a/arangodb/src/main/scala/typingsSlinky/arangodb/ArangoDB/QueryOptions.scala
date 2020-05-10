package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.native
  var count: js.UndefOr[Boolean] = js.native
  var failOnWarning: js.UndefOr[Boolean] = js.native
  var fullCount: js.UndefOr[Boolean] = js.native
  var intermediateCommitCount: js.UndefOr[Double] = js.native
  var intermediateCommitSize: js.UndefOr[Double] = js.native
  var maxNumberOfPlans: js.UndefOr[Double] = js.native
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.native
  var maxWarningCount: js.UndefOr[Double] = js.native
  var memoryLimit: js.UndefOr[Double] = js.native
  var profile: js.UndefOr[Boolean] = js.native
  // enterprise
  var skipInaccessibleCollections: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[Boolean] = js.native
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
    def withCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnWarning")(js.undefined)
        ret
    }
    @scala.inline
    def withFullCount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIntermediateCommitCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediateCommitCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitCount")(js.undefined)
        ret
    }
    @scala.inline
    def withIntermediateCommitSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntermediateCommitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intermediateCommitSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxNumberOfPlans(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberOfPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxNumberOfPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumberOfPlans")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTransactionsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransactionsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTransactionsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTransactionsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWarningCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWarningCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWarningCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWarningCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMemoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipInaccessibleCollections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInaccessibleCollections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipInaccessibleCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipInaccessibleCollections")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

