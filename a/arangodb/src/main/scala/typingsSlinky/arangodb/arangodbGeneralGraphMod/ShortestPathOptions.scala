package typingsSlinky.arangodb.arangodbGeneralGraphMod

import typingsSlinky.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortestPathOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[EdgeDirection] = js.native
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var endVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var startVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  var weight: js.UndefOr[String] = js.native
}

object ShortestPathOptions {
  @scala.inline
  def apply(): ShortestPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortestPathOptions]
  }
  @scala.inline
  implicit class ShortestPathOptionsOps[Self <: ShortestPathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWeight")(js.undefined)
        ret
    }
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
    def withEndVertexCollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endVertexCollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndVertexCollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endVertexCollectionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withStartVertexCollectionRestriction(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVertexCollectionRestriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartVertexCollectionRestriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startVertexCollectionRestriction")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

