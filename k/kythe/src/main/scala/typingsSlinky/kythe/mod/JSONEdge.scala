package typingsSlinky.kythe.mod

import typingsSlinky.kythe.kytheStrings.Slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEdge extends js.Object {
  var edge_kind: EdgeKind | OrdinalEdge = js.native
  var fact_name: Slash = js.native
  var source: VName = js.native
  var target: VName = js.native
}

object JSONEdge {
  @scala.inline
  def apply(edge_kind: EdgeKind | OrdinalEdge, fact_name: Slash, source: VName, target: VName): JSONEdge = {
    val __obj = js.Dynamic.literal(edge_kind = edge_kind.asInstanceOf[js.Any], fact_name = fact_name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEdge]
  }
  @scala.inline
  implicit class JSONEdgeOps[Self <: JSONEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge_kind(value: EdgeKind | OrdinalEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge_kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFact_name(value: Slash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fact_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: VName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: VName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

