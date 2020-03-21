package typingsSlinky.reactImgix.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLSourceElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.facade.ReactRef
import slinky.web.html.img.tag
import typingsSlinky.reactImgix.mod.AttributeConfig
import typingsSlinky.reactImgix.mod.ImgixHTMLAttributes
import typingsSlinky.reactImgix.mod.ImigixParams
import typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps
import typingsSlinky.std.HTMLPictureElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SharedImigixAndSourceProps_308637647[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, sizes */
  def apply(
    src: String,
    attributeConfig: AttributeConfig = null,
    disableLibraryParam: js.UndefOr[Boolean] = js.undefined,
    disableQualityByDPR: js.UndefOr[Boolean] = js.undefined,
    disableSrcSet: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    htmlAttributes: ImgixHTMLAttributes = null,
    imgixParams: ImigixParams = null,
    onMounted: /* ref */ js.UndefOr[ReactRef[HTMLPictureElement | HTMLImageElement | HTMLSourceElement]] => Unit = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (attributeConfig != null) __obj.updateDynamic("attributeConfig")(attributeConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLibraryParam)) __obj.updateDynamic("disableLibraryParam")(disableLibraryParam.asInstanceOf[js.Any])
    if (!js.isUndefined(disableQualityByDPR)) __obj.updateDynamic("disableQualityByDPR")(disableQualityByDPR.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSrcSet)) __obj.updateDynamic("disableSrcSet")(disableSrcSet.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (imgixParams != null) __obj.updateDynamic("imgixParams")(imgixParams.asInstanceOf[js.Any])
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction1(onMounted))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SharedImigixAndSourceProps
}

