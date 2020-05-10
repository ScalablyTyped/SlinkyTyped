package typingsSlinky.googleapis

import typingsSlinky.googleapis.v3Mod.analyticsV3.SchemaIncludeConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExcludeConditions extends js.Object {
  var excludeConditions: js.UndefOr[AnonExclusionDuration] = js.native
  var includeConditions: js.UndefOr[SchemaIncludeConditions] = js.native
}

object AnonExcludeConditions {
  @scala.inline
  def apply(): AnonExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExcludeConditions]
  }
  @scala.inline
  implicit class AnonExcludeConditionsOps[Self <: AnonExcludeConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeConditions(value: AnonExclusionDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeConditions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeConditions(value: SchemaIncludeConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeConditions")(js.undefined)
        ret
    }
  }
  
}

