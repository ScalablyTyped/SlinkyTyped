package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptDagEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var source: String = js.native
  /**
    * The ID of the node at which the edge ends.
    */
  var target: String = js.native
  /**
    * The target of the edge.
    */
  var targetParameter: js.UndefOr[String] = js.native
}

object GetScriptDagEdge {
  @scala.inline
  def apply(source: String, target: String): GetScriptDagEdge = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagEdge]
  }
  @scala.inline
  implicit class GetScriptDagEdgeOps[Self <: GetScriptDagEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetParameter")(js.undefined)
        ret
    }
  }
  
}

