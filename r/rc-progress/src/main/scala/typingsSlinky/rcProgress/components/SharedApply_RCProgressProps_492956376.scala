package typingsSlinky.rcProgress.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcProgress.mod.RCProgressProps
import typingsSlinky.rcProgress.rcProgressStrings.bottom
import typingsSlinky.rcProgress.rcProgressStrings.butt
import typingsSlinky.rcProgress.rcProgressStrings.left
import typingsSlinky.rcProgress.rcProgressStrings.right
import typingsSlinky.rcProgress.rcProgressStrings.round
import typingsSlinky.rcProgress.rcProgressStrings.square
import typingsSlinky.rcProgress.rcProgressStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_RCProgressProps_492956376[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    gapDegree: Int | Double = null,
    gapPosition: top | right | bottom | left = null,
    percent: Double | js.Array[Double] = null,
    prefixCls: String = null,
    strokeColor: String | js.Array[String] | js.Object = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Int | Double = null,
    trailColor: String = null,
    trailWidth: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    if (trailWidth != null) __obj.updateDynamic("trailWidth")(trailWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RCProgressProps
}

