package typingsSlinky.antd.circleMod

import slinky.core.TagMod
import typingsSlinky.antd.antdStrings.active
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.butt
import typingsSlinky.antd.antdStrings.exception
import typingsSlinky.antd.antdStrings.left
import typingsSlinky.antd.antdStrings.normal
import typingsSlinky.antd.antdStrings.right
import typingsSlinky.antd.antdStrings.round
import typingsSlinky.antd.antdStrings.square
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.antd.progressProgressMod.ProgressGradient
import typingsSlinky.antd.progressProgressMod.ProgressProps
import typingsSlinky.antd.progressProgressMod.ProgressSize
import typingsSlinky.antd.progressProgressMod.ProgressType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleProps extends ProgressProps {
  var children: TagMod[Any]
  @JSName("prefixCls")
  var prefixCls_CircleProps: String
  var progressStatus: String
}

object CircleProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    prefixCls: String,
    progressStatus: String,
    className: String = null,
    format: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => TagMod[Any] = null,
    gapDegree: Int | Double = null,
    gapPosition: top | bottom | left | right = null,
    percent: Int | Double = null,
    showInfo: js.UndefOr[Boolean] = js.undefined,
    size: ProgressSize = null,
    status: normal | exception | active | success = null,
    steps: Int | Double = null,
    strokeColor: String | ProgressGradient = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null,
    successPercent: Int | Double = null,
    trailColor: String = null,
    `type`: ProgressType = null,
    width: Int | Double = null
  ): CircleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], progressStatus = progressStatus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (!js.isUndefined(showInfo)) __obj.updateDynamic("showInfo")(showInfo.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (successPercent != null) __obj.updateDynamic("successPercent")(successPercent.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
}

