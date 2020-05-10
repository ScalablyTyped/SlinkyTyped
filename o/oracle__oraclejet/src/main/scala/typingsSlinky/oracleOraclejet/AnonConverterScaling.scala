package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.billion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.million
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConverterScaling extends js.Object {
  var converter: js.Object = js.native
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto = js.native
}

object AnonConverterScaling {
  @scala.inline
  def apply(converter: js.Object, scaling: none | thousand | million | billion | trillion | quadrillion | auto): AnonConverterScaling = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConverterScaling]
  }
  @scala.inline
  implicit class AnonConverterScalingOps[Self <: AnonConverterScaling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverter(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaling")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

