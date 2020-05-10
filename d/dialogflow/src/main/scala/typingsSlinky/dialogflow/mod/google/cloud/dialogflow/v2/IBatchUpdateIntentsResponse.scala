package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BatchUpdateIntentsResponse. */
@js.native
trait IBatchUpdateIntentsResponse extends js.Object {
  /** BatchUpdateIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.native
}

object IBatchUpdateIntentsResponse {
  @scala.inline
  def apply(): IBatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBatchUpdateIntentsResponse]
  }
  @scala.inline
  implicit class IBatchUpdateIntentsResponseOps[Self <: IBatchUpdateIntentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntents(value: js.Array[IIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(js.undefined)
        ret
    }
    @scala.inline
    def withIntentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intents")(null)
        ret
    }
  }
  
}

