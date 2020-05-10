package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.E
import typingsSlinky.qlik.qlikStrings.N
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.T
import typingsSlinky.qlik.qlikStrings.U
import typingsSlinky.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxPivotValuePoint extends js.Object {
  var qAttrExps: NxAttributeExpressionValues = js.native
  var qLabel: js.UndefOr[String] = js.native
  var qNum: Double = js.native
  var qText: String = js.native
  var qType: V | E | N | T | P | R | U = js.native
}

object NxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: Double,
    qText: String,
    qType: V | E | N | T | P | R | U
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotValuePoint]
  }
  @scala.inline
  implicit class NxPivotValuePointOps[Self <: NxPivotValuePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQAttrExps(value: NxAttributeExpressionValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qAttrExps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQType(value: V | E | N | T | P | R | U): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLabel")(js.undefined)
        ret
    }
  }
  
}

