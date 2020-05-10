package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchOrchestratorFilter extends js.Object {
  /**
    * The key for the filter.
    */
  var Key: js.UndefOr[PatchOrchestratorFilterKey] = js.native
  /**
    * The value for the filter.
    */
  var Values: js.UndefOr[PatchOrchestratorFilterValues] = js.native
}

object PatchOrchestratorFilter {
  @scala.inline
  def apply(): PatchOrchestratorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOrchestratorFilter]
  }
  @scala.inline
  implicit class PatchOrchestratorFilterOps[Self <: PatchOrchestratorFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: PatchOrchestratorFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: PatchOrchestratorFilterValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

