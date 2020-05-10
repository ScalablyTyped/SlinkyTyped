package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateByExampleOptions extends js.Object {
  var keepNull: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var mergeObjects: js.UndefOr[Boolean] = js.native
  var waitForSync: js.UndefOr[Boolean] = js.native
}

object UpdateByExampleOptions {
  @scala.inline
  def apply(): UpdateByExampleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateByExampleOptions]
  }
  @scala.inline
  implicit class UpdateByExampleOptionsOps[Self <: UpdateByExampleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeepNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNull")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeObjects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeObjects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeObjects")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitForSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForSync")(js.undefined)
        ret
    }
  }
  
}

