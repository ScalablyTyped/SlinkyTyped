package typingsSlinky.qlik.qlikMod

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

trait NxPivotValuePoint extends js.Object {
  var qAttrExps: NxAttributeExpressionValues
  var qLabel: js.UndefOr[String] = js.undefined
  var qNum: Double
  var qText: String
  var qType: V | E | N | T | P | R | U
}

object NxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: Double,
    qText: String,
    qType: V | E | N | T | P | R | U,
    qLabel: String = null
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotValuePoint]
  }
}

