package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesData extends js.Object {
  /** Defines whether the BPMN data object is a collection or not
    * @Default {false}
    */
  var collection: js.UndefOr[Boolean] = js.native
  /** Sets the type of the BPMN Data object
    * @Default {ej.datavisualization.Diagram.BPMNDataObjects.None}
    */
  var `type`: js.UndefOr[BPMNDataObjects | String] = js.native
}

object NodesData {
  @scala.inline
  def apply(): NodesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesData]
  }
  @scala.inline
  implicit class NodesDataOps[Self <: NodesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BPMNDataObjects | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

