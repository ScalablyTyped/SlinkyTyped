package typingsSlinky.reactContentLoader.mod

import org.scalajs.dom.raw.SVGElement
import typingsSlinky.react.mod.SVGAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentLoaderProps extends SVGAttributes[SVGElement] {
  var animate: js.UndefOr[Boolean] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var gradientRatio: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var primaryColor: js.UndefOr[String] = js.undefined
  var primaryOpacity: js.UndefOr[Double] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryOpacity: js.UndefOr[Double] = js.undefined
  @JSName("speed")
  var speed_IContentLoaderProps: js.UndefOr[Double] = js.undefined
  var uniquekey: js.UndefOr[String] = js.undefined
}

object IContentLoaderProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[SVGElement] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    baseUrl: String = null,
    gradientRatio: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    primaryColor: String = null,
    primaryOpacity: js.UndefOr[Double] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null,
    secondaryOpacity: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    uniquekey: String = null
  ): IContentLoaderProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientRatio)) __obj.updateDynamic("gradientRatio")(gradientRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryOpacity)) __obj.updateDynamic("primaryOpacity")(primaryOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryOpacity)) __obj.updateDynamic("secondaryOpacity")(secondaryOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (uniquekey != null) __obj.updateDynamic("uniquekey")(uniquekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLoaderProps]
  }
}

