package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedAttributes extends js.Object {
  var AutoMLJobObjective: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  /**
    * The problem type.
    */
  var ProblemType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProblemType] = js.native
}

object ResolvedAttributes {
  @scala.inline
  def apply(): ResolvedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedAttributes]
  }
  @scala.inline
  implicit class ResolvedAttributesOps[Self <: ResolvedAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoMLJobObjective(value: AutoMLJobObjective): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMLJobObjective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoMLJobObjective")(js.undefined)
        ret
    }
    @scala.inline
    def withCompletionCriteria(value: AutoMLJobCompletionCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompletionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompletionCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withProblemType(value: ProblemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProblemType")(js.undefined)
        ret
    }
  }
  
}

