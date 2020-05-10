package typingsSlinky.pubnub

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActions extends js.Object {
  var actions: StringDictionary[StringDictionary[js.Array[AnonActionTimetoken]]] = js.native
  var message: js.Any = js.native
  var meta: js.UndefOr[StringDictionary[js.Any]] = js.native
  var timetoken: String | Double = js.native
}

object AnonActions {
  @scala.inline
  def apply(
    actions: StringDictionary[StringDictionary[js.Array[AnonActionTimetoken]]],
    message: js.Any,
    timetoken: String | Double
  ): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
  @scala.inline
  implicit class AnonActionsOps[Self <: AnonActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: StringDictionary[StringDictionary[js.Array[AnonActionTimetoken]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimetoken(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timetoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
  }
  
}

