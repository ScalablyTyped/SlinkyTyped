package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var Source: CodeGenIdentifier = js.native
  /**
    * The ID of the node at which the edge ends.
    */
  var Target: CodeGenIdentifier = js.native
  /**
    * The target of the edge.
    */
  var TargetParameter: js.UndefOr[CodeGenArgName] = js.native
}

object CodeGenEdge {
  @scala.inline
  def apply(Source: CodeGenIdentifier, Target: CodeGenIdentifier): CodeGenEdge = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenEdge]
  }
  @scala.inline
  implicit class CodeGenEdgeOps[Self <: CodeGenEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: CodeGenIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: CodeGenIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetParameter(value: CodeGenArgName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetParameter")(js.undefined)
        ret
    }
  }
  
}

