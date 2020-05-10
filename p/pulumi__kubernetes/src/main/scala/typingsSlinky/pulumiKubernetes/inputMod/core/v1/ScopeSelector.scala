package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A scope selector represents the AND of the selectors represented by the scoped-resource
  * selector requirements.
  */
@js.native
trait ScopeSelector extends js.Object {
  /**
    * A list of scope selector requirements by scope of the resources.
    */
  var matchExpressions: js.UndefOr[Input[js.Array[Input[ScopedResourceSelectorRequirement]]]] = js.native
}

object ScopeSelector {
  @scala.inline
  def apply(): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSelector]
  }
  @scala.inline
  implicit class ScopeSelectorOps[Self <: ScopeSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchExpressions(value: Input[js.Array[Input[ScopedResourceSelectorRequirement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchExpressions")(js.undefined)
        ret
    }
  }
  
}

