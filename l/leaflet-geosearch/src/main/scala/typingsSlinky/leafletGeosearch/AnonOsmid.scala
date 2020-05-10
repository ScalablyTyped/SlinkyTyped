package typingsSlinky.leafletGeosearch

import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.node
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.relation
import typingsSlinky.leafletGeosearch.leafletGeosearchStrings.way
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOsmid extends js.Object {
  var osm_id: js.UndefOr[Double] = js.native
  var osm_type: js.UndefOr[node | way | relation] = js.native
}

object AnonOsmid {
  @scala.inline
  def apply(): AnonOsmid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonOsmid]
  }
  @scala.inline
  implicit class AnonOsmidOps[Self <: AnonOsmid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOsm_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osm_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsm_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osm_id")(js.undefined)
        ret
    }
    @scala.inline
    def withOsm_type(value: node | way | relation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osm_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOsm_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osm_type")(js.undefined)
        ret
    }
  }
  
}

