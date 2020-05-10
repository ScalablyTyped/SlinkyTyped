package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlmGetLifecycle extends Generic {
  var policy_id: js.UndefOr[String | js.Array[String]] = js.native
}

object SlmGetLifecycle {
  @scala.inline
  def apply(): SlmGetLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmGetLifecycle]
  }
  @scala.inline
  implicit class SlmGetLifecycleOps[Self <: SlmGetLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicy_id(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy_id")(js.undefined)
        ret
    }
  }
  
}

