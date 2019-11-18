package typingsSlinky.antd

import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.circle
import typingsSlinky.antd.antdStrings.dashboard
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.line
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var format: Requireable[js.Function1[/* repeated */ _, _]]
  var gapDegree: Requireable[Double]
  var percent: Requireable[Double]
  var showInfo: Requireable[Boolean]
  var status: Requireable[normal | active | success | exception]
  var strokeColor: Requireable[String | js.Object]
  var strokeLinecap: Requireable[String]
  var strokeWidth: Requireable[Double]
  var trailColor: Requireable[String]
  var `type`: Requireable[circle | line | dashboard]
  var width: Requireable[Double]
}

object Anon_Active {
  @scala.inline
  def apply(
    format: Requireable[js.Function1[/* repeated */ _, _]],
    gapDegree: Requireable[Double],
    percent: Requireable[Double],
    showInfo: Requireable[Boolean],
    status: Requireable[normal | active | success | exception],
    strokeColor: Requireable[String | js.Object],
    strokeLinecap: Requireable[String],
    strokeWidth: Requireable[Double],
    trailColor: Requireable[String],
    `type`: Requireable[circle | line | dashboard],
    width: Requireable[Double]
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gapDegree = gapDegree.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

