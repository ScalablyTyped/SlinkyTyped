package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topology selector term represents the result of label queries. A null or empty topology
  * selector term matches no objects. The requirements of them are ANDed. It provides a subset of
  * functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
  */
@js.native
trait TopologySelectorTerm extends js.Object {
  /**
    * A list of topology selector requirements by labels.
    */
  var matchLabelExpressions: js.UndefOr[Input[js.Array[Input[TopologySelectorLabelRequirement]]]] = js.native
}

object TopologySelectorTerm {
  @scala.inline
  def apply(): TopologySelectorTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologySelectorTerm]
  }
  @scala.inline
  implicit class TopologySelectorTermOps[Self <: TopologySelectorTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchLabelExpressions(value: Input[js.Array[Input[TopologySelectorLabelRequirement]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchLabelExpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchLabelExpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchLabelExpressions")(js.undefined)
        ret
    }
  }
  
}

