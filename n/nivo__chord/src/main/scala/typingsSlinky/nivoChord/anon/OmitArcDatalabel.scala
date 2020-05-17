package typingsSlinky.nivoChord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/chord.Omit<@nivo/chord.@nivo/chord.ArcData, 'label'> */
@js.native
trait OmitArcDatalabel extends js.Object {
  var color: String = js.native
  var endAngle: Double = js.native
  var formattedValue: Double | String = js.native
  var id: String = js.native
  var index: Double = js.native
  var startAngle: Double = js.native
  var value: Double = js.native
}

object OmitArcDatalabel {
  @scala.inline
  def apply(
    color: String,
    endAngle: Double,
    formattedValue: Double | String,
    id: String,
    index: Double,
    startAngle: Double,
    value: Double
  ): OmitArcDatalabel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitArcDatalabel]
  }
  @scala.inline
  implicit class OmitArcDatalabelOps[Self <: OmitArcDatalabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedValue(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

