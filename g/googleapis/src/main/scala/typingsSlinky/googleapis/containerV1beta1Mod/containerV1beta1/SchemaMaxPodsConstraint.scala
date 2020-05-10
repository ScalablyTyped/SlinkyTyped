package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constraints applied to pods.
  */
@js.native
trait SchemaMaxPodsConstraint extends js.Object {
  /**
    * Constraint enforced on the max num of pods per node.
    */
  var maxPodsPerNode: js.UndefOr[String] = js.native
}

object SchemaMaxPodsConstraint {
  @scala.inline
  def apply(): SchemaMaxPodsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaxPodsConstraint]
  }
  @scala.inline
  implicit class SchemaMaxPodsConstraintOps[Self <: SchemaMaxPodsConstraint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxPodsPerNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPodsPerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPodsPerNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPodsPerNode")(js.undefined)
        ret
    }
  }
  
}

