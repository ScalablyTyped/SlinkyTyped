package typingsSlinky.d3pie

import typingsSlinky.d3pie.d3pieStrings.`label-percentage1`
import typingsSlinky.d3pie.d3pieStrings.`label-percentage2`
import typingsSlinky.d3pie.d3pieStrings.`label-value1`
import typingsSlinky.d3pie.d3pieStrings.`label-value2`
import typingsSlinky.d3pie.d3pieStrings.label
import typingsSlinky.d3pie.d3pieStrings.percentage
import typingsSlinky.d3pie.d3pieStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  pieDistance ? :number} & d3pie.d3pie.ID3PieLabelsOptions */
@js.native
trait pieDistancenumberID3PieLa extends js.Object {
  var format: js.UndefOr[
    label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
  ] = js.native
  var hideWhenLessThanPercentage: js.UndefOr[Double] = js.native
  var pieDistance: js.UndefOr[Double] = js.native
}

object pieDistancenumberID3PieLa {
  @scala.inline
  def apply(): pieDistancenumberID3PieLa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieDistancenumberID3PieLa]
  }
  @scala.inline
  implicit class pieDistancenumberID3PieLaOps[Self <: pieDistancenumberID3PieLa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(
      value: label | value | percentage | `label-value1` | `label-value2` | `label-percentage1` | `label-percentage2`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHideWhenLessThanPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenLessThanPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideWhenLessThanPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWhenLessThanPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withPieDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPieDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pieDistance")(js.undefined)
        ret
    }
  }
  
}

