package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ClientSession
import typingsSlinky.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.native
  var nameOnly: js.UndefOr[Boolean] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object BatchSize {
  @scala.inline
  def apply(): BatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSize]
  }
  @scala.inline
  implicit class BatchSizeOps[Self <: BatchSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNameOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReadPreference(value: ReadPreferenceOrMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
  }
  
}

