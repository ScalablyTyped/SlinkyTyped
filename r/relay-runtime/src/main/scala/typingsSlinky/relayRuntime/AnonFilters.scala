package typingsSlinky.relayRuntime

import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilters extends js.Object {
  var filters: js.UndefOr[Variables] = js.native
  var key: String = js.native
  var rangeBehavior: String = js.native
}

object AnonFilters {
  @scala.inline
  def apply(key: String, rangeBehavior: String): AnonFilters = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], rangeBehavior = rangeBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilters]
  }
  @scala.inline
  implicit class AnonFiltersOps[Self <: AnonFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangeBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

