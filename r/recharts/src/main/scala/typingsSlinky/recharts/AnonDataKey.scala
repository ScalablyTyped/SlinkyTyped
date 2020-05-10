package typingsSlinky.recharts

import typingsSlinky.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDataKey extends js.Object {
  var dataKey: String | Double | RechartsFunction = js.native
}

object AnonDataKey {
  @scala.inline
  def apply(dataKey: String | Double | RechartsFunction): AnonDataKey = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataKey]
  }
  @scala.inline
  implicit class AnonDataKeyOps[Self <: AnonDataKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataKeyFunction1(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataKey(value: String | Double | RechartsFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

