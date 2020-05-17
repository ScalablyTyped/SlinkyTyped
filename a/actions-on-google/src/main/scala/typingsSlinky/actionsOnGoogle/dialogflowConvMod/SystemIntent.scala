package typingsSlinky.actionsOnGoogle.dialogflowConvMod

import typingsSlinky.actionsOnGoogle.anon.ProtoAnystringJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemIntent extends js.Object {
  var data: ProtoAnystringJsonObject = js.native
  var intent: String = js.native
}

object SystemIntent {
  @scala.inline
  def apply(data: ProtoAnystringJsonObject, intent: String): SystemIntent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemIntent]
  }
  @scala.inline
  implicit class SystemIntentOps[Self <: SystemIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: ProtoAnystringJsonObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

