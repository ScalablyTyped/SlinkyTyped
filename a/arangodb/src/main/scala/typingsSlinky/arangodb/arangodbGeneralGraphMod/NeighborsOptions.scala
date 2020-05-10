package typingsSlinky.arangodb.arangodbGeneralGraphMod

import typingsSlinky.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NeighborsOptions extends js.Object {
  var direction: js.UndefOr[EdgeDirection] = js.native
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var edgeExamples: js.UndefOr[Example] = js.native
  var maxDepth: js.UndefOr[Double] = js.native
  var minDepth: js.UndefOr[Double] = js.native
  var neighborExamples: js.UndefOr[Example] = js.native
  var vertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
}

object NeighborsOptions {
  @scala.inline
  def apply(): NeighborsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NeighborsOptions]
  }
  @scala.inline
  implicit class NeighborsOptionsOps[Self <: NeighborsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: EdgeDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeCollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeCollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeCollectionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeExamples(value: Example): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeExamplesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeExamples")(null)
        ret
    }
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeighborExamples(value: Example): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborExamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeighborExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborExamples")(js.undefined)
        ret
    }
    @scala.inline
    def withNeighborExamplesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborExamples")(null)
        ret
    }
    @scala.inline
    def withVertexCollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexCollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCollectionRestriction")(js.undefined)
        ret
    }
  }
  
}

