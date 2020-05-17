package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.LifecycleRule
import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules extends js.Object {
  var res: NormalSuccessResponse = js.native
  var rules: js.Array[LifecycleRule] = js.native
}

object Rules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[LifecycleRule]): Rules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  @scala.inline
  implicit class RulesOps[Self <: Rules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRules(value: js.Array[LifecycleRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

