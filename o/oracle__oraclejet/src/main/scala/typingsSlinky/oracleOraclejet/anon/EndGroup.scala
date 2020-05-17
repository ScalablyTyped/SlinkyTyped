package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndGroup
  extends /* key */ StringDictionary[js.Any] {
  var endGroup: String = js.native
  var items: js.Array[String] = js.native
  var selectionData: js.Array[GroupData] = js.native
  var startGroup: String = js.native
  var xMax: Double = js.native
  var xMin: Double = js.native
  var yMax: Double = js.native
  var yMin: Double = js.native
}

object EndGroup {
  @scala.inline
  def apply(
    endGroup: String,
    items: js.Array[String],
    selectionData: js.Array[GroupData],
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double
  ): EndGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionData = selectionData.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndGroup]
  }
  @scala.inline
  implicit class EndGroupOps[Self <: EndGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectionData(value: js.Array[GroupData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

